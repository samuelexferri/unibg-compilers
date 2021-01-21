package util;

import java.util.ArrayList;

public class Value {
    public String name;
    public String type;
    public String value;
    public int address;
    public boolean isVar;
    public boolean isVect;
    public ArrayList<Value> vect;

    public static int program_counter = 1000; // Program counter fittizio

    // Costruttore per variabili
    public Value(String n, String t) {
        name = n;
        type = t;
        value = null;
        address = program_counter;
        isVar = true;
        isVect = false;
        vect = null;

        program_counter += 1;
    }

    // Costruttore per funzioni
    public Value(String n, String t, String v, boolean b) {
        name = n;
        type = t;
        value = v;
        address = program_counter;
        isVar = b; // False
        isVect = false;
        vect = null;

        program_counter += 1;
    }

    // Costruttore per valori temporanei
    public Value(String t, String v, boolean b) {
        name = ""; // Vuoto
        type = t;
        value = v;
        address = -1; // Valore temporaneo usato per gestire gli indirizzi dei puntatori
        isVar = b;
        isVect = false;
        vect = null;

        // Il program_counter non viene modificato per valori temporanei
    }

    // Costruttore per vettori
    public Value(String n, String t, String v, boolean b, boolean bvect, ArrayList<Value> list, Integer size) {
        name = n;
        type = t;
        value = v;
        address = program_counter;
        isVar = b;
        isVect = bvect;

        if (list != null)
            vect = new ArrayList<Value>(list);
        else
            vect = new ArrayList<Value>();

        program_counter += size + 1;
    }

    @Override
    public String toString() {
        if (vect != null) {
            return "Value{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", value='" + value + '\'' +
                    ", address='" + address + '\'' +
                    ", isVar=" + isVar +
                    ", isVect=" + isVect +
                    ", vect=" + vect.toString() +
                    '}';
        } else {
            return "Value{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", value='" + value + '\'' +
                    ", address='" + address + '\'' +
                    ", isVar=" + isVar +
                    ", isVect=" + isVect +
                    ", vect=[]" +
                    '}';
        }
    }

    public boolean isInitialized() {
        return value != null;
    }
}
