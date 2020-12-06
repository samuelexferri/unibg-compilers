// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-06 16:47:17

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMP", "ARROW", "ASS", "COMMA", 
		"DIGIT", "DIGIT_NO_ZERO", "DIV", "D_QUOTE", "ELSE", "EQ", "FLOAT", "FOR", 
		"GE", "GT", "IF", "INCLUDE", "INT", "K_CHAR", "K_FLOAT", "K_INT", "LBRACK", 
		"LCURL", "LE", "LPAREN", "LT", "MIN", "MULT", "NEQ", "NEWL", "PLUS", "RBRACK", 
		"RCURL", "RETURN", "RPAREN", "SEMICOL", "SLASHR", "SPACE", "S_QUOTE", 
		"TAB", "UNDRSCR", "VOID", "WHILE", "WORD", "WS"
	};
	public static final int EOF=-1;
	public static final int AMP=4;
	public static final int ARROW=5;
	public static final int ASS=6;
	public static final int COMMA=7;
	public static final int DIGIT=8;
	public static final int DIGIT_NO_ZERO=9;
	public static final int DIV=10;
	public static final int D_QUOTE=11;
	public static final int ELSE=12;
	public static final int EQ=13;
	public static final int FLOAT=14;
	public static final int FOR=15;
	public static final int GE=16;
	public static final int GT=17;
	public static final int IF=18;
	public static final int INCLUDE=19;
	public static final int INT=20;
	public static final int K_CHAR=21;
	public static final int K_FLOAT=22;
	public static final int K_INT=23;
	public static final int LBRACK=24;
	public static final int LCURL=25;
	public static final int LE=26;
	public static final int LPAREN=27;
	public static final int LT=28;
	public static final int MIN=29;
	public static final int MULT=30;
	public static final int NEQ=31;
	public static final int NEWL=32;
	public static final int PLUS=33;
	public static final int RBRACK=34;
	public static final int RCURL=35;
	public static final int RETURN=36;
	public static final int RPAREN=37;
	public static final int SEMICOL=38;
	public static final int SLASHR=39;
	public static final int SPACE=40;
	public static final int S_QUOTE=41;
	public static final int TAB=42;
	public static final int UNDRSCR=43;
	public static final int VOID=44;
	public static final int WHILE=45;
	public static final int WORD=46;
	public static final int WS=47;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public C_MIPSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public C_MIPSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return C_MIPSParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g"; }


		// int test;



	// $ANTLR start "start"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:1: start : ( ( INCLUDE )? ( type_name identifier ( global_var | function ) ) | ( VOID identifier function )* EOF );
	public final void start() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( ( INCLUDE )? ( type_name identifier ( global_var | function ) ) | ( VOID identifier function )* EOF )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INCLUDE||(LA4_0 >= K_CHAR && LA4_0 <= K_INT)) ) {
				alt4=1;
			}
			else if ( (LA4_0==EOF||LA4_0==VOID) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:11: ( INCLUDE )? ( type_name identifier ( global_var | function ) )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:11: ( INCLUDE )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==INCLUDE) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:11: INCLUDE
							{
							match(input,INCLUDE,FOLLOW_INCLUDE_in_start67); 
							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:20: ( type_name identifier ( global_var | function ) )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:21: type_name identifier ( global_var | function )
					{
					pushFollow(FOLLOW_type_name_in_start71);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_start73);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:42: ( global_var | function )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==EQ||LA2_0==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_0==LPAREN) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:43: global_var
							{
							pushFollow(FOLLOW_global_var_in_start76);
							global_var();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:56: function
							{
							pushFollow(FOLLOW_function_in_start80);
							function();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:69: ( VOID identifier function )* EOF
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:69: ( VOID identifier function )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==VOID) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:70: VOID identifier function
							{
							match(input,VOID,FOLLOW_VOID_in_start87); 
							pushFollow(FOLLOW_identifier_in_start89);
							identifier();
							state._fsp--;

							pushFollow(FOLLOW_function_in_start91);
							function();
							state._fsp--;

							}
							break;

						default :
							break loop3;
						}
					}

					match(input,EOF,FOLLOW_EOF_in_start95); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "global_var"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:40:1: global_var : ( EQ type_value )? SEMICOL ;
	public final void global_var() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:40:13: ( ( EQ type_value )? SEMICOL )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:40:15: ( EQ type_value )? SEMICOL
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:40:15: ( EQ type_value )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==EQ) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:40:16: EQ type_value
					{
					match(input,EQ,FOLLOW_EQ_in_global_var113); 
					pushFollow(FOLLOW_type_value_in_global_var115);
					type_value();
					state._fsp--;

					}
					break;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_global_var119); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "global_var"



	// $ANTLR start "function"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:11: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:13: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function137); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:20: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= K_CHAR && LA7_0 <= K_INT)) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:21: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function140);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function142);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:42: ( COMMA type_name identifier )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:43: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function145); 
							pushFollow(FOLLOW_type_name_in_function147);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function149);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_function155); 
			pushFollow(FOLLOW_codeblock_in_function157);
			codeblock();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "codeblock"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:1: codeblock : ( LCURL ( statement )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:17: ( LCURL ( statement )* RCURL | SEMICOL )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LCURL) ) {
				alt9=1;
			}
			else if ( (LA9_0==SEMICOL) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:19: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock180); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:25: ( statement )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= K_CHAR && LA8_0 <= K_INT)||LA8_0==LCURL||LA8_0==RETURN||LA8_0==SEMICOL||LA8_0==WORD) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:25: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock182);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop8;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock185); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:7: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock194); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "statement"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:1: statement : ( LCURL ( statement )* RCURL | RETURN assignment SEMICOL | assignment SEMICOL | SEMICOL );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:12: ( LCURL ( statement )* RCURL | RETURN assignment SEMICOL | assignment SEMICOL | SEMICOL )
			int alt11=4;
			switch ( input.LA(1) ) {
			case LCURL:
				{
				alt11=1;
				}
				break;
			case RETURN:
				{
				alt11=2;
				}
				break;
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case WORD:
				{
				alt11=3;
				}
				break;
			case SEMICOL:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:14: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_statement212); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:20: ( statement )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= K_CHAR && LA10_0 <= K_INT)||LA10_0==LCURL||LA10_0==RETURN||LA10_0==SEMICOL||LA10_0==WORD) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:20: statement
							{
							pushFollow(FOLLOW_statement_in_statement214);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop10;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_statement217); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:7: RETURN assignment SEMICOL
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement226); 
					pushFollow(FOLLOW_assignment_in_statement228);
					assignment();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement230); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:7: assignment SEMICOL
					{
					pushFollow(FOLLOW_assignment_in_statement239);
					assignment();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement241); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:7: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement250); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "assignment"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:1: assignment : ( type_name )? identifier ( MIN | PLUS | MULT | DIV )? EQ type_value ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:13: ( ( type_name )? identifier ( MIN | PLUS | MULT | DIV )? EQ type_value )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: ( type_name )? identifier ( MIN | PLUS | MULT | DIV )? EQ type_value
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: ( type_name )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= K_CHAR && LA12_0 <= K_INT)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: type_name
					{
					pushFollow(FOLLOW_type_name_in_assignment270);
					type_name();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_assignment273);
			identifier();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:37: ( MIN | PLUS | MULT | DIV )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DIV||(LA13_0 >= MIN && LA13_0 <= MULT)||LA13_0==PLUS) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
					{
					if ( input.LA(1)==DIV||(input.LA(1) >= MIN && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,EQ,FOLLOW_EQ_in_assignment292); 
			pushFollow(FOLLOW_type_value_in_assignment294);
			type_value();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "type_name"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:59:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( (input.LA(1) >= K_CHAR && input.LA(1) <= K_INT) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_name"



	// $ANTLR start "identifier"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:1: identifier : WORD ;
	public final void identifier() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:13: ( WORD )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:15: WORD
			{
			match(input,WORD,FOLLOW_WORD_in_identifier336); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifier"



	// $ANTLR start "type_value"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:1: type_value : ( INT | FLOAT ) ;
	public final void type_value() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:65:13: ( ( INT | FLOAT ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_value"

	// Delegated rules



	public static final BitSet FOLLOW_INCLUDE_in_start67 = new BitSet(new long[]{0x0000000000E00000L});
	public static final BitSet FOLLOW_type_name_in_start71 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_identifier_in_start73 = new BitSet(new long[]{0x0000004008002000L});
	public static final BitSet FOLLOW_global_var_in_start76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_start80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_start87 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_identifier_in_start89 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_function_in_start91 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_EOF_in_start95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_global_var113 = new BitSet(new long[]{0x0000000000104000L});
	public static final BitSet FOLLOW_type_value_in_global_var115 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global_var119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function137 = new BitSet(new long[]{0x0000002000E00000L});
	public static final BitSet FOLLOW_type_name_in_function140 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_identifier_in_function142 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_COMMA_in_function145 = new BitSet(new long[]{0x0000000000E00000L});
	public static final BitSet FOLLOW_type_name_in_function147 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_identifier_in_function149 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_RPAREN_in_function155 = new BitSet(new long[]{0x0000004002000000L});
	public static final BitSet FOLLOW_codeblock_in_function157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock180 = new BitSet(new long[]{0x0000405802E00000L});
	public static final BitSet FOLLOW_statement_in_codeblock182 = new BitSet(new long[]{0x0000405802E00000L});
	public static final BitSet FOLLOW_RCURL_in_codeblock185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_statement212 = new BitSet(new long[]{0x0000405802E00000L});
	public static final BitSet FOLLOW_statement_in_statement214 = new BitSet(new long[]{0x0000405802E00000L});
	public static final BitSet FOLLOW_RCURL_in_statement217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement226 = new BitSet(new long[]{0x0000400000E00000L});
	public static final BitSet FOLLOW_assignment_in_statement228 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement239 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_statement250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_assignment270 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_identifier_in_assignment273 = new BitSet(new long[]{0x0000000260002400L});
	public static final BitSet FOLLOW_EQ_in_assignment292 = new BitSet(new long[]{0x0000000000104000L});
	public static final BitSet FOLLOW_type_value_in_assignment294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_identifier336 = new BitSet(new long[]{0x0000000000000002L});
}
