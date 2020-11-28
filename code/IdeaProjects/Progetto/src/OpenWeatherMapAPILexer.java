// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g 2020-11-28 16:42:59

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OpenWeatherMapAPILexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DUEP=5;
	public static final int ERROR_TOKEN=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int GC=9;
	public static final int GO=10;
	public static final int INT=11;
	public static final int NAME=12;
	public static final int QC=13;
	public static final int QO=14;
	public static final int VIRG=15;
	public static final int VIRGUP=16;
	public static final int WS=17;

		
		int nErrori = 0;
		
		void printMsg () {
			nErrori++;
			System.out.println("n. Errori Trovati: \t" + nErrori);
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public OpenWeatherMapAPILexer() {} 
	public OpenWeatherMapAPILexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public OpenWeatherMapAPILexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g"; }

	// $ANTLR start "GO"
	public final void mGO() throws RecognitionException {
		try {
			int _type = GO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:80:4: ( '{' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:80:6: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GO"

	// $ANTLR start "GC"
	public final void mGC() throws RecognitionException {
		try {
			int _type = GC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:82:4: ( '}' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:82:6: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GC"

	// $ANTLR start "QO"
	public final void mQO() throws RecognitionException {
		try {
			int _type = QO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:84:4: ( '[' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:84:6: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QO"

	// $ANTLR start "QC"
	public final void mQC() throws RecognitionException {
		try {
			int _type = QC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:86:4: ( ']' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:86:6: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QC"

	// $ANTLR start "VIRG"
	public final void mVIRG() throws RecognitionException {
		try {
			int _type = VIRG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:88:6: ( ',' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:88:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VIRG"

	// $ANTLR start "VIRGUP"
	public final void mVIRGUP() throws RecognitionException {
		try {
			int _type = VIRGUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:90:8: ( '\"' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:90:10: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VIRGUP"

	// $ANTLR start "DUEP"
	public final void mDUEP() throws RecognitionException {
		try {
			int _type = DUEP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:92:6: ( ':' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:92:8: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DUEP"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:7: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* ) | ( INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:30: ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
					loop1:
					while (true) {
						int alt1=6;
						switch ( input.LA(1) ) {
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
						case 'g':
						case 'h':
						case 'i':
						case 'j':
						case 'k':
						case 'l':
						case 'm':
						case 'n':
						case 'o':
						case 'p':
						case 'q':
						case 'r':
						case 's':
						case 't':
						case 'u':
						case 'v':
						case 'w':
						case 'x':
						case 'y':
						case 'z':
							{
							alt1=1;
							}
							break;
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
						case 'G':
						case 'H':
						case 'I':
						case 'J':
						case 'K':
						case 'L':
						case 'M':
						case 'N':
						case 'O':
						case 'P':
						case 'Q':
						case 'R':
						case 'S':
						case 'T':
						case 'U':
						case 'V':
						case 'W':
						case 'X':
						case 'Y':
						case 'Z':
							{
							alt1=2;
							}
							break;
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							{
							alt1=3;
							}
							break;
						case ' ':
							{
							alt1=4;
							}
							break;
						case '_':
							{
							alt1=5;
							}
							break;
						}
						switch (alt1) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:31: 'a' .. 'z'
							{
							matchRange('a','z'); 
							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:40: 'A' .. 'Z'
							{
							matchRange('A','Z'); 
							}
							break;
						case 3 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:49: INT
							{
							mINT(); 

							}
							break;
						case 4 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:53: ' '
							{
							match(' '); 
							}
							break;
						case 5 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:57: '_'
							{
							match('_'); 
							}
							break;

						default :
							break loop1;
						}
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:66: ( INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:66: ( INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:67: INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
					{
					mINT(); 

					if ( input.LA(1)==' '||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:99: ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
					loop2:
					while (true) {
						int alt2=6;
						switch ( input.LA(1) ) {
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
						case 'g':
						case 'h':
						case 'i':
						case 'j':
						case 'k':
						case 'l':
						case 'm':
						case 'n':
						case 'o':
						case 'p':
						case 'q':
						case 'r':
						case 's':
						case 't':
						case 'u':
						case 'v':
						case 'w':
						case 'x':
						case 'y':
						case 'z':
							{
							alt2=1;
							}
							break;
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
						case 'G':
						case 'H':
						case 'I':
						case 'J':
						case 'K':
						case 'L':
						case 'M':
						case 'N':
						case 'O':
						case 'P':
						case 'Q':
						case 'R':
						case 'S':
						case 'T':
						case 'U':
						case 'V':
						case 'W':
						case 'X':
						case 'Y':
						case 'Z':
							{
							alt2=2;
							}
							break;
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							{
							alt2=3;
							}
							break;
						case ' ':
							{
							alt2=4;
							}
							break;
						case '_':
							{
							alt2=5;
							}
							break;
						}
						switch (alt2) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:100: 'a' .. 'z'
							{
							matchRange('a','z'); 
							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:109: 'A' .. 'Z'
							{
							matchRange('A','Z'); 
							}
							break;
						case 3 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:118: INT
							{
							mINT(); 

							}
							break;
						case 4 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:122: ' '
							{
							match(' '); 
							}
							break;
						case 5 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:126: '_'
							{
							match('_'); 
							}
							break;

						default :
							break loop2;
						}
					}

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:7: ( '0' .. '9' )+
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:7: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:104:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:104:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:104:9: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match('.'); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:104:25: ( '0' .. '9' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:104:37: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:104:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:105:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:105:13: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:105:25: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:105:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:106:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:106:9: ( '0' .. '9' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:110:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='/') ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1=='/') ) {
					alt15=1;
				}
				else if ( (LA15_1=='*') ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:110:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:110:14: (~ ( '\\n' | '\\r' ) )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop12;
						}
					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:110:28: ( '\\r' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='\r') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:110:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:111:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:111:14: ( options {greedy=false; } : . )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0=='*') ) {
							int LA14_1 = input.LA(2);
							if ( (LA14_1=='/') ) {
								alt14=2;
							}
							else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
								alt14=1;
							}

						}
						else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:111:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop14;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:116:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:116:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:116:22: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:116:33: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:117:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:117:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ERROR_TOKEN"
	public final void mERROR_TOKEN() throws RecognitionException {
		try {
			int _type = ERROR_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:125:2: ( . )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:125:4: .
			{
			matchAny(); 
			printMsg();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TOKEN"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:8: ( GO | GC | QO | QC | VIRG | VIRGUP | DUEP | NAME | INT | FLOAT | COMMENT | WS | ERROR_TOKEN )
		int alt18=13;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:10: GO
				{
				mGO(); 

				}
				break;
			case 2 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:13: GC
				{
				mGC(); 

				}
				break;
			case 3 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:16: QO
				{
				mQO(); 

				}
				break;
			case 4 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:19: QC
				{
				mQC(); 

				}
				break;
			case 5 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:22: VIRG
				{
				mVIRG(); 

				}
				break;
			case 6 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:27: VIRGUP
				{
				mVIRGUP(); 

				}
				break;
			case 7 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:34: DUEP
				{
				mDUEP(); 

				}
				break;
			case 8 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:39: NAME
				{
				mNAME(); 

				}
				break;
			case 9 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:44: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:48: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 11 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:54: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 12 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:62: WS
				{
				mWS(); 

				}
				break;
			case 13 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:65: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\56\3\uffff";
	static final String DFA11_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "103:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA18_eotS =
		"\11\uffff\1\26\2\15\13\uffff\1\25\1\26\3\uffff\1\25";
	static final String DFA18_eofS =
		"\35\uffff";
	static final String DFA18_minS =
		"\1\0\10\uffff\1\40\1\60\1\52\13\uffff\1\53\1\40\3\uffff\1\60";
	static final String DFA18_maxS =
		"\1\uffff\10\uffff\1\172\1\71\1\57\13\uffff\1\71\1\172\3\uffff\1\71";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\14\1\15\1\1\1\2\1"+
		"\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\12\1\13\1\14\1\uffff";
	static final String DFA18_specialS =
		"\1\0\34\uffff}>";
	static final String[] DFA18_transitionS = {
			"\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\6\11\15\1\5\1\15\1\12\1\13\12"+
			"\11\1\7\6\15\32\10\1\3\1\15\1\4\3\15\32\10\1\1\1\15\1\2\uff82\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\25\15\uffff\1\31\1\uffff\12\30\7\uffff\4\25\1\27\25\25\4\uffff\1"+
			"\25\1\uffff\4\25\1\27\25\25",
			"\12\31",
			"\1\32\4\uffff\1\32",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\31\1\uffff\1\31\2\uffff\12\34",
			"\1\25\15\uffff\1\31\1\uffff\12\30\7\uffff\4\25\1\27\25\25\4\uffff\1"+
			"\25\1\uffff\4\25\1\27\25\25",
			"",
			"",
			"",
			"\12\34"
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( GO | GC | QO | QC | VIRG | VIRGUP | DUEP | NAME | INT | FLOAT | COMMENT | WS | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA18_0 = input.LA(1);
						s = -1;
						if ( (LA18_0=='{') ) {s = 1;}
						else if ( (LA18_0=='}') ) {s = 2;}
						else if ( (LA18_0=='[') ) {s = 3;}
						else if ( (LA18_0==']') ) {s = 4;}
						else if ( (LA18_0==',') ) {s = 5;}
						else if ( (LA18_0=='\"') ) {s = 6;}
						else if ( (LA18_0==':') ) {s = 7;}
						else if ( ((LA18_0 >= 'A' && LA18_0 <= 'Z')||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {s = 8;}
						else if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {s = 9;}
						else if ( (LA18_0=='.') ) {s = 10;}
						else if ( (LA18_0=='/') ) {s = 11;}
						else if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 12;}
						else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\b')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '\u001F')||LA18_0=='!'||(LA18_0 >= '#' && LA18_0 <= '+')||LA18_0=='-'||(LA18_0 >= ';' && LA18_0 <= '@')||LA18_0=='\\'||(LA18_0 >= '^' && LA18_0 <= '`')||LA18_0=='|'||(LA18_0 >= '~' && LA18_0 <= '\uFFFF')) ) {s = 13;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 18, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
