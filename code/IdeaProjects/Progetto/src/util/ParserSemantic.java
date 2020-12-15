package util;

import org.antlr.runtime.Token;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class ParserSemantic {
    ParserEnvironment env;
    String parOpen, parClose;

    public Boolean is_global = false;
    public Boolean type_bool = false;
    public Token var_name;
    public Double exp;

    public Hashtable<String, Object> symbolTableLocal = new Hashtable();
    public ArrayList<Object> paramsList = new ArrayList();

    public ParserSemantic(ParserEnvironment e) {
        env = e;
    }

    public void registerVar(Boolean is_function, Token tk, Double value, Boolean type_bool) {
        System.out.println("[registerVar " + type_bool.toString() + " " + value + " " + tk.getText() + " getVarValue(tk)=" + getVarValue(tk) + "]");

        // GLOBAL
        if (is_global) {
            if (!type_bool && getVarValue(tk)==null) {
                System.out.println("Variabile '" + tk.getText() + "' non trovata");
                // TODO: Controllo posticipato
            } else if (!type_bool && getVarValue(tk)!=null){
                System.out.println("Assegnamento");

                if (value == null)
                    env.symbolTable.replace(tk.getText(), "NULL"); // TODO: Controllo sui tipi
                else
                    env.symbolTable.replace(tk.getText(), value); // TODO: Controllo sui tipi

            } else if (type_bool && getVarValue(tk)==null) {
                System.out.println("Definizione");

                if (value == null)
                    env.symbolTable.put(tk.getText(), "NULL"); // TODO: Controllo sui tipi
                else
                    env.symbolTable.put(tk.getText(), value); // TODO: Controllo sui tipi

            } else if (type_bool && getVarValue(tk)!=null) {
                System.out.println("Variabile '" + tk.getText() + "' ridefinita");
            }
        // FUNCTION
        } else {
            System.out.println("LOCAL" + getVarValue(tk));
            if (!type_bool && getVarValue(tk)==null &&  getVarValueLocal(tk)==null) {
                System.out.println("Variabile '" + tk.getText() + "' non trovata");
                // TODO: Controllo posticipato
            } else if (!type_bool && getVarValueLocal(tk)!=null){
                System.out.println("Assegnamento in locale");

                if (value == null)
                    symbolTableLocal.replace(tk.getText(), "NULL"); // TODO: Controllo sui tipi
                else
                    symbolTableLocal.replace(tk.getText(), value); // TODO: Controllo sui tipi

            } else if (!type_bool && getVarValueLocal(tk)==null && getVarValue(tk)!=null) {
                System.out.println("Assegnamento in globale");

                if (value == null)
                    env.symbolTable.replace(tk.getText(), "NULL"); // TODO: Controllo sui tipi
                else
                    env.symbolTable.replace(tk.getText(), value); // TODO: Controllo sui tipi

            } else if (type_bool && getVarValue(tk)==null &&  getVarValueLocal(tk)==null) {
                System.out.println("Definizione in locale");

                if (value == null)
                    symbolTableLocal.put(tk.getText(), "NULL"); // TODO: Controllo sui tipi
                else
                    symbolTableLocal.put(tk.getText(), value); // TODO: Controllo sui tipi

            } else if (type_bool && (getVarValue(tk)!=null ||  getVarValueLocal(tk)!=null)) {
                System.out.println("Variabile '" + tk.getText() + "' ridefinita");
            }
        }
    }

    // public Boolean checkType(Token tk, float value) // TODO: Controllo sui tipi

    public double getValue(Token tk) {
        return new Double(tk.getText()); // TODO: Double
    }

    public String getVarValue(Token tk) {
        if (env.symbolTable.containsKey(tk.getText()))
            return env.symbolTable.get(tk.getText()).toString();

        return null;
    }

    public String getVarValueLocal(Token tk) {
        if (symbolTableLocal.containsKey(tk.getText()))
            return symbolTableLocal.get(tk.getText()).toString();

        return null;
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

    public void newFunction() {
        System.out.println("---NEW FUNCTION---");
        if (type_bool == false) {
            System.out.println("Funzione senza aver specificato il tipo");
            return;
        }

        if (symbolTableLocal != null)
            symbolTableLocal.clear();

        // TODO: Controllo parametri

        if (paramsList != null) {
            for (Object var : paramsList) {
                symbolTableLocal.put(var.toString(), "NULL");
            }
        }
    }

    public void addParamsList(Token tk) {
        paramsList.add(tk.getText());
    }

    public void clearParamsList() {
        if (paramsList != null)
            paramsList.clear();
    }

    public String translateValue(Token tk) {
        return tk.getText();
    }

    public String translateOp(String term1, String term2, String op) {
        return parOpen + op + " " + term1 + " " + term2 + parClose;
    }

    public void translateExp(Token var, double value, String exp) {
        env.translation.append(var.getText() + " ==" + value + "\t:\t" + exp + "\n");
    }
}