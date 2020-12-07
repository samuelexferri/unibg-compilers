// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-07 11:13:45

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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:1: start : ( INCLUDE )? ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL ) | function ) )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:7: ( ( INCLUDE )? ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL ) | function ) )* EOF )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:9: ( INCLUDE )? ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL ) | function ) )* EOF
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

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:18: ( VOID identifier function | type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL ) | function ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==VOID) ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= K_CHAR && LA7_0 <= K_INT)) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:19: VOID identifier function
					{
					match(input,VOID,FOLLOW_VOID_in_start70); 
					pushFollow(FOLLOW_identifier_in_start72);
					identifier();
					state._fsp--;

					pushFollow(FOLLOW_function_in_start74);
					function();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:46: type_name identifier ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL ) | function )
					{
					pushFollow(FOLLOW_type_name_in_start78);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_start80);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:67: ( ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL ) | function )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ASS||LA6_0==COMMA||LA6_0==LBRACK||LA6_0==SEMICOL) ) {
						alt6=1;
					}
					else if ( (LA6_0==LPAREN) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:68: ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:68: ( ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:69: ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals ) SEMICOL
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:69: ( ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* ) | vector_globals )
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ASS||LA5_0==COMMA||LA5_0==SEMICOL) ) {
								alt5=1;
							}
							else if ( (LA5_0==LBRACK) ) {
								alt5=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 5, 0, input);
								throw nvae;
							}

							switch (alt5) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:71: ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* )
									{
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:71: ( ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )* )
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:72: ( global_var_ass )? ( COMMA identifier ( global_var_ass )? )*
									{
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:72: ( global_var_ass )?
									int alt2=2;
									int LA2_0 = input.LA(1);
									if ( (LA2_0==ASS) ) {
										alt2=1;
									}
									switch (alt2) {
										case 1 :
											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:72: global_var_ass
											{
											pushFollow(FOLLOW_global_var_ass_in_start87);
											global_var_ass();
											state._fsp--;

											}
											break;

									}

									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:88: ( COMMA identifier ( global_var_ass )? )*
									loop4:
									while (true) {
										int alt4=2;
										int LA4_0 = input.LA(1);
										if ( (LA4_0==COMMA) ) {
											alt4=1;
										}

										switch (alt4) {
										case 1 :
											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:89: COMMA identifier ( global_var_ass )?
											{
											match(input,COMMA,FOLLOW_COMMA_in_start91); 
											pushFollow(FOLLOW_identifier_in_start93);
											identifier();
											state._fsp--;

											// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:106: ( global_var_ass )?
											int alt3=2;
											int LA3_0 = input.LA(1);
											if ( (LA3_0==ASS) ) {
												alt3=1;
											}
											switch (alt3) {
												case 1 :
													// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:106: global_var_ass
													{
													pushFollow(FOLLOW_global_var_ass_in_start95);
													global_var_ass();
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

									}

									}
									break;
								case 2 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:128: vector_globals
									{
									pushFollow(FOLLOW_vector_globals_in_start104);
									vector_globals();
									state._fsp--;

									}
									break;

							}

							match(input,SEMICOL,FOLLOW_SEMICOL_in_start107); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:33:155: function
							{
							pushFollow(FOLLOW_function_in_start112);
							function();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start118); 
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



	// $ANTLR start "global_var_ass"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:1: global_var_ass : ASS type_value ;
	public final void global_var_ass() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:16: ( ASS type_value )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:19: ASS type_value
			{
			match(input,ASS,FOLLOW_ASS_in_global_var_ass131); 
			pushFollow(FOLLOW_type_value_in_global_var_ass133);
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
	// $ANTLR end "global_var_ass"



	// $ANTLR start "vector_globals"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:1: vector_globals : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? ;
	public final void vector_globals() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:17: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:19: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector_globals153); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:26: ( INT )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==INT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:26: INT
					{
					match(input,INT,FOLLOW_INT_in_vector_globals155); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector_globals158); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:38: ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:40: ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					{
					match(input,ASS,FOLLOW_ASS_in_vector_globals162); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:44: ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==LCURL) ) {
						alt10=1;
					}
					else if ( (LA10_0==CHAR||LA10_0==FLOAT||LA10_0==INT) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:45: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:45: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:46: LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector_globals166); 
							if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:68: ( COMMA ( INT | FLOAT | CHAR ) )*
							loop9:
							while (true) {
								int alt9=2;
								int LA9_0 = input.LA(1);
								if ( (LA9_0==COMMA) ) {
									alt9=1;
								}

								switch (alt9) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:69: COMMA ( INT | FLOAT | CHAR )
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector_globals176); 
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
									break loop9;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector_globals188); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:103: ( INT | FLOAT | CHAR )
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:10: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:12: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function220); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:19: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= K_CHAR && LA13_0 <= K_INT)) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:20: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function223);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function225);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:41: ( COMMA type_name identifier )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:42:42: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function228); 
							pushFollow(FOLLOW_type_name_in_function230);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function232);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_function238); 
			pushFollow(FOLLOW_codeblock_in_function240);
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:1: call_function : LPAREN ( identifier ( COMMA identifier )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:16: ( LPAREN ( identifier ( COMMA identifier )* )? RPAREN )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:19: LPAREN ( identifier ( COMMA identifier )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function255); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:26: ( identifier ( COMMA identifier )* )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHAR||LA15_0==WORD) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:28: identifier ( COMMA identifier )*
					{
					pushFollow(FOLLOW_identifier_in_call_function259);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:39: ( COMMA identifier )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==COMMA) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:45:40: COMMA identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function262); 
							pushFollow(FOLLOW_identifier_in_call_function265);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function271); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:9: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:11: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector285); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:18: ( INT )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==INT) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:18: INT
					{
					match(input,INT,FOLLOW_INT_in_vector287); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector290); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:30: ( ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) ) )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ASS) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:32: ASS ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					{
					match(input,ASS,FOLLOW_ASS_in_vector294); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:36: ( ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL ) | ( INT | FLOAT | CHAR ) )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LCURL) ) {
						alt18=1;
					}
					else if ( (LA18_0==CHAR||LA18_0==FLOAT||LA18_0==INT) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:37: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							{
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:37: ( LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL )
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:38: LCURL ( INT | FLOAT | CHAR ) ( COMMA ( INT | FLOAT | CHAR ) )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector298); 
							if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:60: ( COMMA ( INT | FLOAT | CHAR ) )*
							loop17:
							while (true) {
								int alt17=2;
								int LA17_0 = input.LA(1);
								if ( (LA17_0==COMMA) ) {
									alt17=1;
								}

								switch (alt17) {
								case 1 :
									// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:61: COMMA ( INT | FLOAT | CHAR )
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector308); 
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
									break loop17;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector320); 
							}

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:48:95: ( INT | FLOAT | CHAR )
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:1: codeblock : ( LCURL ( statement SEMICOL )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:11: ( LCURL ( statement SEMICOL )* RCURL | SEMICOL )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LCURL) ) {
				alt21=1;
			}
			else if ( (LA21_0==SEMICOL) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:13: LCURL ( statement SEMICOL )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock352); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:19: ( statement SEMICOL )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==CHAR||(LA20_0 >= K_CHAR && LA20_0 <= K_INT)||LA20_0==RETURN||LA20_0==WORD) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:51:20: statement SEMICOL
							{
							pushFollow(FOLLOW_statement_in_codeblock355);
							statement();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock357); 
							}
							break;

						default :
							break loop20;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock362); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:52:8: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock374); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:1: statement : ( ( type_name )? identifier ( assignment | call_function | vector ) | RETURN valore );
	public final void statement() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:13: ( ( type_name )? identifier ( assignment | call_function | vector ) | RETURN valore )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==CHAR||(LA24_0 >= K_CHAR && LA24_0 <= K_INT)||LA24_0==WORD) ) {
				alt24=1;
			}
			else if ( (LA24_0==RETURN) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: ( type_name )? identifier ( assignment | call_function | vector )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: ( type_name )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( ((LA22_0 >= K_CHAR && LA22_0 <= K_INT)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement394);
							type_name();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_statement397);
					identifier();
					state._fsp--;

					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:37: ( assignment | call_function | vector )
					int alt23=3;
					switch ( input.LA(1) ) {
					case ADD:
					case ASS:
					case DIV:
					case MULT:
					case SEMICOL:
					case SUB:
						{
						alt23=1;
						}
						break;
					case LPAREN:
						{
						alt23=2;
						}
						break;
					case LBRACK:
						{
						alt23=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:38: assignment
							{
							pushFollow(FOLLOW_assignment_in_statement400);
							assignment();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:50: call_function
							{
							pushFollow(FOLLOW_call_function_in_statement403);
							call_function();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:55:65: vector
							{
							pushFollow(FOLLOW_vector_in_statement406);
							vector();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:7: RETURN valore
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement416); 
					pushFollow(FOLLOW_valore_in_statement418);
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:1: assignment : ( SUB | ADD | MULT | DIV )? ( ASS type_value )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:13: ( ( SUB | ADD | MULT | DIV )? ( ASS type_value )? )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:15: ( SUB | ADD | MULT | DIV )? ( ASS type_value )?
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:15: ( SUB | ADD | MULT | DIV )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ADD||LA25_0==DIV||LA25_0==MULT||LA25_0==SUB) ) {
				alt25=1;
			}
			switch (alt25) {
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

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:41: ( ASS type_value )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ASS) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:42: ASS type_value
					{
					match(input,ASS,FOLLOW_ASS_in_assignment457); 
					pushFollow(FOLLOW_type_value_in_assignment459);
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:63:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:63:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:66:1: identifier : ( WORD | CHAR );
	public final void identifier() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:66:13: ( WORD | CHAR )
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:1: type_value : ( INT | FLOAT | expression ) ;
	public final void type_value() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:13: ( ( INT | FLOAT | expression ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:15: ( INT | FLOAT | expression )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:15: ( INT | FLOAT | expression )
			int alt27=3;
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
			case LPAREN:
			case WORD:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:16: INT
					{
					match(input,INT,FOLLOW_INT_in_type_value522); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:22: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type_value526); 
					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:30: expression
					{
					pushFollow(FOLLOW_expression_in_type_value530);
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:1: expression : multiplyExp ( ADD multiplyExp | SUB multiplyExp )* ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:5: ( multiplyExp ( ADD multiplyExp | SUB multiplyExp )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:7: multiplyExp ( ADD multiplyExp | SUB multiplyExp )*
			{
			pushFollow(FOLLOW_multiplyExp_in_expression551);
			multiplyExp();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:19: ( ADD multiplyExp | SUB multiplyExp )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==ADD) ) {
					alt28=1;
				}
				else if ( (LA28_0==SUB) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:21: ADD multiplyExp
					{
					match(input,ADD,FOLLOW_ADD_in_expression555); 
					pushFollow(FOLLOW_multiplyExp_in_expression557);
					multiplyExp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:40: SUB multiplyExp
					{
					match(input,SUB,FOLLOW_SUB_in_expression562); 
					pushFollow(FOLLOW_multiplyExp_in_expression564);
					multiplyExp();
					state._fsp--;

					}
					break;

				default :
					break loop28;
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:1: multiplyExp : atomExp ( MULT atomExp | DIV atomExp )* ;
	public final void multiplyExp() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:5: ( atomExp ( MULT atomExp | DIV atomExp )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:7: atomExp ( MULT atomExp | DIV atomExp )*
			{
			pushFollow(FOLLOW_atomExp_in_multiplyExp591);
			atomExp();
			state._fsp--;

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:15: ( MULT atomExp | DIV atomExp )*
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==MULT) ) {
					alt29=1;
				}
				else if ( (LA29_0==DIV) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:17: MULT atomExp
					{
					match(input,MULT,FOLLOW_MULT_in_multiplyExp595); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp597);
					atomExp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:78:33: DIV atomExp
					{
					match(input,DIV,FOLLOW_DIV_in_multiplyExp602); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp604);
					atomExp();
					state._fsp--;

					}
					break;

				default :
					break loop29;
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:81:1: atomExp : ( INT | FLOAT | identifier | LPAREN expression RPAREN );
	public final void atomExp() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:81:9: ( INT | FLOAT | identifier | LPAREN expression RPAREN )
			int alt30=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt30=1;
				}
				break;
			case FLOAT:
				{
				alt30=2;
				}
				break;
			case CHAR:
			case WORD:
				{
				alt30=3;
				}
				break;
			case LPAREN:
				{
				alt30=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:2: INT
					{
					match(input,INT,FOLLOW_INT_in_atomExp623); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atomExp635); 
					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:7: identifier
					{
					pushFollow(FOLLOW_identifier_in_atomExp645);
					identifier();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:85:7: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atomExp658); 
					pushFollow(FOLLOW_expression_in_atomExp660);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atomExp662); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:1: valore : ( INT | identifier ) ;
	public final void valore() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:9: ( ( INT | identifier ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:12: ( INT | identifier )
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:12: ( INT | identifier )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==INT) ) {
				alt31=1;
			}
			else if ( (LA31_0==CHAR||LA31_0==WORD) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:13: INT
					{
					match(input,INT,FOLLOW_INT_in_valore679); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:19: identifier
					{
					pushFollow(FOLLOW_identifier_in_valore683);
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
	public static final BitSet FOLLOW_VOID_in_start70 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_start72 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_function_in_start74 = new BitSet(new long[]{0x000100000E000000L});
	public static final BitSet FOLLOW_type_name_in_start78 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_start80 = new BitSet(new long[]{0x0000010090000280L});
	public static final BitSet FOLLOW_global_var_ass_in_start87 = new BitSet(new long[]{0x0000010000000200L});
	public static final BitSet FOLLOW_COMMA_in_start91 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_start93 = new BitSet(new long[]{0x0000010000000280L});
	public static final BitSet FOLLOW_global_var_ass_in_start95 = new BitSet(new long[]{0x0000010000000200L});
	public static final BitSet FOLLOW_vector_globals_in_start104 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_start107 = new BitSet(new long[]{0x000100000E000000L});
	public static final BitSet FOLLOW_function_in_start112 = new BitSet(new long[]{0x000100000E000000L});
	public static final BitSet FOLLOW_EOF_in_start118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_global_var_ass131 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_type_value_in_global_var_ass133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector_globals153 = new BitSet(new long[]{0x0000001001000000L});
	public static final BitSet FOLLOW_INT_in_vector_globals155 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector_globals158 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector_globals162 = new BitSet(new long[]{0x0000000021040100L});
	public static final BitSet FOLLOW_LCURL_in_vector_globals166 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector_globals168 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_COMMA_in_vector_globals176 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector_globals178 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_RCURL_in_vector_globals188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_vector_globals193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function220 = new BitSet(new long[]{0x000000800E000000L});
	public static final BitSet FOLLOW_type_name_in_function223 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_function225 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_COMMA_in_function228 = new BitSet(new long[]{0x000000000E000000L});
	public static final BitSet FOLLOW_type_name_in_function230 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_function232 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_RPAREN_in_function238 = new BitSet(new long[]{0x0000010020000000L});
	public static final BitSet FOLLOW_codeblock_in_function240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function255 = new BitSet(new long[]{0x0004008000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function259 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_COMMA_in_call_function262 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function265 = new BitSet(new long[]{0x0000008000000200L});
	public static final BitSet FOLLOW_RPAREN_in_call_function271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector285 = new BitSet(new long[]{0x0000001001000000L});
	public static final BitSet FOLLOW_INT_in_vector287 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector290 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector294 = new BitSet(new long[]{0x0000000021040100L});
	public static final BitSet FOLLOW_LCURL_in_vector298 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector300 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_COMMA_in_vector308 = new BitSet(new long[]{0x0000000001040100L});
	public static final BitSet FOLLOW_set_in_vector310 = new BitSet(new long[]{0x0000002000000200L});
	public static final BitSet FOLLOW_RCURL_in_vector320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_vector325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock352 = new BitSet(new long[]{0x000400600E000100L});
	public static final BitSet FOLLOW_statement_in_codeblock355 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock357 = new BitSet(new long[]{0x000400600E000100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement394 = new BitSet(new long[]{0x0004000000000100L});
	public static final BitSet FOLLOW_identifier_in_statement397 = new BitSet(new long[]{0x0000080290002090L});
	public static final BitSet FOLLOW_assignment_in_statement400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_function_in_statement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_statement406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement416 = new BitSet(new long[]{0x0004000001000100L});
	public static final BitSet FOLLOW_valore_in_statement418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment457 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_type_value_in_assignment459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type_value522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type_value526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_type_value530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplyExp_in_expression551 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_ADD_in_expression555 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_multiplyExp_in_expression557 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_SUB_in_expression562 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_multiplyExp_in_expression564 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp591 = new BitSet(new long[]{0x0000000200002002L});
	public static final BitSet FOLLOW_MULT_in_multiplyExp595 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp597 = new BitSet(new long[]{0x0000000200002002L});
	public static final BitSet FOLLOW_DIV_in_multiplyExp602 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp604 = new BitSet(new long[]{0x0000000200002002L});
	public static final BitSet FOLLOW_INT_in_atomExp623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atomExp635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atomExp645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atomExp658 = new BitSet(new long[]{0x0004000081040100L});
	public static final BitSet FOLLOW_expression_in_atomExp660 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atomExp662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_valore679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_valore683 = new BitSet(new long[]{0x0000000000000002L});
}
