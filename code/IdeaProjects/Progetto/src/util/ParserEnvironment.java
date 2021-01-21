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
    public ArrayList<Value> vect; // Vettore temporaneo
    public String vect_size; // Dimensione del vettore specificata tra parentesi quadre
    public String vect_pos; // Posizione del vettore specificata tra parentesi quadre
    public Boolean is_amp_punct;
    ArrayList<String> excluded_functions;

    FileWriter fOut;

    public ParserEnvironment(FileWriter fOutMain) {
        symbolTable = new Hashtable<String, Value>(101); // 101 numero primo
        symbolTableLocal = new Hashtable<String, Value>(101); // 101 numero primo
        errorList = new ArrayList<String>();
        debug = new StringBuffer();
        translation = new StringBuffer();
        fOut = fOutMain;
        vect = new ArrayList<Value>();
        vect_size = "0";
        vect_pos = "0";
        is_amp_punct = false;

        // Funzioni escluse (Aggiungere in caso di necessità)
        excluded_functions = new ArrayList<>();
        excluded_functions.add("printf");
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
            if (!type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
                if (symbolTable.containsKey(name.getText()))
                    addErrorMessage(name, ERR_ALREADY_DECLARED);
                else {
                    symbolTable.put(name.getText(), new Value(name.getText(), type));
                    debug.append("Ho dichiarato la variabile '" + name.getText() + "' come '" + type + "'\n");
                }
            } else if (type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
                checkDeclarationGlobal(name);
            }
        } else { // Locale
            if (!type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
                if (symbolTableLocal.containsKey(name.getText()))
                    addErrorMessage(name, ERR_ALREADY_DECLARED);
                else {
                    // Variabile locale può oscurare una globale
                    symbolTableLocal.put(name.getText(), new Value(name.getText(), type));
                    debug.append("Ho dichiarato la variabile locale '" + name.getText() + "' come '" + type + "'\n");
                }
            } else if (type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
                checkDeclarationLocal(name);
            }
        }
    }

    // Inserisce un vettore nelle symbol tables
    public void addNewVector(String type, Token name, String size) {
        if (!is_local) { // Globale
            if (!type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
                if (symbolTable.containsKey(name.getText()))
                    addErrorMessage(name, ERR_ALREADY_DECLARED);
                else {
                    symbolTable.put(name.getText(), new Value(name.getText(), type, null, true, true, null, Integer.parseInt(size)));
                    debug.append("Ho dichiarato il vettore '" + name.getText() + "' come '" + type + "'\n");
                }
            } else if (type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
                checkDeclarationGlobal(name);
            }
        } else { // Locale
            if (!type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
                if (symbolTableLocal.containsKey(name.getText()))
                    addErrorMessage(name, ERR_ALREADY_DECLARED);
                else {
                    // Variabile locale può oscurare una globale
                    symbolTableLocal.put(name.getText(), new Value(name.getText(), type, null, true, true, null, Integer.parseInt(size)));
                    debug.append("Ho dichiarato il vettore locale '" + name.getText() + "' come '" + type + "'\n");
                }
            } else if (type.matches(ValueTypes.UNDEFINED_STR) && name != null) {
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
                return ValueTypes.UNDEFINED_STR; // Type:null
        } else { // Globale
            if (isDeclaredGlobal(var))
                return symbolTable.get(var.getText()).type;
            else
                return ValueTypes.UNDEFINED_STR; // Type:null
        }
    }

    // Assegna un valore ad una variabile (dichiarata)
    public void assignValue(Token name_var, Value exp, Token operator) {
        if (!is_local) { // Globale
            if (name_var != null && exp != null && operator != null) {
                if (!isDeclaredGlobal(name_var))
                    addErrorMessage(name_var, ERR_UNDECLARED);
                else {
                    Value var = symbolTable.get(name_var.getText()); // Reference

                    if (!ValueTypes.isCoherent(exp.type, var.type))
                        addErrorMessage(name_var, ERR_TYPE_MISMATCH);
                    else {
                        if (is_amp_punct) { // Puntatori, gestiamo addresss
                            var.value = Integer.toString(exp.address);
                            debug.append("Ho assegnato alla variabile '" + var.name + "' l'indirizzo di memoria '" + var.address + "'\n");
                            is_amp_punct = false;
                        } else {
                            var.value = exp.value;
                            debug.append("Ho assegnato alla variabile '" + var.name + "' il valore '" + var.value + "'\n");
                        }
                    }
                }
            }
        } else { // Locale
            if (name_var != null && exp != null && operator != null) {
                if (!isDeclaredLocal(name_var) && !isDeclaredGlobal(name_var)) // Locale e variabile in locale
                    addErrorMessage(name_var, ERR_UNDECLARED);
                else if (isDeclaredLocal(name_var)) { // Locale
                    Value var = symbolTableLocal.get(name_var.getText()); // Reference

                    if (!ValueTypes.isCoherent(exp.type, var.type))
                        addErrorMessage(name_var, ERR_TYPE_MISMATCH);
                    else {
                        if (is_amp_punct) { // Puntatori, gestiamo addresss
                            var.value = Integer.toString(exp.address);
                            debug.append("Ho assegnato alla variabile '" + var.name + "' l'indirizzo di memoria '" + var.address + "'\n");
                            is_amp_punct = false;
                        } else {
                            var.value = exp.value;
                            debug.append("Ho assegnato alla variabile '" + var.name + "' il valore '" + var.value + "'\n");
                        }
                    }
                } else { // Locale ma variabile in globale
                    Value var = symbolTable.get(name_var.getText()); // Reference

                    if (!ValueTypes.isCoherent(exp.type, var.type))
                        addErrorMessage(name_var, ERR_TYPE_MISMATCH);
                    else {
                        if (is_amp_punct) { // Puntatori, gestiamo addresss
                            var.value = Integer.toString(exp.address);
                            debug.append("Ho assegnato alla variabile '" + var.name + "' l'indirizzo di memoria '" + var.address + "'\n");
                            is_amp_punct = false;
                        } else {
                            var.value = exp.value;
                            debug.append("Ho assegnato alla variabile '" + var.name + "' il valore '" + var.value + "'\n");
                        }
                    }
                }
            }
        }
    }

    // Assegna un valore ad un vettore (dichiarata)
    public void assignVectorValue(Token var_name, String vect_size, Value exp) {
        if (!is_local) { // Globale
            if (!isDeclaredGlobal(var_name))
                return;

            Value var = symbolTable.get(var_name.getText()); // Reference

            if (var != null)
                var.vect.get(Integer.parseInt(vect_size)).value = exp.value;
        } else { // Locale
            if (!isDeclaredLocal(var_name) && !isDeclaredGlobal(var_name))
                return;
            else if (isDeclaredLocal(var_name)) {
                Value var = symbolTableLocal.get(var_name.getText()); // Reference

                if (var != null)
                    var.vect.get(Integer.parseInt(vect_size)).value = exp.value;
            } else {
                Value var = symbolTable.get(var_name.getText()); // Reference

                if (var != null)
                    var.vect.get(Integer.parseInt(vect_size)).value = exp.value;
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
    public Value setValueCallFunction(Token called_func_name, String type, String expectedType) {
        if (!ValueTypes.isCoherent(type, expectedType)) {
            type = ValueTypes.UNDEFINED_STR;
            addErrorMessage(called_func_name, ERR_TYPE_MISMATCH);
        }

        Value func_temp_value = symbolTable.get(called_func_name.getText());

        return new Value(type, func_temp_value.value, false);
    }

    // Verifica che il tipo ritornato dalla funzione e quello atteso siano coerenti
    public void checkFunctionReturnType(Token tk, Value value, String return_type, String funct_type) {
        if (return_type.matches("void") && funct_type.matches("void"))
            return;

        if (!return_type.matches(funct_type))
            addErrorMessage(tk, ERR_TYPE_FUNCT_RETURN);

        if (value != null)
            setFunctionReturnType(value);
    }

    // Assegna il valore alla funzione dato il return
    public void setFunctionReturnType(Value value) {
        Value func_temp_value = symbolTable.get(funct_name.getText());
        func_temp_value.value = value.value;

        symbolTable.put(funct_name.getText(), func_temp_value);
    }

    // Verifica che il tipo ritornato dalla chiamata funzione e quello atteso siano coerenti
    public void checkCallFunctionReturnType(Token tk, String func_type, String expectedType) {
        if (!func_type.matches(expectedType))
            addErrorMessage(tk, ERR_TYPE_CALL_FUNCT_RETURN);
    }

    // Recupera il valore di una variabile dichiarata
    public Value getDeclaredValue(Token var, String expectedType) {
        Value value = null;

        if (!is_local) { // Globale
            if (!isDeclaredGlobal(var)) {
                addErrorMessage(var, ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else {
                value = symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symbol table
                if (!value.isInitialized())
                    addErrorMessage(var, ERR_NO_VALUE);
                else if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            }
        } else { // Locale
            if (!isDeclaredLocal(var) && !isDeclaredGlobal(var)) {
                addErrorMessage(var, ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else if (isDeclaredLocal(var)) {
                value = symbolTableLocal.get(var.getText());  // Recupero il valore della variabile dalla symbol table
                if (!value.isInitialized())
                    addErrorMessage(var, ERR_NO_VALUE);
                else if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            } else {
                value = symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symbol table
                if (!value.isInitialized())
                    addErrorMessage(var, ERR_NO_VALUE);
                else if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            }
        }

        return value;
    }

    // Recupera il valore di una variabile dichiarata
    public Value getVectorValue(Token var, String expectedType, String position) {
        Value value = null;

        // TODO Rinominare gli errori per i vettori

        if (!is_local) { // Globale
            if (!isDeclaredGlobal(var)) {
                addErrorMessage(var, ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else {
                value = symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symbol table
                if (value.vect == null)
                    addErrorMessage(var, ERR_NO_VALUE);
                else if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            }
        } else { // Locale
            if (!isDeclaredLocal(var) && !isDeclaredGlobal(var)) {
                addErrorMessage(var, ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else if (isDeclaredLocal(var)) {
                value = symbolTableLocal.get(var.getText());  // Recupero il valore della variabile dalla symbol table locale
                if (value.vect == null)
                    addErrorMessage(var, ERR_NO_VALUE);
                else if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            } else {
                value = symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symbol table
                if (value.vect == null)
                    addErrorMessage(var, ERR_NO_VALUE);
                else if (!ValueTypes.isCoherent(value.type, expectedType))
                    addErrorMessage(var, ERR_TYPE_MISMATCH);
            }
        }

        return value.vect.get(Integer.parseInt(position));
    }

    // FUNZIONI
    // Symbol table locale stampata e in seguito ripulita
    public void clearSymbolTableLocal(Boolean isBlock) {
        if (isBlock) {
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

                // Pulisce
                symbolTableLocal.clear();
            } catch (IOException i) {
                System.out.println("IOException");
            }
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

        if (!var.type.matches("int"))
            addErrorMessage(tk, ERR_MAIN_TYPE_NOT_INT);
    }

    // Verifica una chiamata di funzione
    public void checkCallFunction(String var_type, Token name) {
        if (excluded_functions.contains(name.getText())) { // Funzioni escluse (es. printf...)
            return; // Ignora la funzione ed esce subito
        }

        if (!var_type.matches(ValueTypes.UNDEFINED_STR)) // In locale si ha "int funct()" che è sbagliato avere il type
            addErrorMessage(name, ERR_TYPE_CALL_FUNCT);


        if (!symbolTable.containsKey(name.getText())) {
            addErrorMessage(name, ERR_FUNC_UNDECLARED);
        }
    }

    // VETTORI
    // Creare il vettore di sostegno, controllo di tipi già fatto con env.var_type
    public void createVector(Value val) {
        vect.clear();
        vect.add(val);
    }

    // Aggiungi un valore al vettore
    public void addValueVector(Value val) {
        vect.add(val);
    }

    // Inserisci il vettore creato nella symbol table
    public void insertVectorST() {
        // Costruisco il Value

        Value vect_val = new Value(var_name.getText(), getVarType(var_name), null, true, true, vect, vect.size());

        if (is_local && symbolTableLocal.containsKey(var_name.getText())) {
            symbolTableLocal.replace(var_name.getText(), vect_val);
        } else if (symbolTable.containsKey(var_name.getText())) {
            symbolTable.replace(var_name.getText(), vect_val);
        }

        vect.clear();
    }

    // PUNTATORI
    // Usano alcune funzioni dei vettori

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
        } else {
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

    // STATEMENTS
    // Valuta le condizioni date le due espressioni e il comparatore
    public Boolean compareEvaluator(Token comp, Value exp1, Value exp2) {
        if (comp == null || exp1 == null || exp2 == null) {
            //addErrorMessage(op, ERR_DIV_BY_0); // TODO Compare
        }

        //switch-case // TODO Compare

        return true;
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
            msg += "Il tipo ritornato non ha lo stesso type del tipo di funzione atteso";
        else if (code == ERR_TYPE_CALL_FUNCT_RETURN)
            msg += "La chiamata di funzione non ha lo stesso type dell'expression attesa";
        else if (code == ERR_CALL_FUNC_IN_GLOBAL)
            msg += "La chiamata di funzione <" + tk.getText() + "> non può essere fatta globalmente";
        else if (code == ERR_MAIN_NOT_FOUND)
            msg += "La funzione int main() è richiesta ma non è stata trovata";
        else if (code == ERR_MAIN_TYPE_NOT_INT)
            msg += "La funzione int main() è richiesta ma non è stata trovata";
        else if (code == ERR_TYPE_MISMATCH)
            msg += "Valore di tipo non compatibile (null)";
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
        String st = " Errore sintattico [" + ERR_ON_SYNTAX + "] in " +
                "(" + e.token.getLine() + ", " + e.token.getCharPositionInLine() + ") - " +
                "Found ";

        if (e.token.getType() >= 0)
            st += tokenNames[e.token.getType()];
        st += " ('" + e.token.getText() + "')" + m;

        errorList.add(st);
    }

    private void emit(String s) {
        translation.append(s + "\n");
    }
}