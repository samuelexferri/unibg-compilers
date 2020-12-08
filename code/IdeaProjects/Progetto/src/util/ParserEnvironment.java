package util;

import java.util.Hashtable;

public class ParserEnvironment {
    public StringBuffer translation;
    public Hashtable<String, Double> symbolTable;
    public boolean par;
    public boolean postfissa;

    public ParserEnvironment(boolean par, boolean postfissa) {
        translation = new StringBuffer();
        symbolTable = new Hashtable<String, Double>(101);
        this.par = par;
        this.postfissa = postfissa;
    }
}
