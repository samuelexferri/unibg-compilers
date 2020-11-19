// $ANTLR 3.5.1 C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g 2020-11-17 17:58:35

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AssignmentCompilerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int EQ=5;
	public static final int ERROR_TOKEN=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int ID=9;
	public static final int INT=10;
	public static final int LP=11;
	public static final int OP=12;
	public static final int RP=13;
	public static final int SC=14;
	public static final int WS=15;

		int prova1;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AssignmentCompilerLexer() {} 
	public AssignmentCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AssignmentCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g"; }

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:44:5: ( ':=' )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:44:7: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "OP"
	public final void mOP() throws RecognitionException {
		try {
			int _type = OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:47:2: ( '+' | '-' | '*' | '/' )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
			{
			if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
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
	// $ANTLR end "OP"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:50:2: ( '(' )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:50:4: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:53:2: ( ')' )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:53:4: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:56:2: ( ';' )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:56:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:58:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:58:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:58:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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
					break loop1;
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
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:61:5: ( ( '0' .. '9' )+ )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:61:7: ( '0' .. '9' )+
			{
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:61:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:65:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:65:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:65:9: ( '0' .. '9' )+
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
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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

					match('.'); 
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:65:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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
							break loop4;
						}
					}

					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:65:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:65:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:66:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:66:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:66:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:66:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:67:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:67:9: ( '0' .. '9' )+
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
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:71:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:71:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:71:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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
							break loop10;
						}
					}

					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:71:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:71:28: '\\r'
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
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:72:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:72:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:72:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
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
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:77:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:77:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:77:22: ( '+' | '-' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+'||LA14_0=='-') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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

			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:77:33: ( '0' .. '9' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:
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
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
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
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:78:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:78:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:86:2: ( . )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:86:4: .
			{
			matchAny(); 
			_channel=HIDDEN;
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
		// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:8: ( EQ | OP | LP | RP | SC | ID | INT | FLOAT | COMMENT | WS | ERROR_TOKEN )
		int alt16=11;
		alt16 = dfa16.predict(input);
		switch (alt16) {
			case 1 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:10: EQ
				{
				mEQ(); 

				}
				break;
			case 2 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:13: OP
				{
				mOP(); 

				}
				break;
			case 3 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:16: LP
				{
				mLP(); 

				}
				break;
			case 4 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:19: RP
				{
				mRP(); 

				}
				break;
			case 5 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:22: SC
				{
				mSC(); 

				}
				break;
			case 6 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:25: ID
				{
				mID(); 

				}
				break;
			case 7 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:28: INT
				{
				mINT(); 

				}
				break;
			case 8 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:32: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 9 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:38: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 10 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:46: WS
				{
				mWS(); 

				}
				break;
			case 11 :
				// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:1:49: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "64:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA16_eotS =
		"\1\uffff\1\13\1\16\4\uffff\1\23\1\13\13\uffff\1\23\2\uffff";
	static final String DFA16_eofS =
		"\27\uffff";
	static final String DFA16_minS =
		"\1\0\1\75\1\52\4\uffff\1\56\1\60\13\uffff\1\56\2\uffff";
	static final String DFA16_maxS =
		"\1\uffff\1\75\1\57\4\uffff\1\145\1\71\13\uffff\1\145\2\uffff";
	static final String DFA16_acceptS =
		"\3\uffff\1\3\1\4\1\5\1\6\2\uffff\1\2\1\12\1\13\1\1\1\11\1\2\1\3\1\4\1"+
		"\5\1\6\1\7\1\uffff\1\10\1\12";
	static final String DFA16_specialS =
		"\1\0\26\uffff}>";
	static final String[] DFA16_transitionS = {
			"\11\13\2\12\2\13\1\12\22\13\1\12\7\13\1\3\1\4\2\11\1\13\1\11\1\10\1\2"+
			"\12\7\1\1\1\5\5\13\32\6\4\13\1\6\1\13\32\6\uff85\13",
			"\1\14",
			"\1\15\4\uffff\1\15",
			"",
			"",
			"",
			"",
			"\1\25\1\uffff\12\24\13\uffff\1\25\37\uffff\1\25",
			"\12\25",
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
			"\1\25\1\uffff\12\24\13\uffff\1\25\37\uffff\1\25",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( EQ | OP | LP | RP | SC | ID | INT | FLOAT | COMMENT | WS | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_0 = input.LA(1);
						s = -1;
						if ( (LA16_0==':') ) {s = 1;}
						else if ( (LA16_0=='/') ) {s = 2;}
						else if ( (LA16_0=='(') ) {s = 3;}
						else if ( (LA16_0==')') ) {s = 4;}
						else if ( (LA16_0==';') ) {s = 5;}
						else if ( ((LA16_0 >= 'A' && LA16_0 <= 'Z')||LA16_0=='_'||(LA16_0 >= 'a' && LA16_0 <= 'z')) ) {s = 6;}
						else if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {s = 7;}
						else if ( (LA16_0=='.') ) {s = 8;}
						else if ( ((LA16_0 >= '*' && LA16_0 <= '+')||LA16_0=='-') ) {s = 9;}
						else if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 10;}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\b')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '\u001F')||(LA16_0 >= '!' && LA16_0 <= '\'')||LA16_0==','||(LA16_0 >= '<' && LA16_0 <= '@')||(LA16_0 >= '[' && LA16_0 <= '^')||LA16_0=='`'||(LA16_0 >= '{' && LA16_0 <= '\uFFFF')) ) {s = 11;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 16, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
