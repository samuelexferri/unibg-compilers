package util;

import java.util.ArrayList;

public class Value {
    public String name;
    public String type;
    public String value;
    public boolean isVar;
    public boolean isVect;
    public ArrayList<?> vect;

    // Costruttore per variabili
    public Value(String n, String t) {
        name = n;
        type = t;
        value = null;
        isVar = true;
        isVect = false;
        vect = null;
    }

    // Costruttore per funzioni
    public Value(String n, String t, String v, boolean b) {
        name = n;
        type = t;
        value = v; // Null
        isVar = b; // False
        isVect = false;
        vect = null;
    }

    // Costruttore per valori temporanei
    public Value(String t, String v, boolean b) {
        name = "";
        type = t;
        value = v;
        isVar = b;
        isVect = false;
        vect = null;
    }

    // Costruttore per vettori
    public Value(String n, String t, String v, boolean b, boolean bvect, ArrayList<?> list) {
        name = n;
        type = t;
        value = v;
        isVar = b;
        isVect = bvect;

        if (list != null)
            vect = new ArrayList<>(list);
        else
            vect = new ArrayList<>();
    }

    @Override
    public String toString() {
        if (vect != null) {
            return "Value{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", value='" + value + '\'' +
                    ", isVar=" + isVar +
                    ", isVect=" + isVect +
                    ", vect=" + vect.toString() +
                    '}';
        } else {
            return "Value{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", value='" + value + '\'' +
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
