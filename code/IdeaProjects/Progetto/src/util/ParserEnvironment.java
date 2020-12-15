package util;

import java.util.ArrayList;
import java.util.Hashtable;
// TODO: Leggere qua sotto
// + campo lista errori come lista di stringhe
// Gli errori in output non nell'ordine in cui sono rilevanti ma viceversa
// una symbol table globale
// una symbol table locale --> entrata inserire variabili
//                         --> uscita eliminare le variabili
public class ParserEnvironment {
    public StringBuffer translation;
    public Hashtable<String, Object> symbolTable;

    public ParserEnvironment() {
        translation = new StringBuffer();
        symbolTable = new Hashtable<String, Object>(101);
    }
}
