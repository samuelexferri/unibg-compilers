import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

import java.io.FileReader;


public class AntlrScannerTester {

    public static void main(String[] args) {
        String fileIn = ".\\resources\\AntlrSpecificaTestare.g";

        Token tk;
        int i;

        try {
            System.out.println("Test ANTLR lexer");
            // Istanzio lo scanner passandogli un stream di ingresso
            AntlrScanner lexer = new AntlrScanner(new ANTLRReaderStream(new FileReader(fileIn)));

            i = 1;
            // Attivo un ciclo che scandisce lo stream dall'inizio alla fine richiedendo ogni volta allo scanner di fornire il token successivo (metodo nextToken) fino ad incontrare l' End Of File EOF
            while ((tk = lexer.nextToken()).getType() != AntlrScanner.EOF) {
                // Stampo a video le informazioni relative ai token rilevati
                if (tk.getChannel() != AntlrScanner.HIDDEN)
                    System.out.println("Token " + i++ + ": (" +
                            tk.getLine() + "," +
                            tk.getCharPositionInLine() + ")\t" +
                            "TokenType:" + tk.getType() +
                            ":\t" + tk.getText());
            }

        } catch (Exception e) {
            System.out.println("Test ANTLR abortito");
            e.printStackTrace();
        }
    }
}
