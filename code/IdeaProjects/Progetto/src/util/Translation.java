package util;

import org.antlr.runtime.Token;
import util.ParserEnvironment;

import java.util.Locale;

public class Translation {
    public StringBuffer translation = null;
    public int indentation = 0; // Indentazione
    ParserEnvironment env;
    Token var_name_assignment = null; // Nome della variabile a sinistra dell'assegnamento
    int t = 1; // Numero del registro $t usato

    // Costruttore
    public Translation(ParserEnvironment env) {
        this.env = env;
        translation = new StringBuffer();
    }

    // Emit
    public void emit(String s) {
        for (int i = 0; i < indentation; i++) {
            translation.append("   ");
        }
        translation.append(s + "\n");
    }

    // Cambia il numero di registro $t
    public void changeT() {
        if (t == 1)
            t = 2;
        else if (t == 2)
            t = 1;
    }

    // Recupera il valore di una variabile senza controlli se inizializzata
    public Value getValue(Token var) {
        Value value = null;

        if (!env.is_local) { // Globale
            if (!env.isDeclaredGlobal(var)) {
                env.addErrorMessage(var, env.ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else {
                value = env.symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symbol table
            }
        } else { // Locale
            if (!env.isDeclaredLocal(var) && !env.isDeclaredGlobal(var)) {
                env.addErrorMessage(var, env.ERR_UNDECLARED);
                value = new Value(ValueTypes.UNDEFINED_STR, ValueTypes.UNDEFINED_STR); // Creo un oggetto fittizio di comodo
            } else if (env.isDeclaredLocal(var)) {
                value = env.symbolTableLocal.get(var.getText());  // Recupero il valore della variabile dalla symbol table
            } else {
                value = env.symbolTable.get(var.getText());  // Recupero il valore della variabile dalla symbol table
            }
        }

        return value;
    }

    // ASSEGNAMENTI
    // Assegnamento (Prima)
    public void traAssignmentBefore() {
        if (!env.is_local) { // Variabile globale
            // Nothing
        } else { // Variabile locale
            emit("lw $s0, 0x" + getValue(env.var_name).address + " \t\t #[" + getValue(env.var_name).name + "=" + getValue(env.var_name).value + "]");
        }

        var_name_assignment = env.var_name;
    }

    // Assegnamento (Dopo)
    public void traAssignmentAfter(Value exp) {
        if (!env.is_local) { // Variabile globale, nel caso di variabile globale assegnata (ricordo che si può fare una sola volta), fare .word
            emit(env.var_name.getText().toUpperCase(Locale.ROOT) + ": .word " + exp.value);
        } else { // Variabile locale
            changeT();
            emit("sw $t" + t + ", 0x" + getValue(var_name_assignment).address + " \t\t #[" + getValue(env.var_name).name + "=" + getValue(env.var_name).value + "]");
            changeT();
        }
    }

    // FUNZIONI
    // Aggiunta di una nuova funzione
    public void traAddNewFunction() {
        indentation = 0;
        emit(env.var_name.getText().toUpperCase(Locale.ROOT) + ": ");
        indentation++;
        emit("addiu $sp, $sp, -8" + " \t #Crea area nello stack pointer");
        emit("sw $ra, 4($sp)" + " \t\t #Salva return address");
    }

    // Return di una funzione
    public void traReturn(Value val) {
        if (val != null)
            emit("sw " + val.value + ", 0($sp)" + " \t\t #Memorizza il valore del return");
        else
            emit("sw 0, 0($sp)" + " \t\t #Memorizza il valore del return");

        emit("lw $v0, 0($sp)" + " \t\t #Salva valore d'uscita");
        emit("lw $ra, 4($sp)" + " \t\t #Ripristina return address");
        emit("addiu $sp, $sp, 8" + " \t #Elimina area nello stack pointer");
        emit("jr $ra" + " \t\t\t\t #Salta al return address");
    }

    // Return di una funzione void
    public void traReturnVoid() {
        emit("sw 0, 0($sp)" + " \t\t #Memorizza il valore del return");
        emit("lw $v0, 0($sp)" + " \t\t #Salva valore d'uscita");
        emit("lw $ra, 4($sp)" + " \t\t #Ripristina return address");
        emit("addiu $sp, $sp, 8" + " \t #Elimina area nello stack pointer");
        emit("jr $ra" + " \t\t\t\t #Salta al return address");
    }

    // OPERAZIONI
    public void traDoAdd(Token op, Value v1, Value v2) {
        emit("add $t" + t + ", $t1, $t2");
        changeT();
    }

    public void traDoSub(Token op, Value v1, Value v2) {
        if (env.bmulordiv1 && env.bmulordiv2)
            emit("sub $t" + t + ", $t2, $t1");
        else
            emit("sub $t" + t + ", $t1, $t2");
        changeT();
    }

    public void traDoMul(Token op, Value v1, Value v2) {
        emit("mul $t" + t + ", $t1, $t2");
        changeT();
    }

    public void traDoDiv(Token op, Value v1, Value v2) {
        if (env.bmulordiv1 && env.bmulordiv2)
            emit("div $t" + t + ", $t2, $t1");
        else
            emit("div $t" + t + ", $t1, $t2");
        changeT();
    }

    // VALUES
    // Costante
    public void traSetValueConst(Value value, Boolean bool) {
        if (value == null)
            return;

        if (env.is_local) {
            if (bool) {
                // Display nothing
            } else {
                emit("lw $t" + t + ", " + value.value);
                changeT();
            }
        }
    }

    // Variabile
    public void traSetValueVar(Token name) {
        Value value = getValue(name);

        if (env.is_local) {
            emit("lw $t" + t + ", 0x" + value.address + " \t\t #[" + value.name + "=" + value.value + "]");
            changeT();
        }
    }

    // STATEMENTS
    // Compare
    public void traCompare(Value exp1, Value exp2, Token comp, Integer stat) {
        emit("lw $t6, " + exp1.value);
        emit("lw $t7, " + exp2.value);

        String label;
        if (env.stat == 1) { // If
            label = "ELSE" + (indentation - 1);
        } else if (env.stat == 2) { // While
            label = "ENDWHILE" + (indentation - 1);
        } else { // For
            label = "ENDFOR" + (indentation - 1);
        }

        // TODO Operatori logici

        switch (comp.getText()) {
            case "==":
                emit("bne $t6, $t7, " + label);
                break;
            case "!=":
                emit("beq $t6, $t7, " + label);
                break;
            case "<":
                emit("slt $t8, $t6, $t7");
                emit("bne $t8, 1, " + label);
                break;
            case ">":
                emit("slt $t8, $t7, $t6"); // Registri invertiti
                emit("bne $t8, 1, " + label);
                break;
            case "<=":
                emit("slt $t8, $t7, $t6");  // Registri invertiti
                emit("beq $t8, 1, " + label);
                break;
            case ">=":
                emit("slt $t8, $t6, $t7 ");
                emit("beq $t8, 1, " + label);
                break;
        }
    }

    public void traIfStart() {
        emit("IF" + indentation + ":");
        indentation++;
    }

    public void traIfEnd() {
        indentation--;
        emit("ENDIF" + indentation + ":");
    }

    public void traElseStart() {
        emit("j ENDIF" + (indentation - 1));
        indentation--;
        emit("ELSE" + indentation + ":");
        indentation++;
    }

    public void traWhileStart() {
        emit("WHILE" + indentation + ":");
        indentation++;
    }

    public void traWhileEnd() {
        indentation--;
        emit("ENDWHILE" + indentation + ":");
    }

    public void traForStart() {
        emit("FOR" + indentation + ":");
        indentation++;
    }

    public void traForEnd() {
        emit("j INCRFOR" + (indentation - 1));
        indentation--;
        emit("ENDFOR" + indentation + ":");
    }

    public void traIncrStart() {
        emit("j ENDINCRFOR" + (indentation - 1));
        emit("INCRFOR" + (indentation - 1) + ":");
        indentation++;
    }

    public void traIncrEnd() {
        emit("j FOR" + (indentation - 2));
        indentation--;
        emit("ENDINCRFOR" + (indentation - 1) + ":");
    }
}
