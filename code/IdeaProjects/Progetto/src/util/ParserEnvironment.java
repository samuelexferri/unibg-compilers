package util;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class ParserEnvironment {
    public final int ERR_ON_SYNTAX = 1;
    public final int ERR_ALREADY_DECLARED = 10;
    public final int ERR_FUNC_ALREADY_DECLARED = 101;
    public final int ERR_CALL_FUNC_IN_GLOBAL = 102;
    public final int ERR_MAIN_NOT_FOUND = 103;
    public final int ERR_MAIN_TYPE_NOT_INT = 104;
    public final int ERR_UNDECLARED = 11;
    public final int ERR_FUNC_UNDECLARED = 111;
    public final int ERR_TYPE_CALL_FUNCT = 112;
    public final int ERR_TYPE_FUNCT_RETURN = 113;
    public final int ERR_TYPE_CALL_FUNCT_RETURN = 114;
    public final int ERR_NO_VALUE = 12;
    public final int ERR_NO_VALUES = 13;
    public final int ERR_DIV_BY_0 = 14;
    public final int ERR_UNDEFINED_OP = 15;
    public final int ERR_TYPE_MISMATCH = 16;

    public Hashtable<String, Value> symbolTable = null;
    public Hashtable<String, Value> symbolTableLocal = null;
    public ArrayList<String> errorList = null;
    public StringBuffer debug = null;
    public StringBuffer translation = null;

    public Token var_name; // Nome della variabile
    public String var_type; // Tipo della variabile
    public Token funct_name; // Nome della funzione
    public String funct_type; // Nome della funzione
    public Boolean is_local; // Indica se siamo all'interno di una funzione

    // TODO
    public Double exp;
    public ArrayList<Value> paramsList = new ArrayList();
    public Boolean is_global = false;
    public Boolean type_bool = false;

    FileWriter fOut;

    public ParserEnvironment(FileWriter fOutMain) {
        symbolTable = new Hashtable<String, Value>(101); // 101 numero primo
        symbolTableLocal = new Hashtable<String, Value>(101); // 101 numero primo
        errorList = new ArrayList<String>();
        debug = new StringBuffer();
        translation = new StringBuffer();
        fOut = fOutMain;
    }

    // TODO: Traduzione
    // Translation
    public void doTranslation(Value v) {
        if (v != null) {
            debug.append("Ho tradotto questa stringa: '" + v.value + "'\n");
            translation.append(v.value + "\n");
        }
    }

    // VARIABILI
    // Inserisce una variabile nelle symbol tables
    public void addNewVariable(String type, Token name) {
        if (!is_local) { // Globale
            if (type != null && name != null) {
                if (symbolTable.containsKey(name.getText()))
                    addErrorMessage(name, ERR_ALREADY_DECLARED);
                else {
                    symbolTable.put(name.getText(), new Value(name.getText(), type));
                    debug.append("Ho dichiarato la variabile '" + name.getText() + "' come '" + type + "'\n");
                }
            } else if (type == null && name != null) {
                checkDeclarationGlobal(name);
            }
        } else { // Locale
            if (type != null && name != null) {
                if (symbolTableLocal.containsKey(name.getText()))
                    addErrorMessage(name, ERR_ALREADY_DECLARED);
                else {
                    // Variabile locale può oscurare una globale
                    symbolTableLocal.put(name.getText(), new Value(name.getText(), type));
                    debug.append("Ho dichiarato la variabile locale '" + name.getText() + "' come '" + type + "'\n");
                }
            } else if (type == null && name != null) {
                checkDeclarationLocal(name);
            }
        }
    }

    // Controlla se una var è in symbol table globale
    public void checkDeclarationGlobal(Token var) {
        if (!isDeclaredGlobal(var))
            addErrorMessage(var, ERR_UNDECLARED);
    }

    // Verifica se una var è in symbol table globale (true)
    public boolean isDeclaredGlobal(Token var) {
        if (var == null)
            return false;
        return symbolTable.containsKey(var.getText());
    }

    // Controlla se una var è in symbol table globale o locale
    public void checkDeclarationLocal(Token var) {
        if (!isDeclaredLocal(var) && !isDeclaredGlobal(var))
            addErrorMessage(var, ERR_UNDECLARED);
    }

    // Verifica se una var è in symbol table (true)
    public boolean isDeclaredLocal(Token var) {
        if (var == null)
            return false;
        return symbolTableLocal.containsKey(var.getText());
    }

    // ASSEGNAMENTI
    // Restituisce il tipo di una variabile
    public String getVarType(Token var) {
        if (is_local) { // Locale
            if (isDeclaredLocal(var))
                return symbolTableLocal.get(var.getText()).type;
            else if (isDeclaredGlobal(var))
                return symbolTable.get(var.getText()).type;
            else
                return ValueTypes.UNDEFINED_STR;
        } else { // Globale
            if (isDeclaredGlobal(var))
                return symbolTable.get(var.getText()).type;
            else
                return ValueTypes.UNDEFINED_STR;
        }
    }

    // Assegna un valore ad una variabile (dichiarata)
    public void assignValue(Token name_var, Value exp, Token eq) {
        if (!is_local) { // Globale
            if (name_var != null && exp != null && eq != null) {
                if (!isDeclaredGlobal(name_var))
                    addErrorMessage(name_var, ERR_UNDECLARED);
                else {
                    Value var = symbolTable.get(name_var.getText()); // Reference
                    if (!ValueTypes.isCoherent(exp.type, var.type))
                        addErrorMessage(name_var, ERR_TYPE_MISMATCH);
                    else {
                        var.value = exp.value;
                        debug.append("Ho assegnato alla variabile '" + var.name + "' il valore '" + var.value + "'\n");
                    }
                }
            }
        } else { // Locale
            if (name_var != null && exp != null && eq != null) {
                if (!isDeclaredLocal(name_var) && !isDeclaredGlobal(name_var))
                    addErrorMessage(name_var, ERR_UNDECLARED);
                else if (isDeclaredLocal(name_var)) { // Locale
                    Value var = symbolTableLocal.get(name_var.getText()); // Reference
                    if (!ValueTypes.isCoherent(exp.type, var.type))
                        addErrorMessage(name_var, ERR_TYPE_MISMATCH);
                    else {
                        var.value = exp.value;
                        debug.append("Ho assegnato alla variabile locale '" + var.name + "' il valore '" + var.value + "'\n");
                    }
                } else { // Globale
                    Value var = symbolTable.get(name_var.getText()); // Reference
                    if (!ValueTypes.isCoherent(exp.type, var.type))
                        addErrorMessage(name_var, ERR_TYPE_MISMATCH);
                    else {
                        var.value = exp.value;
                        debug.append("Ho assegnato alla variabile '" + var.name + "' il valore '" + var.value + "'\n");
                    }
                }
            }
        }
    }

    // Valore temporaneo
    public Value setValue(Token vl, String type, String expectedType) {
        String value = vl.getText();
        if (!ValueTypes.isCoherent(type, expectedType)) {
            type = ValueTypes.UNDEFINED_STR;
            addErrorMessage(vl, ERR_TYPE_MISMATCH);
        }

        if (type.equals(ValueTypes.CHAR_STR))
            value = value.substring(1, value.length() - 1);

        if (type.equals(ValueTypes.STRING_STR))
            value = value.substring(1, value.lastIndexOf("\""));

        return new Value(type, value, false);
    }

    // Valore temporaneo per le call function
    public Value setValueCallFunction(Token vl, String type, String expectedType) {
        String value = vl.getText();
        if (!ValueTypes.isCoherent(type, expectedType)) {
            type = ValueTypes.UNDEFINED_STR;
            addErrorMessage(vl, ERR_TYPE_MISMATCH);
        }

        // TODO Fittizio per i return dop aver esguito tutti i calcoli delle funzioni
        if (type.matches(ValueTypes.INT_STR))
            return new Value(type, "777", false);
        else if (type.matches(ValueTypes.FLOAT_STR))
            return new Value(type, "777.77", false);
        else if (type.matches(ValueTypes.CHAR_STR)) {
            return new Value(type, "a", false);
        }

        return null;
    }

    // Verifica che il tipo ritornato dalla funzione e quello atteso siano coerenti
    public void checkFunctionReturnType(String func_type, String expectedType) {
        if (func_type.matches("void"))
            return;

        if (!func_type.matches(expectedType))
            addErrorMessage(Token.SKIP_TOKEN, ERR_TYPE_FUNCT_RETURN); // Token inutile
    }

    // Verifica che il tipo ritornato dalla chiamata funzione e quello atteso siano coerenti
    public void checkCallFunctionReturnType(String func_type, String expectedType) {
        if (!func_type.matches(expectedType))
            addErrorMessage(Token.SKIP_TOKEN, ERR_TYPE_CALL_FUNCT_RETURN); // Token inutile
    }

    // Recupera il valore di una variabile dichiarata
    public Value getDeclaredValue(Token var, String expectedType) {
        Value value = null;

        if (!is_local) { // Globale
            if (!isDeclaredGlobal(var)) {
                addErrorMessage(var, ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else {
                value = symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symboltable
                if (!value.isInitialized())
                    addErrorMessage(var, ERR_NO_VALUE);
                if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            }
        } else { // Locale
            if (!isDeclaredLocal(var) && !isDeclaredGlobal(var)) {
                addErrorMessage(var, ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else if (isDeclaredLocal(var)) {
                value = symbolTableLocal.get(var.getText());  // Recupero il valore della variabile dalla symboltable
                if (!value.isInitialized())
                    addErrorMessage(var, ERR_NO_VALUE);
                if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            } else {
                value = symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symboltable
                if (!value.isInitialized())
                    addErrorMessage(var, ERR_NO_VALUE);
                if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            }
        }

        return value;
    }

    // FUNZIONI
    // Symbol table locale stampata e in seguito ripulita
    public void clearSymbolTableLocal() {
        try {
            fOut.append("\n-----------------------------------------\n" + "*****\tLocal Symbol Table: " + funct_name.getText() + "\t*****\n" + "-----------------------------------------\n");
            System.out.println("\n-----------------------------------------\n" + "*****\tLocal Symbol Table: " + funct_name.getText() + "\t*****\n" + "-----------------------------------------\n");

            Enumeration<String> varList2 = symbolTableLocal.keys();
            int v = 0;
            while (varList2.hasMoreElements()) {
                String var = varList2.nextElement();
                Object value = symbolTableLocal.get(var);
                fOut.append(++v + ":\t" + var + "=" + value + "\n");
                System.out.println(v + ":\t" + var + "=" + value);
            }
            symbolTableLocal.clear();
        } catch (IOException i) {
            System.out.println("IOException");
        }
    }

    // Inserisce una funzione nella symbol table gloable
    public void addFunction(String type, Token name) {
        if (type != null && name != null) {
            if (symbolTable.containsKey(name.getText()))
                addErrorMessage(name, ERR_FUNC_ALREADY_DECLARED);
            else {
                symbolTable.put(name.getText(), new Value(name.getText(), type, null, false));
                debug.append("Ho dichiarato la funzione '" + name.getText() + "' con tipo '" + type + "'\n");
            }
        } else if (type == null && name != null && !is_local) {
            addErrorMessage(name, ERR_CALL_FUNC_IN_GLOBAL);
        } else if (type == null && name != null && is_local) {
            checkDeclaratioFunction(name);
        }
    }

    // Controlla se una funzione è in symbol table globale
    public void checkDeclaratioFunction(Token var) {
        if (!isDeclaredFunction(var))
            addErrorMessage(var, ERR_FUNC_UNDECLARED);
    }

    // Verifica se una funzione è in symbol table (true)
    public boolean isDeclaredFunction(Token var) {
        if (var == null)
            return false;

        if (symbolTable.containsKey(var.getText())) {
            Value func = symbolTable.get(var.getText());
            return !func.isVar;
        } else
            return false;
    }

    // Verifica se è stato definito il main
    public void checkMain(Token tk) {
        if (!symbolTable.containsKey("main")) {
            addErrorMessage(tk, ERR_MAIN_NOT_FOUND);
            return;
        }

        Value var = symbolTable.get("main");
        System.out.println(var.type);

        if (!var.type.matches("int"))
            addErrorMessage(tk, ERR_MAIN_TYPE_NOT_INT);
    }

    // Verifica una chiamata di funzione
    public void checkCallFunction(String type, Token name) {
        if (type != null)
            addErrorMessage(name, ERR_TYPE_CALL_FUNCT);
        else {
            if (!symbolTable.containsKey(name.getText())) {
                addErrorMessage(name, ERR_FUNC_UNDECLARED);
            }
        }
    }

    // OPERAZIONI
    // Concatenazione di char/stringhe
    public Value concat(Value v1, Value v2) {
        if (v1 == null || v2 == null)
            return null;

        Value value = new Value(v1.type, (v1.value + v2.value), false);
        return value;
    }

    // Esegue l'operazione +
    public Value doAdd(Token op, Value v1, Value v2) {
        if (op == null || v1 == null || v2 == null)
            return null;

        String value = "";
        String type = ValueTypes.returnType("+", v1.type, v2.type);

        if (type.equals(ValueTypes.UNDEFINED_STR)) {
            addErrorMessage(op, ERR_UNDEFINED_OP);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }

        if (!v1.isInitialized() || !v2.isInitialized()) {
            addErrorMessage(op, ERR_NO_VALUES);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }

        if (type.equals(ValueTypes.CHAR_STR) || type.equals(ValueTypes.CHAR_STR)) {
            return concat(v1, v2); // Concatenazione tra char
        }
        else {
            if (type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR))
                value = v1.value + v2.value; // Concatenazione tra stringhe
            else if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
                value = new Float(Float.parseFloat(v1.value) + Float.parseFloat(v2.value)).toString();
            else if (type.equals(ValueTypes.INT_STR))
                value = new Integer(Integer.parseInt(v1.value) + Integer.parseInt(v2.value)).toString();

            return new Value(type, value, false);
        }
    }

    // Esegue l'operazione -
    public Value doSub(Token op, Value v1, Value v2) {
        if (op == null || v1 == null || v2 == null)
            return null;

        String value;
        String type = ValueTypes.returnType("-", v1.type, v2.type);

        if (type.equals(ValueTypes.UNDEFINED_STR) || type.equals(ValueTypes.CHAR_STR) || type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR)) {
            addErrorMessage(op, ERR_UNDEFINED_OP);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }

        if (!v1.isInitialized() || !v2.isInitialized()) {
            addErrorMessage(op, ERR_NO_VALUES);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }

        if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
            value = new Float(Float.parseFloat(v1.value) - Float.parseFloat(v2.value)).toString();
        else  // if (type.equals(ValueTypes.INT_STR))
            value = new Integer(Integer.parseInt(v1.value) - Integer.parseInt(v2.value)).toString();
        return new Value(type, value, false);
    }

    // Esegue l'operazione *
    public Value doMul(Token op, Value v1, Value v2) {
        if (op == null || v1 == null || v2 == null)
            return null;

        String value;
        String type = ValueTypes.returnType("*", v1.type, v2.type);

        if (type.equals(ValueTypes.UNDEFINED_STR) || type.equals(ValueTypes.CHAR_STR) || type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR)) {
            addErrorMessage(op, ERR_UNDEFINED_OP);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }

        if (!v1.isInitialized() || !v2.isInitialized()) {
            addErrorMessage(op, ERR_NO_VALUES);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }

        if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
            value = new Float(Float.parseFloat(v1.value) * Float.parseFloat(v2.value)).toString();
        else  // if (type.equals(ValueTypes.INT_STR))
            value = new Integer(Integer.parseInt(v1.value) * Integer.parseInt(v2.value)).toString();
        return new Value(type, value, false);
    }

    // Esegue l'operazione /
    public Value doDiv(Token op, Value v1, Value v2) {
        if (op == null || v1 == null || v2 == null)
            return null;

        String value;
        String type = ValueTypes.returnType("/", v1.type, v2.type);

        if (!v1.isInitialized() || !v2.isInitialized()) {
            addErrorMessage(op, ERR_NO_VALUES);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }

        if (type.equals(ValueTypes.UNDEFINED_STR) || type.equals(ValueTypes.CHAR_STR) || type.equals(ValueTypes.STRING_STR) || type.equals(ValueTypes.ANYVALUE_STR)) {
            addErrorMessage(op, ERR_UNDEFINED_OP);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }
        if (Float.parseFloat(v2.value) == 0) {
            addErrorMessage(op, ERR_DIV_BY_0);
            return new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR, false);
        }
        if (type.equals(ValueTypes.FLOAT_STR) || type.equals(ValueTypes.NUMERIC_STR))
            value = new Float(Float.parseFloat(v1.value) / Float.parseFloat(v2.value)).toString();
        else  // if (type.equals(ValueTypes.INT_STR))
            value = new Integer(Integer.parseInt(v1.value) / Integer.parseInt(v2.value)).toString();
        return new Value(type, value, false);
    }

    // ERRORE
    // Errore semantico
    public void addErrorMessage(Token tk, int code) {
        String msg = " Errore semantico [" + code + "] " + "in (" + tk.getLine() + "," + tk.getCharPositionInLine() + ") - ";

        if (code == ERR_ALREADY_DECLARED)
            msg += "La variabile <" + tk.getText() + "> è già stata dichiarata";
        else if (code == ERR_UNDECLARED)
            msg += "La variabile <" + tk.getText() + "> non è stata dichiarata";
        else if (code == ERR_FUNC_ALREADY_DECLARED)
            msg += "La funzione <" + tk.getText() + "> è già stata dichiarata";
        else if (code == ERR_FUNC_UNDECLARED)
            msg += "La funzione <" + tk.getText() + "> non è stata dichiarata";
        else if (code == ERR_TYPE_CALL_FUNCT)
            msg += "La chiamta di funzione <" + tk.getText() + "> non deve avere il type";
        else if (code == ERR_TYPE_FUNCT_RETURN)
            msg += "La chiamata di funzione non ha lo stesso type dell'expression attesa";
        else if (code == ERR_TYPE_CALL_FUNCT_RETURN)
            msg += "La chiamata di funzione non ha lo stesso type dell'expression attesa";
        else if (code == ERR_CALL_FUNC_IN_GLOBAL)
            msg += "La chiamata di funzione <" + tk.getText() + "> non può essere fatta globalmente";
        else if (code == ERR_MAIN_NOT_FOUND)
            msg += "La funzione int main() è richiesta ma non è stata trovata";
        else if (code == ERR_MAIN_TYPE_NOT_INT)
            msg += "La funzione int main() è richiesta ma non è stata trovata";
        else if (code == ERR_TYPE_MISMATCH)
            msg += "Valore di tipo non compatibile";
        else if (code == ERR_UNDEFINED_OP)
            msg += "L'operatore <" + tk.getText() + "> non è definito per i due operandi";
        else if (code == ERR_DIV_BY_0)
            msg += "Divisione per 0";
        else if (code == ERR_NO_VALUE)
            msg += "La variabile <" + tk.getText() + "> non è stata inizializzata";
        else if (code == ERR_NO_VALUES)
            msg += "L'operazione <" + tk.getText() + "> non può essere eseguita perché almeno uno dei due operandi non ha valore";
        else
            msg += "Errore non definito sul token <" + tk.getText() + ">";

        errorList.add(msg);
    }

    // Errore sintattico
    public void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
        String st = " *** SINTAX ERROR [" + ERR_ON_SYNTAX + "] in " +
                "(" + e.token.getLine() + ", " + e.token.getCharPositionInLine() + ") - " +
                "Found ";

        if (e.token.getType() >= 0)
            st += tokenNames[e.token.getType()];
        st += " ('" + e.token.getText() + "')" + m;

        errorList.add(st);
    }
}