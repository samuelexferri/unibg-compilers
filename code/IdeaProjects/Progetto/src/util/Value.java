package util;

public class Value {
    public String name;
    public String type;
    public String value;
    public boolean isVar;

    // Costruttore per variabili
    public Value(String n, String t) {
        name = n;
        type = t;
        value = null;
        isVar = true;
    }

    // Costruttore per valori temporanei
    public Value(String t, String v, boolean b) {
        name = "";
        type = t;
        value = v;
        isVar = b;
    }

    @Override
    public String toString() {
        return "Value{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", isVar=" + isVar +
                '}';
    }

    public boolean isInitialized() {
        return value != null;
    }
}
