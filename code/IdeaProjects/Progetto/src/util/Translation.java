package util;

import util.ParserEnvironment;

import java.util.Locale;

public class Translation {
    ParserEnvironment env;

    public Translation(ParserEnvironment env){
        this.env = env;
        translation = new StringBuffer();
    }

    public StringBuffer translation = null;

    public int program_counter = 5000; // Program counter TODO

    // Translation
    public void emit(String s) {
        translation.append(s + "\n");
        program_counter += 4;
    }

    public void transAssignment(Value exp) {
        // Nel caso di variabile globale assegnata (ricordo che si può fare una sola volta), fare .word
        if (!env.is_local) {
            emit(env.var_name.getText().toUpperCase(Locale.ROOT) + ": .word " + exp.value);
        }
        
        //Value output = getDeclaredValue(var_name, var_type);

        //emit("lw $t1, 0(0x8888) + #Assignment");
        //emit("sw $t1, 0(0x" + output.address + ") + #Assignment");
    }
}
