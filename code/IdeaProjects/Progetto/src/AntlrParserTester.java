import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.FileReader;

public class AntlrParserTester {
    public static void main(String[] args) {
        OpenWeatherMapAPIParser parser;
        String fileIn = ".\\resources\\current_example.json";

        try {
            // Inizializzazione del parser (antlr docet):
            // 1. Si inizializza il lexer
            // 2. Si crea uno stream di token
            // 3. si istanzia il parser passandogli lo stream di token

            // 1. Usare la classe del lexer generato
            OpenWeatherMapAPILexer lexer = new OpenWeatherMapAPILexer(new ANTLRReaderStream(new FileReader(fileIn)));

            // 2. Token
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 3. Usare la classe del parser generato
            parser = new OpenWeatherMapAPIParser(tokens);
            // Si lancia il parser dallo start symbol (prima produzione specificata)
            parser.myStartExample();

            System.out.println("Parsing con ANTLR terminato con successo\n\n");

        } catch (Exception e) {
            System.out.println("Parsing con ANTLR abortito\n\n");
            e.printStackTrace();
        }
    }
}
