// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g 2020-11-28 17:08:25

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
	public static final int NEG=13;
	public static final int QC=14;
	public static final int QO=15;
	public static final int VIRG=16;
	public static final int VIRGUP=17;
	public static final int WS=18;

		
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:82:4: ( '{' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:82:6: '{'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:84:4: ( '}' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:84:6: '}'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:86:4: ( '[' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:86:6: '['
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:88:4: ( ']' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:88:6: ']'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:90:6: ( ',' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:90:8: ','
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:92:8: ( '\"' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:92:10: '\"'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:6: ( ':' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:94:8: ':'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:7: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* ) | ( INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:30: ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
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
						case '-':
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
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:31: 'a' .. 'z'
							{
							matchRange('a','z'); 
							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:40: 'A' .. 'Z'
							{
							matchRange('A','Z'); 
							}
							break;
						case 3 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:49: INT
							{
							mINT(); 

							}
							break;
						case 4 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:53: ' '
							{
							match(' '); 
							}
							break;
						case 5 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:57: '_'
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
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:66: ( INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:66: ( INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )* )
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:67: INT ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
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
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:99: ( 'a' .. 'z' | 'A' .. 'Z' | INT | ' ' | '_' )*
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
						case '-':
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
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:100: 'a' .. 'z'
							{
							matchRange('a','z'); 
							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:109: 'A' .. 'Z'
							{
							matchRange('A','Z'); 
							}
							break;
						case 3 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:118: INT
							{
							mINT(); 

							}
							break;
						case 4 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:122: ' '
							{
							match(' '); 
							}
							break;
						case 5 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:96:126: '_'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:98:5: ( ( NEG )? ( '0' .. '9' )+ )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:98:7: ( NEG )? ( '0' .. '9' )+
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:98:7: ( NEG )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='-') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
					{
					if ( input.LA(1)=='-' ) {
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

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:98:11: ( '0' .. '9' )+
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEG"
	public final void mNEG() throws RecognitionException {
		try {
			int _type = NEG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:100:9: ( '-' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:100:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEG"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:107:5: ( ( NEG )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt13=3;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:107:9: ( NEG )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:107:9: ( NEG )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='-') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:
							{
							if ( input.LA(1)=='-' ) {
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

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:107:13: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
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
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match('.'); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:107:29: ( '0' .. '9' )*
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
							break loop8;
						}
					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:107:41: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:107:41: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:108:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:108:13: ( '0' .. '9' )+
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

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:108:25: ( EXPONENT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:108:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:109:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:109:9: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
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
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:113:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='/') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='/') ) {
					alt17=1;
				}
				else if ( (LA17_1=='*') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:113:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:113:14: (~ ( '\\n' | '\\r' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
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
							break loop14;
						}
					}

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:113:28: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:113:28: '\\r'
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
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:114:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:114:14: ( options {greedy=false; } : . )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='*') ) {
							int LA16_1 = input.LA(2);
							if ( (LA16_1=='/') ) {
								alt16=2;
							}
							else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
								alt16=1;
							}

						}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:114:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop16;
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:119:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:119:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:119:22: ( '+' | '-' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='+'||LA18_0=='-') ) {
				alt18=1;
			}
			switch (alt18) {
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

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:119:33: ( '0' .. '9' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
					alt19=1;
				}

				switch (alt19) {
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
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:120:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:120:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:128:2: ( . )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:128:4: .
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
		// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:8: ( GO | GC | QO | QC | VIRG | VIRGUP | DUEP | NAME | INT | NEG | FLOAT | COMMENT | WS | ERROR_TOKEN )
		int alt20=14;
		alt20 = dfa20.predict(input);
		switch (alt20) {
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
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:48: NEG
				{
				mNEG(); 

				}
				break;
			case 11 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:52: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 12 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:58: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 13 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:66: WS
				{
				mWS(); 

				}
				break;
			case 14 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:1:69: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\1\55\1\uffff\1\56\2\uffff";
	static final String DFA13_maxS =
		"\1\71\1\uffff\1\145\2\uffff";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\1\3";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\1\3\1\uffff\12\2",
			"",
			"\1\1\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "106:1: FLOAT : ( ( NEG )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\11\uffff\1\30\1\31\2\16\12\uffff\1\31\2\uffff\1\26\1\31\4\uffff\1\26";
	static final String DFA20_eofS =
		"\41\uffff";
	static final String DFA20_minS =
		"\1\0\10\uffff\1\60\1\40\1\60\1\52\12\uffff\1\40\2\uffff\1\53\1\40\3\uffff"+
		"\2\60";
	static final String DFA20_maxS =
		"\1\uffff\10\uffff\1\71\1\172\1\71\1\57\12\uffff\1\172\2\uffff\1\71\1\172"+
		"\3\uffff\2\71";
	static final String DFA20_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\15\1\16\1\1\1\2\1"+
		"\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\11\2\uffff\1\13\1\14\1\15\2\uffff";
	static final String DFA20_specialS =
		"\1\0\40\uffff}>";
	static final String[] DFA20_transitionS = {
			"\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\6\11\16\1\5\1\11\1\13\1\14\12"+
			"\12\1\7\6\16\32\10\1\3\1\16\1\4\3\16\32\10\1\1\1\16\1\2\uff82\16",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\27",
			"\1\26\15\uffff\1\34\1\uffff\12\33\7\uffff\4\26\1\32\25\26\4\uffff\1"+
			"\26\1\uffff\4\26\1\32\25\26",
			"\12\34",
			"\1\35\4\uffff\1\35",
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
			"\1\26\15\uffff\1\34\1\uffff\12\27\7\uffff\32\26\4\uffff\1\26\1\uffff"+
			"\32\26",
			"",
			"",
			"\1\34\1\uffff\1\37\2\uffff\12\40",
			"\1\26\15\uffff\1\34\1\uffff\12\33\7\uffff\4\26\1\32\25\26\4\uffff\1"+
			"\26\1\uffff\4\26\1\32\25\26",
			"",
			"",
			"",
			"\12\40",
			"\12\40"
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( GO | GC | QO | QC | VIRG | VIRGUP | DUEP | NAME | INT | NEG | FLOAT | COMMENT | WS | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA20_0 = input.LA(1);
						s = -1;
						if ( (LA20_0=='{') ) {s = 1;}
						else if ( (LA20_0=='}') ) {s = 2;}
						else if ( (LA20_0=='[') ) {s = 3;}
						else if ( (LA20_0==']') ) {s = 4;}
						else if ( (LA20_0==',') ) {s = 5;}
						else if ( (LA20_0=='\"') ) {s = 6;}
						else if ( (LA20_0==':') ) {s = 7;}
						else if ( ((LA20_0 >= 'A' && LA20_0 <= 'Z')||(LA20_0 >= 'a' && LA20_0 <= 'z')) ) {s = 8;}
						else if ( (LA20_0=='-') ) {s = 9;}
						else if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {s = 10;}
						else if ( (LA20_0=='.') ) {s = 11;}
						else if ( (LA20_0=='/') ) {s = 12;}
						else if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 13;}
						else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\b')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '\u001F')||LA20_0=='!'||(LA20_0 >= '#' && LA20_0 <= '+')||(LA20_0 >= ';' && LA20_0 <= '@')||LA20_0=='\\'||(LA20_0 >= '^' && LA20_0 <= '`')||LA20_0=='|'||(LA20_0 >= '~' && LA20_0 <= '\uFFFF')) ) {s = 14;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 20, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
