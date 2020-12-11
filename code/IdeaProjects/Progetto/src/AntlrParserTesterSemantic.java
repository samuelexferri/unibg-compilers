import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;

public class AntlrParserTesterSemantic {
    static C_MIPSParser parser;
    static String fileIn = ".\\resources\\test_C";
    static String fileOut = ".\\resources\\parser.ANTLR.out.txt";
    static String fileMsg = ".\\resources\\parser.ANTLR.msg.txt";

    public static void main(String[] args) {
        CommonTokenStream tokens;

        try {
            System.out.println("-----------------------");
            System.out.println("Parsing con ANTLR lexer");
            System.out.println("-----------------------");
            C_MIPSLexer lexer = new C_MIPSLexer(new ANTLRReaderStream(new FileReader(fileIn)));
            tokens = new CommonTokenStream(lexer);
            parser = new C_MIPSParser(tokens);

            parser.start();

            //saveMessages();
            //saveTranslation();

        } catch (Exception e) {
            System.out.println("Parsing con ANTLR abortito\n\n");
            e.printStackTrace();
        }
    }

    static void saveMessages() throws IOException {
        FileWriter fOut = new FileWriter(fileMsg);
        fOut.append("Lista delle variabili\n" + "---------------------\n");
        System.out.println("---------------------\nLista delle variabili\n" + "---------------------");
        Enumeration<String> varList = parser.getVariables().keys();
        int v = 0;
        while (varList.hasMoreElements()) {
            String var = varList.nextElement();
            double value = parser.getVariables().get(var);
            fOut.append(++v + ":\t" + var + "=" + value + "\n");
            System.out.println(v + ":\t" + var + "=" + value);
        }
        fOut.close();
    }

    static void saveTranslation() throws IOException {
        FileWriter fOut = new FileWriter(fileOut);
        fOut.append(parser.getTranslation());
        fOut.close();
        System.out.println("\n--------------------------\n" + "*****\tTraduzione\t*****\n" + "--------------------------");
        System.out.println(parser.getTranslation());
    }
}
