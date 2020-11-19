// $ANTLR 3.5.1 C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g 2020-11-10 17:58:59

	// package myCompiler;


import org.antlr.runtime.*;

@SuppressWarnings("all")
public class AntlrScanner extends Lexer {
	public static final int EOF=-1;
	public static final int AT=4;
	public static final int BLOCK=5;
	public static final int CHAR=6;
	public static final int COMMENT=7;
	public static final int DEF=8;
	public static final int ESC_SEQ=9;
	public static final int EXPONENT=10;
	public static final int FLOAT=11;
	public static final int HEX_DIGIT=12;
	public static final int ID=13;
	public static final int INT=14;
	public static final int OCTAL_ESC=15;
	public static final int PAR=16;
	public static final int PUNTEGGIATURA=17;
	public static final int STRING=18;
	public static final int TOKEN_ERROR=19;
	public static final int UNICODE_ESC=20;
	public static final int WS=21;

		int nErrori = 0;
		
		void printMsg(){
			nErrori++;
			System.out.println("Numero errori trovati: \t" + nErrori);
		}

		String formatToken () {
			return "";
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AntlrScanner() {} 
	public AntlrScanner(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AntlrScanner(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g"; }

	// $ANTLR start "PUNTEGGIATURA"
	public final void mPUNTEGGIATURA() throws RecognitionException {
		try {
			int _type = PUNTEGGIATURA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:25:2: ( ';' | '.' | ':' | '|' )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
			{
			if ( input.LA(1)=='.'||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUNTEGGIATURA"

	// $ANTLR start "DEF"
	public final void mDEF() throws RecognitionException {
		try {
			int _type = DEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:32:2: ( '::' )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:32:4: '::'
			{
			match("::"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEF"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:36:2: ( '@' )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:36:4: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "BLOCK"
	public final void mBLOCK() throws RecognitionException {
		try {
			int _type = BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:40:5: ( '{' ( options {greedy=false; } : . )* '}' )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:40:10: '{' ( options {greedy=false; } : . )* '}'
			{
			match('{'); 
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:40:14: ( options {greedy=false; } : . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='}') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '|')||(LA1_0 >= '~' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:40:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('}'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLOCK"

	// $ANTLR start "PAR"
	public final void mPAR() throws RecognitionException {
		try {
			int _type = PAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:44:3: ( '(' | ')' )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
			{
			if ( (input.LA(1) >= '(' && input.LA(1) <= ')') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:47:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:47:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:47:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:50:5: ( ( '0' .. '9' )+ )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:50:7: ( '0' .. '9' )+
			{
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:50:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:54:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt10=3;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:54:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:54:9: ( '0' .. '9' )+
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
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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

					match('.'); 
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:54:25: ( '0' .. '9' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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
							break loop5;
						}
					}

					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:54:37: ( EXPONENT )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='E'||LA6_0=='e') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:54:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:55:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:55:13: ( '0' .. '9' )+
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
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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

					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:55:25: ( EXPONENT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:55:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:56:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:56:9: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
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
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:60:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='/') ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1=='/') ) {
					alt14=1;
				}
				else if ( (LA14_1=='*') ) {
					alt14=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:60:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:60:14: (~ ( '\\n' | '\\r' ) )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\uFFFF')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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
							break loop11;
						}
					}

					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:60:28: ( '\\r' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='\r') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:60:28: '\\r'
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
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:61:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:61:14: ( options {greedy=false; } : . )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0=='*') ) {
							int LA13_1 = input.LA(2);
							if ( (LA13_1=='/') ) {
								alt13=2;
							}
							else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
								alt13=1;
							}

						}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:61:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop13;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:64:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:64:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:72:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:72:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:72:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='\\') ) {
					alt15=1;
				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:72:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:72:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop15;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:75:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:75:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:75:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='\\') ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:75:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:75:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:79:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:79:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:79:22: ( '+' | '-' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='+'||LA17_0=='-') ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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

			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:79:33: ( '0' .. '9' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
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
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:82:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:86:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt19=1;
					}
					break;
				case 'u':
					{
					alt19=2;
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
					{
					alt19=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:86:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:87:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:88:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:93:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\\') ) {
				int LA20_1 = input.LA(2);
				if ( ((LA20_1 >= '0' && LA20_1 <= '3')) ) {
					int LA20_2 = input.LA(3);
					if ( ((LA20_2 >= '0' && LA20_2 <= '7')) ) {
						int LA20_4 = input.LA(4);
						if ( ((LA20_4 >= '0' && LA20_4 <= '7')) ) {
							alt20=1;
						}

						else {
							alt20=2;
						}

					}

					else {
						alt20=3;
					}

				}
				else if ( ((LA20_1 >= '4' && LA20_1 <= '7')) ) {
					int LA20_3 = input.LA(3);
					if ( ((LA20_3 >= '0' && LA20_3 <= '7')) ) {
						alt20=2;
					}

					else {
						alt20=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:93:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:94:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:95:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:100:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:100:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "TOKEN_ERROR"
	public final void mTOKEN_ERROR() throws RecognitionException {
		try {
			int _type = TOKEN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:104:2: ( . )
			// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:104:4: .
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
	// $ANTLR end "TOKEN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:8: ( PUNTEGGIATURA | DEF | AT | BLOCK | PAR | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | TOKEN_ERROR )
		int alt21=13;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:10: PUNTEGGIATURA
				{
				mPUNTEGGIATURA(); 

				}
				break;
			case 2 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:24: DEF
				{
				mDEF(); 

				}
				break;
			case 3 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:28: AT
				{
				mAT(); 

				}
				break;
			case 4 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:31: BLOCK
				{
				mBLOCK(); 

				}
				break;
			case 5 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:37: PAR
				{
				mPAR(); 

				}
				break;
			case 6 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:41: ID
				{
				mID(); 

				}
				break;
			case 7 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:44: INT
				{
				mINT(); 

				}
				break;
			case 8 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:48: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 9 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:54: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 10 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:62: WS
				{
				mWS(); 

				}
				break;
			case 11 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:65: STRING
				{
				mSTRING(); 

				}
				break;
			case 12 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:72: CHAR
				{
				mCHAR(); 

				}
				break;
			case 13 :
				// C:\\Google Drive\\Universit�\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AntlrScanner.g:1:77: TOKEN_ERROR
				{
				mTOKEN_ERROR(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA10_eotS =
		"\5\uffff";
	static final String DFA10_eofS =
		"\5\uffff";
	static final String DFA10_minS =
		"\2\56\3\uffff";
	static final String DFA10_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA10_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA10_specialS =
		"\5\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "53:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA21_eotS =
		"\1\uffff\2\17\1\uffff\1\15\2\uffff\1\25\1\uffff\1\15\1\uffff\2\15\11\uffff"+
		"\1\25\4\uffff";
	static final String DFA21_eofS =
		"\33\uffff";
	static final String DFA21_minS =
		"\1\0\1\72\1\60\1\uffff\1\0\2\uffff\1\56\1\uffff\1\52\1\uffff\2\0\11\uffff"+
		"\1\56\4\uffff";
	static final String DFA21_maxS =
		"\1\uffff\1\72\1\71\1\uffff\1\uffff\2\uffff\1\145\1\uffff\1\57\1\uffff"+
		"\2\uffff\11\uffff\1\145\4\uffff";
	static final String DFA21_acceptS =
		"\3\uffff\1\3\1\uffff\1\5\1\6\1\uffff\1\1\1\uffff\1\12\2\uffff\1\15\1\2"+
		"\1\1\1\10\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14";
	static final String DFA21_specialS =
		"\1\0\3\uffff\1\1\6\uffff\1\2\1\3\16\uffff}>";
	static final String[] DFA21_transitionS = {
			"\11\15\2\12\2\15\1\12\22\15\1\12\1\15\1\13\4\15\1\14\2\5\4\15\1\2\1\11"+
			"\12\7\1\1\1\10\4\15\1\3\32\6\4\15\1\6\1\15\32\6\1\4\1\10\uff83\15",
			"\1\16",
			"\12\20",
			"",
			"\0\22",
			"",
			"",
			"\1\20\1\uffff\12\26\13\uffff\1\20\37\uffff\1\20",
			"",
			"\1\27\4\uffff\1\27",
			"",
			"\0\31",
			"\47\32\1\uffff\uffd8\32",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\20\1\uffff\12\26\13\uffff\1\20\37\uffff\1\20",
			"",
			"",
			"",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( PUNTEGGIATURA | DEF | AT | BLOCK | PAR | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | TOKEN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_0 = input.LA(1);
						s = -1;
						if ( (LA21_0==':') ) {s = 1;}
						else if ( (LA21_0=='.') ) {s = 2;}
						else if ( (LA21_0=='@') ) {s = 3;}
						else if ( (LA21_0=='{') ) {s = 4;}
						else if ( ((LA21_0 >= '(' && LA21_0 <= ')')) ) {s = 5;}
						else if ( ((LA21_0 >= 'A' && LA21_0 <= 'Z')||LA21_0=='_'||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {s = 6;}
						else if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {s = 7;}
						else if ( (LA21_0==';'||LA21_0=='|') ) {s = 8;}
						else if ( (LA21_0=='/') ) {s = 9;}
						else if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 10;}
						else if ( (LA21_0=='\"') ) {s = 11;}
						else if ( (LA21_0=='\'') ) {s = 12;}
						else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '\b')||(LA21_0 >= '\u000B' && LA21_0 <= '\f')||(LA21_0 >= '\u000E' && LA21_0 <= '\u001F')||LA21_0=='!'||(LA21_0 >= '#' && LA21_0 <= '&')||(LA21_0 >= '*' && LA21_0 <= '-')||(LA21_0 >= '<' && LA21_0 <= '?')||(LA21_0 >= '[' && LA21_0 <= '^')||LA21_0=='`'||(LA21_0 >= '}' && LA21_0 <= '\uFFFF')) ) {s = 13;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA21_4 = input.LA(1);
						s = -1;
						if ( ((LA21_4 >= '\u0000' && LA21_4 <= '\uFFFF')) ) {s = 18;}
						else s = 13;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA21_11 = input.LA(1);
						s = -1;
						if ( ((LA21_11 >= '\u0000' && LA21_11 <= '\uFFFF')) ) {s = 25;}
						else s = 13;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA21_12 = input.LA(1);
						s = -1;
						if ( ((LA21_12 >= '\u0000' && LA21_12 <= '&')||(LA21_12 >= '(' && LA21_12 <= '\uFFFF')) ) {s = 26;}
						else s = 13;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 21, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
