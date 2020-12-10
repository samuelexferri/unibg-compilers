package util;

import java.util.Hashtable;
// + campo lista errori come lista di stringhe
// Gli errori in output non nell'ordine in cui sono rilevanti ma viceversa
// una symbol table globale
// una symbol table locale --> entrata inserire variabili
//                         --> uscita eliminare le variabili
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
