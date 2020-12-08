package util;

import org.antlr.runtime.Token;

public class ParserSemantic {
    ParserEnvironment env;
    String parOpen, parClose;

    public ParserSemantic(ParserEnvironment e) {
        env = e;
        if (e.par) {
            parOpen = "(";
            parClose = ")";
        } else {
            parOpen = "";
            parClose = "";
        }
    }
    public void registerVar(Token tk, double value) {
        // TODO Controllo se esiste già
        env.symbolTable.put(tk.getText(), value);
    }

    public double getValue(Token tk) {
        return new Double(tk.getText());
    }

    public double getVarValue(Token tk) {
        if (env.symbolTable.containsKey(tk.getText()))
            return env.symbolTable.get(tk.getText()).floatValue();

        System.out.println("Variabile '" + tk.getText() + "' non trovata");
        return 0.0;
    }

    public double doAdd(double v1, double v2) {
        return v1 + v2;
    }

    public double doSub(double v1, double v2) {
        return v1 - v2;
    }

    public double doMul(double v1, double v2) {
        return v1 * v2;
    }

    public double doDiv(double v1, double v2) {
        if (v2 != 0)
            return v1 / v2;

        System.out.println("Divisione per zero");
        return 0.0;
    }

    public String translateValue(Token tk) {
        return tk.getText();
    }

    public String translateOp(String term1, String term2, String op) {
        if (env.postfissa)
            return parOpen + term1 + " " + term2 + " " + op + parClose;
        return parOpen + op + " " + term1 + " " + term2 + parClose;
    }

    public void translateExp(Token var, double value, String exp) {
        env.translation.append(var.getText() + " ==" + value + "\t:\t" + exp + "\n");
    }
}