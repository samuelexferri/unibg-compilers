import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;

public class AntlrParserTester {
    static C_MIPS_semanticParser parser;

    // SELEZIONARE UN FILE DI TEST

    // File di test
    //static String fileIn = ".\\resources\\test_C_1"; // Non usarle per la traduzione semplificata!
    //static String fileIn = ".\\resources\\test_C_2"; // Non usarle per la traduzione semplificata!

    // File di test (Traduzione)
    //static String fileIn = ".\\resources\\trad_operations";
    //static String fileIn = ".\\resources\\trad_if";
    //static String fileIn = ".\\resources\\trad_while";
    //static String fileIn = ".\\resources\\trad_for";
    static String fileIn = ".\\resources\\trad_funct";

    static String fileTraduzione = ".\\resources\\FILE_TRADUZIONE.txt";
    static String fileDebug = ".\\resources\\FILE_DEBUG.txt";
    static String fileErrori = ".\\resources\\FILE_ERRORI.txt";

    public static void main(String[] args) throws IOException {
        CommonTokenStream tokens;
        FileWriter fOut;

        try {
            System.out.println("\n---------------------\n" + "*****\tParsing\t*****\n" + "---------------------");
            C_MIPS_semanticLexer lexer = new C_MIPS_semanticLexer(new ANTLRReaderStream(new FileReader(fileIn)));
            tokens = new CommonTokenStream(lexer);
            parser = new C_MIPS_semanticParser(tokens);

            fOut = new FileWriter(fileDebug); // Symbol Table

            parser.init(fOut);
            parser.start();

            saveMessages(fOut);

            if (parser.getErrors().size() == 0) {
                System.out.println("\n*********************************************\n" + "*****\tParsing completato con successo\t*****" + "\n*********************************************");

                System.out.println("\n---------------------\n" + "*****\tDebug\t*****\n" + "---------------------");
                System.out.println(parser.getDebug());

                System.out.println("-------------------------\n" + "*****\tTraduzione\t*****\n" + "-------------------------");
                System.out.println(parser.getTranslation());
                fOut = new FileWriter(fileTraduzione);
                fOut.append(parser.getTranslation());
                fOut.close();

                fOut = new FileWriter(fileErrori);
                fOut.append("Nessun errore!");
                fOut.close();
            } else {
                System.out.println("\n*********************************************\n" + "*****\tParsing completato con " + parser.getErrors().size() + " errori\t*****" + "\n*********************************************");

                System.out.println("\n-----------------------------\n" + "*****\tErrori: #\t" + parser.getErrors().size() + "\t*****\n" + "-----------------------------\n");
                fOut = new FileWriter(fileErrori);
                fOut.append("\n-----------------------------\n" + "*****\tErrori: #\t" + parser.getErrors().size() + "\t*****\n" + "-----------------------------\n");
                for (int i = 0; i < parser.getErrors().size(); i++) {
                    fOut.append((i + 1) + ":" + parser.getErrors().get(i) + "\n");
                    System.out.println((i + 1) + ":" + parser.getErrors().get(i));
                }
                fOut.close();
            }
        } catch (Exception e) {
            System.out.println("\nParsing con ANTLR abortito\n");
            e.printStackTrace();
        }
    }

    static void saveMessages(FileWriter fOut) throws IOException {
        fOut.append("\n---------------------------------\n" + "*****\tGlobal Symbol Table\t*****\n" + "---------------------------------\n");
        System.out.println("\n---------------------------------\n" + "*****\tGlobal Symbol Table\t*****\n" + "---------------------------------");

        Enumeration<String> varList = parser.getSymbolTable().keys();
        int v = 0;
        while (varList.hasMoreElements()) {
            String var = varList.nextElement();
            Object value = parser.getSymbolTable().get(var);
            fOut.append(++v + ":\t" + var + "=" + value + "\n");
            System.out.println(v + ":\t" + var + "=" + value);
        }

        fOut.close();
    }
}
