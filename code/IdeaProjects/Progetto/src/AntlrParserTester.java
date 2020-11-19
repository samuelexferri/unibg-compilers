import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.FileReader;

public class AntlrParserTester {
	public static void main(String[] args) {
		AssignmentCompilerParser parser;
		String fileIn = ".\\resources\\input2.file";
  	
  	try {
  		// Inizializzazione del parser (antlr docet):
  		//		1. Si inizializza il lexer
  		//		2. Si crea uno stream di token
  		//		3. si istanzia il parser passandogli lo stream di token

  		// 1. usare la classe del lexer generato
  		AssignmentCompilerLexer  lexer = new AssignmentCompilerLexer (new ANTLRReaderStream(new FileReader(fileIn))); 

  		// 2. 
  		CommonTokenStream tokens = new CommonTokenStream (lexer);	

  		// 3. usare la classe del parser generato
		parser = new AssignmentCompilerParser (tokens);

			
	    // si lancia il parser dallo start simbol (prima produzione specificata)
	    parser.myStartExample();
	    
		System.out.println ("Parsing con ANTLR terminato con successo\n\n");
	    
  	
  	} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }


}
