// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g 2021-01-22 17:31:26

	// package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPS_semanticLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AMP=5;
	public static final int ARROW=6;
	public static final int ASS=7;
	public static final int BACKSLASH=8;
	public static final int CHAR=9;
	public static final int CHAR_QUOTE=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int DIGIT=13;
	public static final int DIGIT_NO_ZERO=14;
	public static final int DIV=15;
	public static final int DOT=16;
	public static final int D_QUOTE=17;
	public static final int ELSE=18;
	public static final int EQ=19;
	public static final int FLOAT=20;
	public static final int FOR=21;
	public static final int GE=22;
	public static final int GT=23;
	public static final int HASHTAG=24;
	public static final int IF=25;
	public static final int INCLUDE=26;
	public static final int INT=27;
	public static final int K_CHAR=28;
	public static final int K_FLOAT=29;
	public static final int K_INT=30;
	public static final int LBRACK=31;
	public static final int LCURL=32;
	public static final int LE=33;
	public static final int LPAREN=34;
	public static final int LT=35;
	public static final int MULT=36;
	public static final int NEQ=37;
	public static final int NEWL=38;
	public static final int OR=39;
	public static final int PERC=40;
	public static final int RBRACK=41;
	public static final int RCURL=42;
	public static final int RETURN=43;
	public static final int RPAREN=44;
	public static final int SEMICOL=45;
	public static final int SLASHR=46;
	public static final int SPACE=47;
	public static final int SUB=48;
	public static final int S_QUOTE=49;
	public static final int TAB=50;
	public static final int TOKEN_ERROR=51;
	public static final int UNDRSCR=52;
	public static final int VOID=53;
	public static final int WHILE=54;
	public static final int WORD=55;
	public static final int WS=56;

		int nErrori = 0;
		
		void printMsg() {
			nErrori++;
			System.out.println("\n*********************************************\n" + "*****\tLexing completato con " + nErrori + " errori\t*****" + "\n*********************************************");
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public C_MIPS_semanticLexer() {} 
	public C_MIPS_semanticLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public C_MIPS_semanticLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g"; }

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:209:18: ( '0' .. '9' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "DIGIT_NO_ZERO"
	public final void mDIGIT_NO_ZERO() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:210:24: ( '1' .. '9' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
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
	// $ANTLR end "DIGIT_NO_ZERO"

	// $ANTLR start "UNDRSCR"
	public final void mUNDRSCR() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:211:18: ( '_' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:211:20: '_'
			{
			match('_'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDRSCR"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:212:17: ( ' ' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:212:19: ' '
			{
			match(' '); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "TAB"
	public final void mTAB() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:213:15: ( '\\t' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:213:17: '\\t'
			{
			match('\t'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAB"

	// $ANTLR start "NEWL"
	public final void mNEWL() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:214:18: ( '\\n' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:214:20: '\\n'
			{
			match('\n'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWL"

	// $ANTLR start "SLASHR"
	public final void mSLASHR() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:215:18: ( '\\r' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:215:20: '\\r'
			{
			match('\r'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASHR"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:216:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "CHAR"

	// $ANTLR start "BACKSLASH"
	public final void mBACKSLASH() throws RecognitionException {
		try {
			int _type = BACKSLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:218:12: ( '\\\\' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:218:14: '\\\\'
			{
			match('\\'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACKSLASH"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:220:5: ( ( SPACE | TAB | NEWL | SLASHR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:220:7: ( SPACE | TAB | NEWL | SLASHR )
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

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:227:10: ( '#include' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:227:12: '#include'
			{
			match("#include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "K_INT"
	public final void mK_INT() throws RecognitionException {
		try {
			int _type = K_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:229:8: ( 'int' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:229:10: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INT"

	// $ANTLR start "K_FLOAT"
	public final void mK_FLOAT() throws RecognitionException {
		try {
			int _type = K_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:230:10: ( 'float' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:230:12: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FLOAT"

	// $ANTLR start "K_CHAR"
	public final void mK_CHAR() throws RecognitionException {
		try {
			int _type = K_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:231:9: ( 'char' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:231:11: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CHAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:233:8: ( 'void' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:233:10: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:234:10: ( 'while' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:234:12: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:235:7: ( 'for' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:235:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:236:7: ( 'if' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:236:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:237:8: ( 'else' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:237:10: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:238:10: ( 'return' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:238:12: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:240:7: ( '==' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:240:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:241:7: ( '!=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:241:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:242:7: ( '>' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:242:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:243:7: ( '<' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:243:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:244:6: ( '>=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:244:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:245:7: ( '<=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:245:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "ASS"
	public final void mASS() throws RecognitionException {
		try {
			int _type = ASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:247:7: ( '=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:247:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASS"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:249:7: ( '+' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:249:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:250:7: ( '-' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:250:9: '-'
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
	// $ANTLR end "SUB"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:251:8: ( '*' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:251:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:252:7: ( '/' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:252:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:253:12: ( '(' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:253:14: '('
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
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:254:10: ( ')' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:254:12: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:255:10: ( '[' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:255:12: '['
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
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:256:11: ( ']' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:256:13: ']'
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
	// $ANTLR end "RBRACK"

	// $ANTLR start "LCURL"
	public final void mLCURL() throws RecognitionException {
		try {
			int _type = LCURL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:257:9: ( '{' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:257:11: '{'
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
	// $ANTLR end "LCURL"

	// $ANTLR start "RCURL"
	public final void mRCURL() throws RecognitionException {
		try {
			int _type = RCURL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:258:9: ( '}' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:258:11: '}'
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
	// $ANTLR end "RCURL"

	// $ANTLR start "SEMICOL"
	public final void mSEMICOL() throws RecognitionException {
		try {
			int _type = SEMICOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:259:10: ( ';' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:259:12: ';'
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
	// $ANTLR end "SEMICOL"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:260:7: ( '.' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:260:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:261:9: ( '->' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:261:11: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW"

	// $ANTLR start "S_QUOTE"
	public final void mS_QUOTE() throws RecognitionException {
		try {
			int _type = S_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:262:10: ( '\\'' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:262:12: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S_QUOTE"

	// $ANTLR start "D_QUOTE"
	public final void mD_QUOTE() throws RecognitionException {
		try {
			int _type = D_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:263:10: ( '\"' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:263:12: '\"'
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
	// $ANTLR end "D_QUOTE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:264:8: ( ',' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:264:10: ','
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
	// $ANTLR end "COMMA"

	// $ANTLR start "AMP"
	public final void mAMP() throws RecognitionException {
		try {
			int _type = AMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:265:11: ( '&' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:265:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMP"

	// $ANTLR start "PERC"
	public final void mPERC() throws RecognitionException {
		try {
			int _type = PERC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:266:7: ( '%' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:266:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERC"

	// $ANTLR start "HASHTAG"
	public final void mHASHTAG() throws RecognitionException {
		try {
			int _type = HASHTAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:267:10: ( '#' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:267:12: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASHTAG"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:268:6: ( '|' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:268:8: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:270:7: ( DIGIT_NO_ZERO ( DIGIT )* | '0' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
				alt2=1;
			}
			else if ( (LA2_0=='0') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:270:9: DIGIT_NO_ZERO ( DIGIT )*
					{
					mDIGIT_NO_ZERO(); 

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:270:23: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
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
							break loop1;
						}
					}

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:271:6: '0'
					{
					match('0'); 
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
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:272:8: ( ( DIGIT )+ DOT ( DIGIT )+ )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:272:10: ( DIGIT )+ DOT ( DIGIT )+
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:272:10: ( DIGIT )+
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
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

			mDOT(); 

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:272:21: ( DIGIT )+
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "CHAR_QUOTE"
	public final void mCHAR_QUOTE() throws RecognitionException {
		try {
			int _type = CHAR_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:273:12: ( S_QUOTE ( DIGIT | CHAR | BACKSLASH ( '0' | 'n' ) ) S_QUOTE )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:273:14: S_QUOTE ( DIGIT | CHAR | BACKSLASH ( '0' | 'n' ) ) S_QUOTE
			{
			mS_QUOTE(); 

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:273:22: ( DIGIT | CHAR | BACKSLASH ( '0' | 'n' ) )
			int alt5=3;
			switch ( input.LA(1) ) {
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
				alt5=1;
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
				alt5=2;
				}
				break;
			case '\\':
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:273:23: DIGIT
					{
					mDIGIT(); 

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:274:10: CHAR
					{
					mCHAR(); 

					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:275:10: BACKSLASH ( '0' | 'n' )
					{
					mBACKSLASH(); 

					if ( input.LA(1)=='0'||input.LA(1)=='n' ) {
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

			mS_QUOTE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_QUOTE"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			int _type = WORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:277:8: ( CHAR ( CHAR | UNDRSCR | DIGIT )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:277:10: CHAR ( CHAR | UNDRSCR | DIGIT )*
			{
			mCHAR(); 

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:277:15: ( CHAR | UNDRSCR | DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
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
					break loop6;
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
	// $ANTLR end "WORD"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:279:10: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='/') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='/') ) {
					alt10=1;
				}
				else if ( (LA10_1=='*') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:279:12: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:279:17: (~ ( '\\n' | '\\r' ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:
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
							break loop7;
						}
					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:279:31: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:279:31: '\\r'
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:280:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:280:14: ( options {greedy=false; } : . )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0=='*') ) {
							int LA9_1 = input.LA(2);
							if ( (LA9_1=='/') ) {
								alt9=2;
							}
							else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
								alt9=1;
							}

						}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:280:41: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop9;
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

	// $ANTLR start "TOKEN_ERROR"
	public final void mTOKEN_ERROR() throws RecognitionException {
		try {
			int _type = TOKEN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:283:13: ( . )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:283:15: .
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
		// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:8: ( BACKSLASH | WS | INCLUDE | K_INT | K_FLOAT | K_CHAR | VOID | WHILE | FOR | IF | ELSE | RETURN | EQ | NEQ | GT | LT | GE | LE | ASS | ADD | SUB | MULT | DIV | LPAREN | RPAREN | LBRACK | RBRACK | LCURL | RCURL | SEMICOL | DOT | ARROW | S_QUOTE | D_QUOTE | COMMA | AMP | PERC | HASHTAG | OR | INT | FLOAT | CHAR_QUOTE | WORD | COMMENT | TOKEN_ERROR )
		int alt11=45;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:10: BACKSLASH
				{
				mBACKSLASH(); 

				}
				break;
			case 2 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:20: WS
				{
				mWS(); 

				}
				break;
			case 3 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:23: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 4 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:31: K_INT
				{
				mK_INT(); 

				}
				break;
			case 5 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:37: K_FLOAT
				{
				mK_FLOAT(); 

				}
				break;
			case 6 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:45: K_CHAR
				{
				mK_CHAR(); 

				}
				break;
			case 7 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:52: VOID
				{
				mVOID(); 

				}
				break;
			case 8 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:57: WHILE
				{
				mWHILE(); 

				}
				break;
			case 9 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:63: FOR
				{
				mFOR(); 

				}
				break;
			case 10 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:67: IF
				{
				mIF(); 

				}
				break;
			case 11 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:70: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:75: RETURN
				{
				mRETURN(); 

				}
				break;
			case 13 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:82: EQ
				{
				mEQ(); 

				}
				break;
			case 14 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:85: NEQ
				{
				mNEQ(); 

				}
				break;
			case 15 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:89: GT
				{
				mGT(); 

				}
				break;
			case 16 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:92: LT
				{
				mLT(); 

				}
				break;
			case 17 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:95: GE
				{
				mGE(); 

				}
				break;
			case 18 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:98: LE
				{
				mLE(); 

				}
				break;
			case 19 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:101: ASS
				{
				mASS(); 

				}
				break;
			case 20 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:105: ADD
				{
				mADD(); 

				}
				break;
			case 21 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:109: SUB
				{
				mSUB(); 

				}
				break;
			case 22 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:113: MULT
				{
				mMULT(); 

				}
				break;
			case 23 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:118: DIV
				{
				mDIV(); 

				}
				break;
			case 24 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:122: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 25 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:129: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 26 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:136: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 27 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:143: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 28 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:150: LCURL
				{
				mLCURL(); 

				}
				break;
			case 29 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:156: RCURL
				{
				mRCURL(); 

				}
				break;
			case 30 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:162: SEMICOL
				{
				mSEMICOL(); 

				}
				break;
			case 31 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:170: DOT
				{
				mDOT(); 

				}
				break;
			case 32 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:174: ARROW
				{
				mARROW(); 

				}
				break;
			case 33 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:180: S_QUOTE
				{
				mS_QUOTE(); 

				}
				break;
			case 34 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:188: D_QUOTE
				{
				mD_QUOTE(); 

				}
				break;
			case 35 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:196: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 36 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:202: AMP
				{
				mAMP(); 

				}
				break;
			case 37 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:206: PERC
				{
				mPERC(); 

				}
				break;
			case 38 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:211: HASHTAG
				{
				mHASHTAG(); 

				}
				break;
			case 39 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:219: OR
				{
				mOR(); 

				}
				break;
			case 40 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:222: INT
				{
				mINT(); 

				}
				break;
			case 41 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:226: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 42 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:232: CHAR_QUOTE
				{
				mCHAR_QUOTE(); 

				}
				break;
			case 43 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:243: WORD
				{
				mWORD(); 

				}
				break;
			case 44 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:248: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 45 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_semantic.g:1:256: TOKEN_ERROR
				{
				mTOKEN_ERROR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\3\uffff\1\50\7\53\1\64\1\44\1\67\1\71\1\uffff\1\74\1\uffff\1\77\10\uffff"+
		"\1\110\5\uffff\2\117\6\uffff\1\53\1\123\1\uffff\7\53\35\uffff\1\117\1"+
		"\uffff\1\133\1\uffff\1\53\1\135\5\53\1\uffff\1\53\1\uffff\1\144\1\145"+
		"\1\53\1\147\1\53\1\151\2\uffff\1\152\1\uffff\1\53\2\uffff\1\154\1\uffff";
	static final String DFA11_eofS =
		"\155\uffff";
	static final String DFA11_minS =
		"\1\0\2\uffff\1\151\1\146\1\154\1\150\1\157\1\150\1\154\1\145\4\75\1\uffff"+
		"\1\76\1\uffff\1\52\10\uffff\1\60\5\uffff\2\56\6\uffff\1\164\1\60\1\uffff"+
		"\1\157\1\162\1\141\2\151\1\163\1\164\35\uffff\1\56\1\uffff\1\60\1\uffff"+
		"\1\141\1\60\1\162\1\144\1\154\1\145\1\165\1\uffff\1\164\1\uffff\2\60\1"+
		"\145\1\60\1\162\1\60\2\uffff\1\60\1\uffff\1\156\2\uffff\1\60\1\uffff";
	static final String DFA11_maxS =
		"\1\uffff\2\uffff\1\151\1\156\1\157\1\150\1\157\1\150\1\154\1\145\4\75"+
		"\1\uffff\1\76\1\uffff\1\57\10\uffff\1\172\5\uffff\2\71\6\uffff\1\164\1"+
		"\172\1\uffff\1\157\1\162\1\141\2\151\1\163\1\164\35\uffff\1\71\1\uffff"+
		"\1\172\1\uffff\1\141\1\172\1\162\1\144\1\154\1\145\1\165\1\uffff\1\164"+
		"\1\uffff\2\172\1\145\1\172\1\162\1\172\2\uffff\1\172\1\uffff\1\156\2\uffff"+
		"\1\172\1\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\14\uffff\1\24\1\uffff\1\26\1\uffff\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\uffff\1\42\1\43\1\44\1\45\1\47\2\uffff\1\53\1\55"+
		"\1\1\1\2\1\3\1\46\2\uffff\1\53\7\uffff\1\15\1\23\1\16\1\21\1\17\1\22\1"+
		"\20\1\24\1\40\1\25\1\26\1\54\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1"+
		"\37\1\41\1\52\1\42\1\43\1\44\1\45\1\47\1\50\1\uffff\1\51\1\uffff\1\12"+
		"\7\uffff\1\4\1\uffff\1\11\6\uffff\1\6\1\7\1\uffff\1\13\1\uffff\1\5\1\10"+
		"\1\uffff\1\14";
	static final String DFA11_specialS =
		"\1\0\154\uffff}>";
	static final String[] DFA11_transitionS = {
			"\11\44\2\2\2\44\1\2\22\44\1\2\1\14\1\34\1\3\1\44\1\37\1\36\1\33\1\23"+
			"\1\24\1\21\1\17\1\35\1\20\1\32\1\22\1\42\11\41\1\44\1\31\1\16\1\13\1"+
			"\15\2\44\32\43\1\25\1\1\1\26\3\44\2\43\1\6\1\43\1\11\1\5\2\43\1\4\10"+
			"\43\1\12\3\43\1\7\1\10\3\43\1\27\1\40\1\30\uff82\44",
			"",
			"",
			"\1\47",
			"\1\52\7\uffff\1\51",
			"\1\54\2\uffff\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\65",
			"\1\66",
			"\1\70",
			"",
			"\1\73",
			"",
			"\1\76\4\uffff\1\76",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\111\7\uffff\32\111\1\uffff\1\111\4\uffff\32\111",
			"",
			"",
			"",
			"",
			"",
			"\1\121\1\uffff\12\120",
			"\1\121\1\uffff\12\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\121\1\uffff\12\120",
			"",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"",
			"\1\134",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"\1\143",
			"",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"\1\146",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"\1\150",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"",
			"",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"",
			"\1\153",
			"",
			"",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
			return "1:1: Tokens : ( BACKSLASH | WS | INCLUDE | K_INT | K_FLOAT | K_CHAR | VOID | WHILE | FOR | IF | ELSE | RETURN | EQ | NEQ | GT | LT | GE | LE | ASS | ADD | SUB | MULT | DIV | LPAREN | RPAREN | LBRACK | RBRACK | LCURL | RCURL | SEMICOL | DOT | ARROW | S_QUOTE | D_QUOTE | COMMA | AMP | PERC | HASHTAG | OR | INT | FLOAT | CHAR_QUOTE | WORD | COMMENT | TOKEN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_0 = input.LA(1);
						s = -1;
						if ( (LA11_0=='\\') ) {s = 1;}
						else if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 2;}
						else if ( (LA11_0=='#') ) {s = 3;}
						else if ( (LA11_0=='i') ) {s = 4;}
						else if ( (LA11_0=='f') ) {s = 5;}
						else if ( (LA11_0=='c') ) {s = 6;}
						else if ( (LA11_0=='v') ) {s = 7;}
						else if ( (LA11_0=='w') ) {s = 8;}
						else if ( (LA11_0=='e') ) {s = 9;}
						else if ( (LA11_0=='r') ) {s = 10;}
						else if ( (LA11_0=='=') ) {s = 11;}
						else if ( (LA11_0=='!') ) {s = 12;}
						else if ( (LA11_0=='>') ) {s = 13;}
						else if ( (LA11_0=='<') ) {s = 14;}
						else if ( (LA11_0=='+') ) {s = 15;}
						else if ( (LA11_0=='-') ) {s = 16;}
						else if ( (LA11_0=='*') ) {s = 17;}
						else if ( (LA11_0=='/') ) {s = 18;}
						else if ( (LA11_0=='(') ) {s = 19;}
						else if ( (LA11_0==')') ) {s = 20;}
						else if ( (LA11_0=='[') ) {s = 21;}
						else if ( (LA11_0==']') ) {s = 22;}
						else if ( (LA11_0=='{') ) {s = 23;}
						else if ( (LA11_0=='}') ) {s = 24;}
						else if ( (LA11_0==';') ) {s = 25;}
						else if ( (LA11_0=='.') ) {s = 26;}
						else if ( (LA11_0=='\'') ) {s = 27;}
						else if ( (LA11_0=='\"') ) {s = 28;}
						else if ( (LA11_0==',') ) {s = 29;}
						else if ( (LA11_0=='&') ) {s = 30;}
						else if ( (LA11_0=='%') ) {s = 31;}
						else if ( (LA11_0=='|') ) {s = 32;}
						else if ( ((LA11_0 >= '1' && LA11_0 <= '9')) ) {s = 33;}
						else if ( (LA11_0=='0') ) {s = 34;}
						else if ( ((LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'b')||LA11_0=='d'||(LA11_0 >= 'g' && LA11_0 <= 'h')||(LA11_0 >= 'j' && LA11_0 <= 'q')||(LA11_0 >= 's' && LA11_0 <= 'u')||(LA11_0 >= 'x' && LA11_0 <= 'z')) ) {s = 35;}
						else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\b')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\u001F')||LA11_0=='$'||LA11_0==':'||(LA11_0 >= '?' && LA11_0 <= '@')||(LA11_0 >= '^' && LA11_0 <= '`')||(LA11_0 >= '~' && LA11_0 <= '\uFFFF')) ) {s = 36;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
