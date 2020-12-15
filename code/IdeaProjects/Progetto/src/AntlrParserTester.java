import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;

public class AntlrParserTester {
    static C_MIPS_semanticParser parser;
    static String fileIn = ".\\resources\\test_semantic_C";
    static String fileOut = ".\\resources\\fileOut.txt";
    static String fileMsg = ".\\resources\\fileMsg.txt";
    static String fileErr = ".\\resources\\fileErr.txt";

    public static void main(String[] args) throws IOException {
        CommonTokenStream tokens;
        FileWriter fOut;

        try {
            System.out.println("\n---------------------\n" + "*****\tParsing\t*****\n" + "---------------------");
            C_MIPS_semanticLexer lexer = new C_MIPS_semanticLexer(new ANTLRReaderStream(new FileReader(fileIn)));
            tokens = new CommonTokenStream(lexer);
            parser = new C_MIPS_semanticParser(tokens);

            parser.init();
            parser.start();

            saveMessages();

            if (parser.getErrors().size() == 0) {
                System.out.println("\n-----------------------------\n" + "*****\tParsing completato con successo\t*****\n" + "-----------------------------\n");

                System.out.println("\n--------------------------\n" + "*****\tTraduzione\t*****\n" + "--------------------------");
                System.out.println(parser.getTranslation());
                fOut = new FileWriter(fileOut);
                fOut.append(parser.getTranslation());
                fOut.close();
            } else {
                System.out.println("\n*********************************************\n" + "*****\tParsing completato con " + parser.getErrors().size() + " errori\t*****" + "\n*********************************************");

                System.out.println("\n-----------------------------\n" + "*****\tErrori: #\t" + parser.getErrors().size() + "\t*****\n" + "-----------------------------\n");
                fOut = new FileWriter(fileErr);
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

    static void saveMessages() throws IOException {
        FileWriter fOut = new FileWriter(fileMsg);

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

        // TODO: Per ora solo l'ultima locale
        fOut.append("\n---------------------------------\n" + "*****\tLocal Symbol Table\t*****\n" + "---------------------------------\n");
        System.out.println("\n---------------------------------\n" + "*****\tLocal Symbol Table\t*****\n" + "---------------------------------");
        Enumeration<String> varList2 = parser.getSymbolTableLocal().keys();
        v = 0;
        while (varList2.hasMoreElements()) {
            String var = varList2.nextElement();
            Object value = parser.getSymbolTableLocal().get(var);
            fOut.append(++v + ":\t" + var + "=" + value + "\n");
            System.out.println(v + ":\t" + var + "=" + value);
        }

        fOut.close();
    }
}
