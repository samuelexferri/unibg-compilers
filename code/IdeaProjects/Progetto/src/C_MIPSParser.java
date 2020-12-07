// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-07 10:45:24

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AMP", "ARROW", "ASS", 
		"CHAR", "COMMA", "COMMENT", "DIGIT", "DIGIT_NO_ZERO", "DIV", "DOT", "D_QUOTE", 
		"ELSE", "EQ", "FLOAT", "FOR", "GE", "GT", "IF", "INCLUDE", "INT", "K_CHAR", 
		"K_FLOAT", "K_INT", "LBRACK", "LCURL", "LE", "LPAREN", "LT", "MULT", "NEQ", 
		"NEWL", "RBRACK", "RCURL", "RETURN", "RPAREN", "SEMICOL", "SLASHR", "SPACE", 
		"SUB", "S_QUOTE", "TAB", "TOKEN_ERROR", "UNDRSCR", "VOID", "WHILE", "WORD", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AMP=5;
	public static final int ARROW=6;
	public static final int ASS=7;
	public static final int CHAR=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int DIGIT=11;
	public static final int DIGIT_NO_ZERO=12;
	public static final int DIV=13;
	public static final int DOT=14;
	public static final int D_QUOTE=15;
	public static final int ELSE=16;
	public static final int EQ=17;
	public static final int FLOAT=18;
	public static final int FOR=19;
	public static final int GE=20;
	public static final int GT=21;
	public static final int IF=22;
	public static final int INCLUDE=23;
	public static final int INT=24;
	public static final int K_CHAR=25;
	public static final int K_FLOAT=26;
	public static final int K_INT=27;
	public static final int LBRACK=28;
	public static final int LCURL=29;
	public static final int LE=30;
	public static final int LPAREN=31;
	public static final int LT=32;
	public static final int MULT=33;
	public static final int NEQ=34;
	public static final int NEWL=35;
	public static final int RBRACK=36;
	public static final int RCURL=37;
	public static final int RETURN=38;
	public static final int RPAREN=39;
	public static final int SEMICOL=40;
	public static final int SLASHR=41;
	public static final int SPACE=42;
	public static final int SUB=43;
	public static final int S_QUOTE=44;
	public static final int TAB=45;
	public static final int TOKEN_ERROR=46;
	public static final int UNDRSCR=47;
	public static final int VOID=48;
	public static final int WHILE=49;
	public static final int WORD=50;
	public static final int WS=51;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g"; }


		// int test;



	// $ANTLR start "start"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:1: start : ( INCLUDE )? ( VOID function SEMICOL | type_name identifier ( ( ( global_var | vector_globals )? SEMICOL ) | function ) )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:7: ( ( INCLUDE )? ( VOID function SEMICOL | type_name identifier ( ( ( global_var | vector_globals )? SEMICOL ) | function ) )* EOF )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( INCLUDE )? ( VOID function SEMICOL | type_name identifier ( ( ( global_var | vector_globals )? SEMICOL ) | function ) )* EOF
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( INCLUDE )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INCLUDE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_start66); 
					}
					break;

			}

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:18: ( VOID function SEMICOL | type_name identifier ( ( ( global_var | vector_globals )? SEMICOL ) | function ) )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==VOID) ) {
					alt4=1;
				}
				else if ( ((LA4_0 >= K_CHAR && LA4_0 <= K_INT)) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:19: VOID function SEMICOL
					{
					match(input,VOID,FOLLOW_VOID_in_start70); 
					pushFollow(FOLLOW_function_in_start72);
					function();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_start74); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:43: type_name identifier ( ( ( global_var | vector_globals )? SEMICOL ) | function )
					{
					pushFollow(FOLLOW_type_name_in_start78);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_start80);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:64: ( ( ( global_var | vector_globals )? SEMICOL ) | function )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ASS||LA3_0==LBRACK||LA3_0==SEMICOL) ) {
						alt3=1;
					}
					else if ( (LA3_0==LPAREN) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:65: ( ( global_var | vector_globals )? SEMICOL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:65: ( ( global_var | vector_globals )? SEMICOL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:66: ( global_var | vector_globals )? SEMICOL
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:66: ( global_var | vector_globals )?
							int alt2=3;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==ASS) ) {
								alt2=1;
							}
							else if ( (LA2_0==LBRACK) ) {
								alt2=2;
							}
							switch (alt2) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:67: global_var
									{
									pushFollow(FOLLOW_global_var_in_start85);
									global_var();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:80: vector_globals
									{
									pushFollow(FOLLOW_vector_globals_in_start89);
									vector_globals();
									state._fsp--;

									}
									break;

							}

							match(input,SEMICOL,FOLLOW_SEMICOL_in_start93); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:108: function
							{
							pushFollow(FOLLOW_function_in_start98);
							function();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start104); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:1: global_var : ( ASS type_value ) ;
	public final void global_var() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:12: ( ( ASS type_value ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:14: ( ASS type_value )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:14: ( ASS type_value )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:15: ASS type_value
			{
			match(input,ASS,FOLLOW_ASS_in_global_var118); 
			pushFollow(FOLLOW_type_value_in_global_var120);
			type_value();
			state._fsp--;

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
	// $ANTLR end "global_var"



	// $ANTLR start "vector_globals"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:1: vector_globals : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? ;
	public final void vector_globals() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:17: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:19: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector_globals141); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:26: ( INT )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==INT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:26: INT
					{
					match(input,INT,FOLLOW_INT_in_vector_globals143); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector_globals146); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:38: ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ASS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:40: ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					{
					match(input,ASS,FOLLOW_ASS_in_vector_globals150); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:44: ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==LCURL) ) {
						alt7=1;
					}
					else if ( (LA7_0==CHAR||LA7_0==FLOAT||LA7_0==INT) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:45: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:45: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:46: LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector_globals154); 
							if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:68: ( COMMA ( INT | FLOAT | CHAR ) )*
							loop6:
							while (true) {
								int alt6=2;
								int LA6_0 = input.LA(1);
								if ( (LA6_0==COMMA) ) {
									alt6=1;
								}

								switch (alt6) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:69: COMMA ( INT | FLOAT | CHAR )
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector_globals164); 
									if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop6;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector_globals176); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:39:103: ( INT | FLOAT | CHAR )
							{
							if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
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

					}
					break;

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
	// $ANTLR end "vector_globals"



	// $ANTLR start "function"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:10: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:12: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function208); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:19: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= K_CHAR && LA10_0 <= K_INT)) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:20: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function211);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function213);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:41: ( COMMA type_name identifier )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:43:42: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function216); 
							pushFollow(FOLLOW_type_name_in_function218);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function220);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_function226); 
			pushFollow(FOLLOW_codeblock_in_function228);
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



	// $ANTLR start "call_function"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:1: call_function : LPAREN ( identifier ( COMMA identifier )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:16: ( LPAREN ( identifier ( COMMA identifier )* )? RPAREN )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:19: LPAREN ( identifier ( COMMA identifier )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function243); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:26: ( identifier ( COMMA identifier )* )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CHAR||LA12_0==WORD) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:28: identifier ( COMMA identifier )*
					{
					pushFollow(FOLLOW_identifier_in_call_function247);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:39: ( COMMA identifier )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==COMMA) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:46:40: COMMA identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function250); 
							pushFollow(FOLLOW_identifier_in_call_function253);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function259); 
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
	// $ANTLR end "call_function"



	// $ANTLR start "vector"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:9: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:11: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector273); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:18: ( INT )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==INT) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:18: INT
					{
					match(input,INT,FOLLOW_INT_in_vector275); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector278); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:30: ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ASS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:32: ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					{
					match(input,ASS,FOLLOW_ASS_in_vector282); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:36: ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==LCURL) ) {
						alt15=1;
					}
					else if ( (LA15_0==CHAR||LA15_0==FLOAT||LA15_0==INT) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:37: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:37: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:38: LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector286); 
							if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:60: ( COMMA ( INT | FLOAT | CHAR ) )*
							loop14:
							while (true) {
								int alt14=2;
								int LA14_0 = input.LA(1);
								if ( (LA14_0==COMMA) ) {
									alt14=1;
								}

								switch (alt14) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:61: COMMA ( INT | FLOAT | CHAR )
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector296); 
									if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

								default :
									break loop14;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector308); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:49:95: ( INT | FLOAT | CHAR )
							{
							if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
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

					}
					break;

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
	// $ANTLR end "vector"



	// $ANTLR start "codeblock"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:1: codeblock : ( LCURL ( statement SEMICOL )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:11: ( LCURL ( statement SEMICOL )* RCURL | SEMICOL )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==LCURL) ) {
				alt18=1;
			}
			else if ( (LA18_0==SEMICOL) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:13: LCURL ( statement SEMICOL )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock340); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:19: ( statement SEMICOL )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==CHAR||(LA17_0 >= K_CHAR && LA17_0 <= K_INT)||LA17_0==RETURN||LA17_0==WORD) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:20: statement SEMICOL
							{
							pushFollow(FOLLOW_statement_in_codeblock343);
							statement();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock345); 
							}
							break;

						default :
							break loop17;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock350); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:8: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock362); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:1: statement : ( ( type_name )? identifier ( assignment | call_function | vector ) | RETURN valore );
	public final void statement() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:13: ( ( type_name )? identifier ( assignment | call_function | vector ) | RETURN valore )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CHAR||(LA21_0 >= K_CHAR && LA21_0 <= K_INT)||LA21_0==WORD) ) {
				alt21=1;
			}
			else if ( (LA21_0==RETURN) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: ( type_name )? identifier ( assignment | call_function | vector )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: ( type_name )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( ((LA19_0 >= K_CHAR && LA19_0 <= K_INT)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement382);
							type_name();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_statement385);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:37: ( assignment | call_function | vector )
					int alt20=3;
					switch ( input.LA(1) ) {
					case ADD:
					case ASS:
					case DIV:
					case MULT:
					case SEMICOL:
					case SUB:
						{
						alt20=1;
						}
						break;
					case LPAREN:
						{
						alt20=2;
						}
						break;
					case LBRACK:
						{
						alt20=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:38: assignment
							{
							pushFollow(FOLLOW_assignment_in_statement388);
							assignment();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:50: call_function
							{
							pushFollow(FOLLOW_call_function_in_statement391);
							call_function();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:65: vector
							{
							pushFollow(FOLLOW_vector_in_statement394);
							vector();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:7: RETURN valore
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement404); 
					pushFollow(FOLLOW_valore_in_statement406);
					valore();
					state._fsp--;

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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:1: assignment : ( SUB | ADD | MULT | DIV )? ( ASS type_value )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:13: ( ( SUB | ADD | MULT | DIV )? ( ASS type_value )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:15: ( SUB | ADD | MULT | DIV )? ( ASS type_value )?
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:15: ( SUB | ADD | MULT | DIV )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ADD||LA22_0==DIV||LA22_0==MULT||LA22_0==SUB) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
					{
					if ( input.LA(1)==ADD||input.LA(1)==DIV||input.LA(1)==MULT||input.LA(1)==SUB ) {
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

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:41: ( ASS type_value )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ASS) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:42: ASS type_value
					{
					match(input,ASS,FOLLOW_ASS_in_assignment445); 
					pushFollow(FOLLOW_type_value_in_assignment447);
					type_value();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "assignment"



	// $ANTLR start "type_name"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:1: identifier : ( WORD | CHAR );
	public final void identifier() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:13: ( WORD | CHAR )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( input.LA(1)==CHAR||input.LA(1)==WORD ) {
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
	// $ANTLR end "identifier"



	// $ANTLR start "type_value"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:1: type_value : ( INT | FLOAT | expression ) ;
	public final void type_value() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:13: ( ( INT | FLOAT | expression ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:15: ( INT | FLOAT | expression )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:15: ( INT | FLOAT | expression )
			int alt24=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt24=1;
				}
				break;
			case FLOAT:
				{
				alt24=2;
				}
				break;
			case CHAR:
			case LPAREN:
			case WORD:
				{
				alt24=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:16: INT
					{
					match(input,INT,FOLLOW_INT_in_type_value510); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:22: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type_value514); 
					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:30: expression
					{
					pushFollow(FOLLOW_expression_in_type_value518);
					expression();
					state._fsp--;

					}
					break;

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



	// $ANTLR start "expression"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:1: expression : multiplyExp ( ADD multiplyExp | SUB multiplyExp )* ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:75:5: ( multiplyExp ( ADD multiplyExp | SUB multiplyExp )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:75:7: multiplyExp ( ADD multiplyExp | SUB multiplyExp )*
			{
			pushFollow(FOLLOW_multiplyExp_in_expression539);
			multiplyExp();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:75:19: ( ADD multiplyExp | SUB multiplyExp )*
			loop25:
			while (true) {
				int alt25=3;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==ADD) ) {
					alt25=1;
				}
				else if ( (LA25_0==SUB) ) {
					alt25=2;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:75:21: ADD multiplyExp
					{
					match(input,ADD,FOLLOW_ADD_in_expression543); 
					pushFollow(FOLLOW_multiplyExp_in_expression545);
					multiplyExp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:75:40: SUB multiplyExp
					{
					match(input,SUB,FOLLOW_SUB_in_expression550); 
					pushFollow(FOLLOW_multiplyExp_in_expression552);
					multiplyExp();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
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
	// $ANTLR end "expression"



	// $ANTLR start "multiplyExp"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:1: multiplyExp : atomExp ( MULT atomExp | DIV atomExp )* ;
	public final void multiplyExp() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:5: ( atomExp ( MULT atomExp | DIV atomExp )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:7: atomExp ( MULT atomExp | DIV atomExp )*
			{
			pushFollow(FOLLOW_atomExp_in_multiplyExp579);
			atomExp();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:15: ( MULT atomExp | DIV atomExp )*
			loop26:
			while (true) {
				int alt26=3;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==MULT) ) {
					alt26=1;
				}
				else if ( (LA26_0==DIV) ) {
					alt26=2;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:17: MULT atomExp
					{
					match(input,MULT,FOLLOW_MULT_in_multiplyExp583); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp585);
					atomExp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:79:33: DIV atomExp
					{
					match(input,DIV,FOLLOW_DIV_in_multiplyExp590); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp592);
					atomExp();
					state._fsp--;

					}
					break;

				default :
					break loop26;
				}
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
	// $ANTLR end "multiplyExp"



	// $ANTLR start "atomExp"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:1: atomExp : ( INT | FLOAT | identifier | LPAREN expression RPAREN );
	public final void atomExp() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:9: ( INT | FLOAT | identifier | LPAREN expression RPAREN )
			int alt27=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt27=1;
				}
				break;
			case FLOAT:
				{
				alt27=2;
				}
				break;
			case CHAR:
			case WORD:
				{
				alt27=3;
				}
				break;
			case LPAREN:
				{
				alt27=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:2: INT
					{
					match(input,INT,FOLLOW_INT_in_atomExp611); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atomExp623); 
					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:7: identifier
					{
					pushFollow(FOLLOW_identifier_in_atomExp633);
					identifier();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:7: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atomExp646); 
					pushFollow(FOLLOW_expression_in_atomExp648);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atomExp650); 
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
	// $ANTLR end "atomExp"



	// $ANTLR start "valore"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:1: valore : ( INT | identifier ) ;
	public final void valore() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:9: ( ( INT | identifier ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:12: ( INT | identifier )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:12: ( INT | identifier )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==INT) ) {
				alt28=1;
			}
			else if ( (LA28_0==CHAR||LA28_0==WORD) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:13: INT
					{
					match(input,INT,FOLLOW_INT_in_valore667); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:19: identifier
					{
					pushFollow(FOLLOW_identifier_in_valore671);
					identifier();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "valore"

	// Delegated rules



	public static final BitSet FOLLOW_INCLUDE_in_start66 = new BitSet(new long[]{0x000100000E000000L});
	public static final BitSet FOLLOW_VOID_in_start70 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_function_in_start72 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start74 = new BitSet(new long[]{0x000100000E000000L});
	public static final BitSet FOLLOW_type_name_in_start78 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_start80 = new BitSet(new long[]{0x0000010090000080L});
	public static final BitSet FOLLOW_global_var_in_start85 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_vector_globals_in_start89 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start93 = new BitSet(new long[]{0x000100000E000000L});
	public static final BitSet FOLLOW_function_in_start98 = new BitSet(new long[]{0x000100000E000000L});
	public static final BitSet FOLLOW_EOF_in_start104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_global_var118 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_type_value_in_global_var120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector_globals141 = new BitSet(new long[]{0x0000001001000000L});
	public static final BitSet FOLLOW_INT_in_vector_globals143 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector_globals146 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector_globals150 = new BitSet(new long[]{0x0000000021040100L});
	public static final BitSet FOLLOW_LCURL_in_vector_globals154 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector_globals156 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_COMMA_in_vector_globals164 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector_globals166 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_RCURL_in_vector_globals176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_vector_globals181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function208 = new BitSet(new long[]{0x000000800E000000L});
	public static final BitSet FOLLOW_type_name_in_function211 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_function213 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_COMMA_in_function216 = new BitSet(new long[]{0x000000000E000000L});
	public static final BitSet FOLLOW_type_name_in_function218 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_function220 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_RPAREN_in_function226 = new BitSet(new long[]{0x0000010020000000L});
	public static final BitSet FOLLOW_codeblock_in_function228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function243 = new BitSet(new long[]{0x0004008000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function247 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_COMMA_in_call_function250 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function253 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_RPAREN_in_call_function259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector273 = new BitSet(new long[]{0x0000001001000000L});
	public static final BitSet FOLLOW_INT_in_vector275 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector278 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector282 = new BitSet(new long[]{0x0000000021040100L});
	public static final BitSet FOLLOW_LCURL_in_vector286 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector288 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_COMMA_in_vector296 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector298 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_RCURL_in_vector308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_vector313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock340 = new BitSet(new long[]{0x000400600E000100L});
	public static final BitSet FOLLOW_statement_in_codeblock343 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock345 = new BitSet(new long[]{0x000400600E000100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement382 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_statement385 = new BitSet(new long[]{0x0000080290002090L});
	public static final BitSet FOLLOW_assignment_in_statement388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_function_in_statement391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_statement394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement404 = new BitSet(new long[]{0x0004000001000100L});
	public static final BitSet FOLLOW_valore_in_statement406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment445 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_type_value_in_assignment447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type_value510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type_value514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_type_value518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplyExp_in_expression539 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_ADD_in_expression543 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_multiplyExp_in_expression545 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_SUB_in_expression550 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_multiplyExp_in_expression552 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp579 = new BitSet(new long[]{0x0000000200002002L});
	public static final BitSet FOLLOW_MULT_in_multiplyExp583 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp585 = new BitSet(new long[]{0x0000000200002002L});
	public static final BitSet FOLLOW_DIV_in_multiplyExp590 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp592 = new BitSet(new long[]{0x0000000200002002L});
	public static final BitSet FOLLOW_INT_in_atomExp611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atomExp623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atomExp633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atomExp646 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_expression_in_atomExp648 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atomExp650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valore667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_valore671 = new BitSet(new long[]{0x0000000000000002L});
}
