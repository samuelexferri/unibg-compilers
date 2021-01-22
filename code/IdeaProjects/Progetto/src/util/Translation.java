package util;

import org.antlr.runtime.Token;
import util.ParserEnvironment;

import java.util.Locale;

public class Translation {
    public StringBuffer translation = null;
    public int indentation = 0;
    //public int program_counter = 1000; // Program counter TODO
    //public int stack_pointer = 4000;
    ParserEnvironment env;
    Token var_name_assignment = null;
    boolean alternate_traSetValue = true;

    int t = 1;

    public Translation(ParserEnvironment env) {
        this.env = env;
        translation = new StringBuffer();
    }

    // Translation
    public void emit(String s) {
        for (int i = 0; i < indentation; i++) {
            translation.append("   ");
        }
        translation.append(s + "\n");
        //program_counter += 4; // TODO
    }

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

    public void traAssignmentBefore() {
        if (!env.is_local) { // Variabile globale
            // Nothing
        } else { // Variabile locale
            emit("lw $s0, 0x" + getValue(env.var_name).address + " \t #[Var " + getValue(env.var_name).name + "=" + getValue(env.var_name).value + "]");
        }

        var_name_assignment = env.var_name;
    }

    public void traAssignmentAfter(Value exp) {
        // Nel caso di variabile globale assegnata (ricordo che si può fare una sola volta), fare .word
        if (!env.is_local) { // Variabile globale
            emit(env.var_name.getText().toUpperCase(Locale.ROOT) + ": .word " + exp.value);
        } else { // Variabile locale
            changeT();
            emit("sw $t" + t + ", 0x" + getValue(var_name_assignment).address + " \t #[Var " + getValue(env.var_name).name + "=" + getValue(env.var_name).value + "]");
            changeT();
        }
    }

    public void traAddNewFunction() {
        emit(env.var_name.getText().toUpperCase(Locale.ROOT) + ": ");
        indentation++;
    }

    public void traDoAdd(Token op, Value v1, Value v2) {
        emit("add $t" + t + ", $t1, $t2");
        changeT();
    }

    public void traDoSub(Token op, Value v1, Value v2) {
        emit("sub $t" + t + ", $t1, $t2");
        changeT();
    }

    public void traDoMul(Token op, Value v1, Value v2) {
        emit("mul $t" + t + ", $t1, $t2");
        changeT();
    }

    // Costante
    public void traSetValueConst(Value value, Boolean bool) {
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
            emit("lw $t" + t + ", 0x" + value.address + " \t #[Var " + value.name + "=" + value.value + "]");
            changeT();
        }
    }
}
