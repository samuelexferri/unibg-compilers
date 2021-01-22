package util;

import java.util.ArrayList;

public class Value {
    public static int stack_pointer = 4000; // Program counter fittizio
    public String name;
    public String type;
    public String value;
    public int address;
    public boolean isVar;
    public boolean isVarPassed; // Variabile che si riceverà da una chiamata di funzione
    public boolean isVect;
    public ArrayList<Value> vect;

    // Costruttore per variabili
    public Value(String n, String t) {
        name = n;
        type = t;
        value = null;
        address = stack_pointer;
        isVar = true;
        isVarPassed = false;
        isVect = false;
        vect = null;

        stack_pointer -= 4;
    }

    // Costruttore per funzioni
    public Value(String n, String t, String v, boolean b) {
        name = n;
        type = t;
        value = v;
        address = stack_pointer;
        isVar = b; // False
        isVarPassed = false;
        isVect = false;
        vect = null;

        stack_pointer -= 4;
    }

    // Costruttore per valori temporanei
    public Value(String t, String v, boolean b) {
        name = ""; // Vuoto
        type = t;
        value = v;
        address = 8888; // Valore temporaneo usato per gestire gli indirizzi dei puntatori TODO
        isVar = b;
        isVarPassed = false;
        isVect = false;
        vect = null;

        // Il program_counter non viene modificato per valori temporanei
    }

    // Costruttore per vettori
    public Value(String n, String t, String v, boolean b, boolean bvect, ArrayList<Value> list, Integer size) {
        name = n;
        type = t;
        value = v;
        address = stack_pointer;
        isVar = b;
        isVarPassed = false;
        isVect = bvect;

        if (list != null)
            vect = new ArrayList<Value>(list);
        else
            vect = new ArrayList<Value>();

        stack_pointer -= size*4 + 4; // Incrementa lo stack pointer per avere spazio per i vettori
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
                    ", isVarPassed=" + isVarPassed +
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
                    ", isVarPassed=" + isVarPassed +
                    ", isVect=" + isVect +
                    ", vect=[]" +
                    '}';
        }
    }

    public boolean isInitialized() {
        if (isVarPassed)
            return true; // In caso di variabile ricevuta da una funzione, si è sicuri a monte che è inizializzata
        else
            return value != null;
    }
}
