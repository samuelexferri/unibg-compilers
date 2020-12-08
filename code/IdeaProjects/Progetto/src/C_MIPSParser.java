// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-08 10:09:57

	// package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AMP", "ARROW", "ASS", 
		"CHAR", "CHAR_QUOTE", "COMMA", "COMMENT", "DIGIT", "DIGIT_NO_ZERO", "DIV", 
		"DOT", "D_QUOTE", "ELSE", "EQ", "FLOAT", "FOR", "GE", "GT", "HASHTAG", 
		"IF", "INCLUDE", "INT", "K_CHAR", "K_FLOAT", "K_INT", "LBRACK", "LCURL", 
		"LE", "LPAREN", "LT", "MULT", "NEQ", "NEWL", "PERC", "RBRACK", "RCURL", 
		"RETURN", "RPAREN", "SEMICOL", "SLASHR", "SPACE", "SUB", "S_QUOTE", "TAB", 
		"TOKEN_ERROR", "UNDRSCR", "VOID", "WHILE", "WORD", "WS"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AMP=5;
	public static final int ARROW=6;
	public static final int ASS=7;
	public static final int CHAR=8;
	public static final int CHAR_QUOTE=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int DIGIT=12;
	public static final int DIGIT_NO_ZERO=13;
	public static final int DIV=14;
	public static final int DOT=15;
	public static final int D_QUOTE=16;
	public static final int ELSE=17;
	public static final int EQ=18;
	public static final int FLOAT=19;
	public static final int FOR=20;
	public static final int GE=21;
	public static final int GT=22;
	public static final int HASHTAG=23;
	public static final int IF=24;
	public static final int INCLUDE=25;
	public static final int INT=26;
	public static final int K_CHAR=27;
	public static final int K_FLOAT=28;
	public static final int K_INT=29;
	public static final int LBRACK=30;
	public static final int LCURL=31;
	public static final int LE=32;
	public static final int LPAREN=33;
	public static final int LT=34;
	public static final int MULT=35;
	public static final int NEQ=36;
	public static final int NEWL=37;
	public static final int PERC=38;
	public static final int RBRACK=39;
	public static final int RCURL=40;
	public static final int RETURN=41;
	public static final int RPAREN=42;
	public static final int SEMICOL=43;
	public static final int SLASHR=44;
	public static final int SPACE=45;
	public static final int SUB=46;
	public static final int S_QUOTE=47;
	public static final int TAB=48;
	public static final int TOKEN_ERROR=49;
	public static final int UNDRSCR=50;
	public static final int VOID=51;
	public static final int WHILE=52;
	public static final int WORD=53;
	public static final int WS=54;

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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:1: start : ( INCLUDE )? ( global )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:9: ( ( INCLUDE )? ( global )* EOF )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:11: ( INCLUDE )? ( global )* EOF
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:11: ( INCLUDE )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INCLUDE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:11: INCLUDE
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_start67); 
					}
					break;

			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:20: ( global )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHAR||(LA2_0 >= K_CHAR && LA2_0 <= K_INT)||LA2_0==MULT||LA2_0==VOID||LA2_0==WORD) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:32:20: global
					{
					pushFollow(FOLLOW_global_in_start70);
					global();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start73); 
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



	// $ANTLR start "global"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:1: global : ( VOID identifier function | ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) ) );
	public final void global() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:10: ( VOID identifier function | ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VOID) ) {
				alt8=1;
			}
			else if ( (LA8_0==CHAR||(LA8_0 >= K_CHAR && LA8_0 <= K_INT)||LA8_0==MULT||LA8_0==WORD) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:35:12: VOID identifier function
					{
					match(input,VOID,FOLLOW_VOID_in_global92); 
					pushFollow(FOLLOW_identifier_in_global94);
					identifier();
					state._fsp--;

					pushFollow(FOLLOW_function_in_global96);
					function();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:7: ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:7: ( type_name )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= K_CHAR && LA3_0 <= K_INT)) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:7: type_name
							{
							pushFollow(FOLLOW_type_name_in_global105);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:18: ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==MULT) ) {
						alt7=1;
					}
					else if ( (LA7_0==CHAR||LA7_0==WORD) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:36:20: pointer SEMICOL
							{
							pushFollow(FOLLOW_pointer_in_global110);
							pointer();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_global112); 
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:11: identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function )
							{
							pushFollow(FOLLOW_identifier_in_global125);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:22: ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function )
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==ADD||LA6_0==ASS||LA6_0==COMMA||LA6_0==DIV||LA6_0==LBRACK||LA6_0==MULT||LA6_0==SEMICOL||LA6_0==SUB) ) {
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
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:23: ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:23: ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:24: ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:24: ( assignment ( COMMA identifier assignment )* | vector )
									int alt5=2;
									int LA5_0 = input.LA(1);
									if ( (LA5_0==ADD||LA5_0==ASS||LA5_0==COMMA||LA5_0==DIV||LA5_0==MULT||LA5_0==SEMICOL||LA5_0==SUB) ) {
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
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:25: assignment ( COMMA identifier assignment )*
											{
											pushFollow(FOLLOW_assignment_in_global130);
											assignment();
											state._fsp--;

											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:36: ( COMMA identifier assignment )*
											loop4:
											while (true) {
												int alt4=2;
												int LA4_0 = input.LA(1);
												if ( (LA4_0==COMMA) ) {
													alt4=1;
												}

												switch (alt4) {
												case 1 :
													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:37: COMMA identifier assignment
													{
													match(input,COMMA,FOLLOW_COMMA_in_global133); 
													pushFollow(FOLLOW_identifier_in_global135);
													identifier();
													state._fsp--;

													pushFollow(FOLLOW_assignment_in_global137);
													assignment();
													state._fsp--;

													}
													break;

												default :
													break loop4;
												}
											}

											}
											break;
										case 2 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:37:68: vector
											{
											pushFollow(FOLLOW_vector_in_global142);
											vector();
											state._fsp--;

											}
											break;

									}

									match(input,SEMICOL,FOLLOW_SEMICOL_in_global145); 
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:38:15: function
									{
									pushFollow(FOLLOW_function_in_global163);
									function();
									state._fsp--;

									}
									break;

							}

							}
							break;

					}

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
	// $ANTLR end "global"



	// $ANTLR start "assignment"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:1: assignment : ( ( ADD | SUB | MULT | DIV )? ASS expression )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:13: ( ( ( ADD | SUB | MULT | DIV )? ASS expression )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:15: ( ( ADD | SUB | MULT | DIV )? ASS expression )?
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:15: ( ( ADD | SUB | MULT | DIV )? ASS expression )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ADD||LA10_0==ASS||LA10_0==DIV||LA10_0==MULT||LA10_0==SUB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:16: ( ADD | SUB | MULT | DIV )? ASS expression
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:41:16: ( ADD | SUB | MULT | DIV )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ADD||LA9_0==DIV||LA9_0==MULT||LA9_0==SUB) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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

					match(input,ASS,FOLLOW_ASS_in_assignment201); 
					pushFollow(FOLLOW_expression_in_assignment203);
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
	// $ANTLR end "assignment"



	// $ANTLR start "vector"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:1: vector : LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? ;
	public final void vector() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:11: ( LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:13: LBRACK ( INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_vector226); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:20: ( INT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:20: INT
					{
					match(input,INT,FOLLOW_INT_in_vector228); 
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector231); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:32: ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ASS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:33: ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					{
					match(input,ASS,FOLLOW_ASS_in_vector234); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:37: ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==LCURL) ) {
						alt13=1;
					}
					else if ( (LA13_0==AMP||(LA13_0 >= CHAR && LA13_0 <= CHAR_QUOTE)||LA13_0==FLOAT||LA13_0==INT||LA13_0==LPAREN||LA13_0==MULT||LA13_0==WORD) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:38: ( LCURL expression ( COMMA expression )* RCURL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:38: ( LCURL expression ( COMMA expression )* RCURL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:39: LCURL expression ( COMMA expression )* RCURL
							{
							match(input,LCURL,FOLLOW_LCURL_in_vector238); 
							pushFollow(FOLLOW_expression_in_vector240);
							expression();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:56: ( COMMA expression )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==COMMA) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:57: COMMA expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector243); 
									pushFollow(FOLLOW_expression_in_vector245);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop12;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector249); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:44:85: expression
							{
							pushFollow(FOLLOW_expression_in_vector254);
							expression();
							state._fsp--;

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



	// $ANTLR start "pointer"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:1: pointer : MULT identifier ( ASS expression )? ;
	public final void pointer() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:11: ( MULT identifier ( ASS expression )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:13: MULT identifier ( ASS expression )?
			{
			match(input,MULT,FOLLOW_MULT_in_pointer277); 
			pushFollow(FOLLOW_identifier_in_pointer279);
			identifier();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:29: ( ASS expression )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ASS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:47:30: ASS expression
					{
					match(input,ASS,FOLLOW_ASS_in_pointer282); 
					pushFollow(FOLLOW_expression_in_pointer284);
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
	// $ANTLR end "pointer"



	// $ANTLR start "function"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:12: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:14: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_function307); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:21: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= K_CHAR && LA17_0 <= K_INT)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:22: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function310);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function312);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:43: ( COMMA type_name identifier )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:50:44: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function315); 
							pushFollow(FOLLOW_type_name_in_function317);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function319);
							identifier();
							state._fsp--;

							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_function325); 
			pushFollow(FOLLOW_codeblock_in_function327);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:1: call_function : LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:16: ( LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )? RPAREN )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:18: LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function341); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:25: ( ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )* )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==CHAR||LA23_0==D_QUOTE||LA23_0==WORD) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:26: ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )*
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:26: ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==D_QUOTE) ) {
						alt19=1;
					}
					else if ( (LA19_0==CHAR||LA19_0==WORD) ) {
						alt19=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:27: ( D_QUOTE ( anything )* D_QUOTE )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:27: ( D_QUOTE ( anything )* D_QUOTE )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:28: D_QUOTE ( anything )* D_QUOTE
							{
							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function346); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:36: ( anything )*
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( ((LA18_0 >= ADD && LA18_0 <= AMP)||(LA18_0 >= ASS && LA18_0 <= CHAR)||LA18_0==DIV||(LA18_0 >= FLOAT && LA18_0 <= FOR)||(LA18_0 >= HASHTAG && LA18_0 <= IF)||LA18_0==INT||LA18_0==MULT||LA18_0==PERC||(LA18_0 >= SPACE && LA18_0 <= SUB)||(LA18_0 >= WHILE && LA18_0 <= WS)) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:36: anything
									{
									pushFollow(FOLLOW_anything_in_call_function348);
									anything();
									state._fsp--;

									}
									break;

								default :
									break loop18;
								}
							}

							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function351); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:57: identifier
							{
							pushFollow(FOLLOW_identifier_in_call_function356);
							identifier();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:69: ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier ) )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==COMMA) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:70: COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier )
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function360); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:76: ( ( D_QUOTE ( anything )* D_QUOTE ) | identifier )
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==D_QUOTE) ) {
								alt21=1;
							}
							else if ( (LA21_0==CHAR||LA21_0==WORD) ) {
								alt21=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 21, 0, input);
								throw nvae;
							}

							switch (alt21) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:77: ( D_QUOTE ( anything )* D_QUOTE )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:77: ( D_QUOTE ( anything )* D_QUOTE )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:78: D_QUOTE ( anything )* D_QUOTE
									{
									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function364); 
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:86: ( anything )*
									loop20:
									while (true) {
										int alt20=2;
										int LA20_0 = input.LA(1);
										if ( ((LA20_0 >= ADD && LA20_0 <= AMP)||(LA20_0 >= ASS && LA20_0 <= CHAR)||LA20_0==DIV||(LA20_0 >= FLOAT && LA20_0 <= FOR)||(LA20_0 >= HASHTAG && LA20_0 <= IF)||LA20_0==INT||LA20_0==MULT||LA20_0==PERC||(LA20_0 >= SPACE && LA20_0 <= SUB)||(LA20_0 >= WHILE && LA20_0 <= WS)) ) {
											alt20=1;
										}

										switch (alt20) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:86: anything
											{
											pushFollow(FOLLOW_anything_in_call_function366);
											anything();
											state._fsp--;

											}
											break;

										default :
											break loop20;
										}
									}

									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function369); 
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:53:107: identifier
									{
									pushFollow(FOLLOW_identifier_in_call_function374);
									identifier();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop22;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function381); 
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



	// $ANTLR start "codeblock"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:1: codeblock : ( LCURL ( statement )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:13: ( LCURL ( statement )* RCURL | SEMICOL )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LCURL) ) {
				alt25=1;
			}
			else if ( (LA25_0==SEMICOL) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:15: LCURL ( statement )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_codeblock400); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:21: ( statement )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==CHAR||LA24_0==FOR||LA24_0==IF||(LA24_0 >= K_CHAR && LA24_0 <= K_INT)||LA24_0==MULT||LA24_0==RETURN||(LA24_0 >= WHILE && LA24_0 <= WORD)) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:56:22: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock403);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop24;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock407); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:57:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock421); 
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:1: statement : ( ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL | ifStat | whileStat | forStat | RETURN atom_exp SEMICOL );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:13: ( ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL | ifStat | whileStat | forStat | RETURN atom_exp SEMICOL )
			int alt30=5;
			switch ( input.LA(1) ) {
			case CHAR:
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case MULT:
			case WORD:
				{
				alt30=1;
				}
				break;
			case IF:
				{
				alt30=2;
				}
				break;
			case WHILE:
				{
				alt30=3;
				}
				break;
			case FOR:
				{
				alt30=4;
				}
				break;
			case RETURN:
				{
				alt30=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:15: ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:15: ( type_name )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( ((LA26_0 >= K_CHAR && LA26_0 <= K_INT)) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement437);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:26: ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==CHAR||LA29_0==WORD) ) {
						alt29=1;
					}
					else if ( (LA29_0==MULT) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:27: identifier ( assignment ( COMMA identifier assignment )* | call_function | vector )
							{
							pushFollow(FOLLOW_identifier_in_statement441);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:38: ( assignment ( COMMA identifier assignment )* | call_function | vector )
							int alt28=3;
							switch ( input.LA(1) ) {
							case ADD:
							case ASS:
							case COMMA:
							case DIV:
							case MULT:
							case SEMICOL:
							case SUB:
								{
								alt28=1;
								}
								break;
							case LPAREN:
								{
								alt28=2;
								}
								break;
							case LBRACK:
								{
								alt28=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 28, 0, input);
								throw nvae;
							}
							switch (alt28) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:39: assignment ( COMMA identifier assignment )*
									{
									pushFollow(FOLLOW_assignment_in_statement444);
									assignment();
									state._fsp--;

									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:50: ( COMMA identifier assignment )*
									loop27:
									while (true) {
										int alt27=2;
										int LA27_0 = input.LA(1);
										if ( (LA27_0==COMMA) ) {
											alt27=1;
										}

										switch (alt27) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:51: COMMA identifier assignment
											{
											match(input,COMMA,FOLLOW_COMMA_in_statement447); 
											pushFollow(FOLLOW_identifier_in_statement449);
											identifier();
											state._fsp--;

											pushFollow(FOLLOW_assignment_in_statement451);
											assignment();
											state._fsp--;

											}
											break;

										default :
											break loop27;
										}
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:83: call_function
									{
									pushFollow(FOLLOW_call_function_in_statement457);
									call_function();
									state._fsp--;

									}
									break;
								case 3 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:99: vector
									{
									pushFollow(FOLLOW_vector_in_statement461);
									vector();
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:60:109: pointer
							{
							pushFollow(FOLLOW_pointer_in_statement466);
							pointer();
							state._fsp--;

							}
							break;

					}

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement469); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:61:7: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_statement477);
					ifStat();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:62:7: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_statement485);
					whileStat();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:63:7: forStat
					{
					pushFollow(FOLLOW_forStat_in_statement493);
					forStat();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:64:9: RETURN atom_exp SEMICOL
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement503); 
					pushFollow(FOLLOW_atom_exp_in_statement505);
					atom_exp();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement507); 
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



	// $ANTLR start "ifStat"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:1: ifStat : IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? ;
	public final void ifStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:10: ( IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:12: IF LPAREN ( expression compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )?
			{
			match(input,IF,FOLLOW_IF_in_ifStat531); 
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStat533); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:22: ( expression compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:23: expression compare expression
			{
			pushFollow(FOLLOW_expression_in_ifStat536);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_ifStat538);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_ifStat540);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_ifStat543); 
			pushFollow(FOLLOW_codeblock_in_ifStat545);
			codeblock();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:71: ( ELSE ( codeblock | ifStat | whileStat ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ELSE) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:72: ELSE ( codeblock | ifStat | whileStat )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStat548); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:77: ( codeblock | ifStat | whileStat )
					int alt31=3;
					switch ( input.LA(1) ) {
					case LCURL:
					case SEMICOL:
						{
						alt31=1;
						}
						break;
					case IF:
						{
						alt31=2;
						}
						break;
					case WHILE:
						{
						alt31=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}
					switch (alt31) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:78: codeblock
							{
							pushFollow(FOLLOW_codeblock_in_ifStat551);
							codeblock();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:90: ifStat
							{
							pushFollow(FOLLOW_ifStat_in_ifStat555);
							ifStat();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:67:99: whileStat
							{
							pushFollow(FOLLOW_whileStat_in_ifStat559);
							whileStat();
							state._fsp--;

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
	// $ANTLR end "ifStat"



	// $ANTLR start "whileStat"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:1: whileStat : WHILE LPAREN ( expression compare expression ) RPAREN codeblock ;
	public final void whileStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:12: ( WHILE LPAREN ( expression compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:14: WHILE LPAREN ( expression compare expression ) RPAREN codeblock
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileStat581); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStat583); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:27: ( expression compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:28: expression compare expression
			{
			pushFollow(FOLLOW_expression_in_whileStat586);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_whileStat588);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_whileStat590);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat593); 
			pushFollow(FOLLOW_codeblock_in_whileStat595);
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
	// $ANTLR end "whileStat"



	// $ANTLR start "forStat"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:1: forStat : FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock ;
	public final void forStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:11: ( FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:13: FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock
			{
			match(input,FOR,FOLLOW_FOR_in_forStat614); 
			match(input,LPAREN,FOLLOW_LPAREN_in_forStat616); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:24: ( ( type_name )? identifier ASS expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:25: ( type_name )? identifier ASS expression
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:25: ( type_name )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( ((LA33_0 >= K_CHAR && LA33_0 <= K_INT)) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:25: type_name
					{
					pushFollow(FOLLOW_type_name_in_forStat619);
					type_name();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_forStat622);
			identifier();
			state._fsp--;

			match(input,ASS,FOLLOW_ASS_in_forStat624); 
			pushFollow(FOLLOW_expression_in_forStat626);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat629); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:71: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:72: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat632);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat634);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat636);
			expression();
			state._fsp--;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat639); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:111: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:112: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat642);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat644);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat646);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat649); 
			pushFollow(FOLLOW_codeblock_in_forStat651);
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
	// $ANTLR end "forStat"



	// $ANTLR start "type_name"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:1: type_name : ( K_INT | K_FLOAT | K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:77:12: ( ( K_INT | K_FLOAT | K_CHAR ) )
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:1: identifier : ( WORD | CHAR ) ;
	public final void identifier() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:80:13: ( ( WORD | CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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



	// $ANTLR start "expression"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:1: expression : multiply_exp ( ADD multiply_exp | SUB multiply_exp )* ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:14: ( multiply_exp ( ADD multiply_exp | SUB multiply_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:16: multiply_exp ( ADD multiply_exp | SUB multiply_exp )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression717);
			multiply_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:29: ( ADD multiply_exp | SUB multiply_exp )*
			loop34:
			while (true) {
				int alt34=3;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==ADD) ) {
					alt34=1;
				}
				else if ( (LA34_0==SUB) ) {
					alt34=2;
				}

				switch (alt34) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:30: ADD multiply_exp
					{
					match(input,ADD,FOLLOW_ADD_in_expression720); 
					pushFollow(FOLLOW_multiply_exp_in_expression722);
					multiply_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:49: SUB multiply_exp
					{
					match(input,SUB,FOLLOW_SUB_in_expression726); 
					pushFollow(FOLLOW_multiply_exp_in_expression728);
					multiply_exp();
					state._fsp--;

					}
					break;

				default :
					break loop34;
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



	// $ANTLR start "multiply_exp"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:1: multiply_exp : atom_exp ( MULT atom_exp | DIV atom_exp )* ;
	public final void multiply_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:15: ( atom_exp ( MULT atom_exp | DIV atom_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:17: atom_exp ( MULT atom_exp | DIV atom_exp )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp752);
			atom_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:26: ( MULT atom_exp | DIV atom_exp )*
			loop35:
			while (true) {
				int alt35=3;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==MULT) ) {
					alt35=1;
				}
				else if ( (LA35_0==DIV) ) {
					alt35=2;
				}

				switch (alt35) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:27: MULT atom_exp
					{
					match(input,MULT,FOLLOW_MULT_in_multiply_exp755); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp757);
					atom_exp();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:43: DIV atom_exp
					{
					match(input,DIV,FOLLOW_DIV_in_multiply_exp761); 
					pushFollow(FOLLOW_atom_exp_in_multiply_exp763);
					atom_exp();
					state._fsp--;

					}
					break;

				default :
					break loop35;
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
	// $ANTLR end "multiply_exp"



	// $ANTLR start "atom_exp"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:1: atom_exp : ( INT | FLOAT | CHAR_QUOTE | ( MULT | AMP )? identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN );
	public final void atom_exp() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:12: ( INT | FLOAT | CHAR_QUOTE | ( MULT | AMP )? identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN )
			int alt38=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt38=1;
				}
				break;
			case FLOAT:
				{
				alt38=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt38=3;
				}
				break;
			case AMP:
			case CHAR:
			case MULT:
			case WORD:
				{
				alt38=4;
				}
				break;
			case LPAREN:
				{
				alt38=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:14: INT
					{
					match(input,INT,FOLLOW_INT_in_atom_exp783); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp791); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:7: CHAR_QUOTE
					{
					match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp801); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:92:7: ( MULT | AMP )? identifier ( LBRACK INT RBRACK )?
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:92:7: ( MULT | AMP )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==AMP||LA36_0==MULT) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
							{
							if ( input.LA(1)==AMP||input.LA(1)==MULT ) {
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

					pushFollow(FOLLOW_identifier_in_atom_exp818);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:92:32: ( LBRACK INT RBRACK )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==LBRACK) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:92:33: LBRACK INT RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp821); 
							match(input,INT,FOLLOW_INT_in_atom_exp823); 
							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp825); 
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:10: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp839); 
					pushFollow(FOLLOW_expression_in_atom_exp841);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp843); 
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
	// $ANTLR end "atom_exp"



	// $ANTLR start "anything"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:1: anything : ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS );
	public final void anything() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:11: ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
			{
			if ( (input.LA(1) >= ADD && input.LA(1) <= AMP)||(input.LA(1) >= ASS && input.LA(1) <= CHAR)||input.LA(1)==DIV||(input.LA(1) >= FLOAT && input.LA(1) <= FOR)||(input.LA(1) >= HASHTAG && input.LA(1) <= IF)||input.LA(1)==INT||input.LA(1)==MULT||input.LA(1)==PERC||(input.LA(1) >= SPACE && input.LA(1) <= SUB)||(input.LA(1) >= WHILE && input.LA(1) <= WS) ) {
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
	// $ANTLR end "anything"



	// $ANTLR start "compare"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:1: compare : ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) );
	public final void compare() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:11: ( EQ | NEQ | LT | GT | LE | GE | ( ( ADD | SUB | MULT | DIV )? ASS ) )
			int alt40=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt40=1;
				}
				break;
			case NEQ:
				{
				alt40=2;
				}
				break;
			case LT:
				{
				alt40=3;
				}
				break;
			case GT:
				{
				alt40=4;
				}
				break;
			case LE:
				{
				alt40=5;
				}
				break;
			case GE:
				{
				alt40=6;
				}
				break;
			case ADD:
			case ASS:
			case DIV:
			case MULT:
			case SUB:
				{
				alt40=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:13: EQ
					{
					match(input,EQ,FOLLOW_EQ_in_compare944); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:18: NEQ
					{
					match(input,NEQ,FOLLOW_NEQ_in_compare948); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:24: LT
					{
					match(input,LT,FOLLOW_LT_in_compare952); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:29: GT
					{
					match(input,GT,FOLLOW_GT_in_compare956); 
					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:34: LE
					{
					match(input,LE,FOLLOW_LE_in_compare960); 
					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:39: GE
					{
					match(input,GE,FOLLOW_GE_in_compare964); 
					}
					break;
				case 7 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:44: ( ( ADD | SUB | MULT | DIV )? ASS )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:45: ( ADD | SUB | MULT | DIV )? ASS
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:45: ( ADD | SUB | MULT | DIV )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==ADD||LA39_0==DIV||LA39_0==MULT||LA39_0==SUB) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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

					match(input,ASS,FOLLOW_ASS_in_compare986); 
					}

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
	// $ANTLR end "compare"

	// Delegated rules



	public static final BitSet FOLLOW_INCLUDE_in_start67 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_global_in_start70 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_EOF_in_start73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_global92 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_global94 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_function_in_global96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_global105 = new BitSet(new long[]{0x0020000800000100L});
	public static final BitSet FOLLOW_pointer_in_global110 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_global125 = new BitSet(new long[]{0x0000480A40004490L});
	public static final BitSet FOLLOW_assignment_in_global130 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_COMMA_in_global133 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_global135 = new BitSet(new long[]{0x0000480800004490L});
	public static final BitSet FOLLOW_assignment_in_global137 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_vector_in_global142 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_global163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment201 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_assignment203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector226 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_INT_in_vector228 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector231 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector234 = new BitSet(new long[]{0x0020000A84080320L});
	public static final BitSet FOLLOW_LCURL_in_vector238 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_vector240 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_vector243 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_vector245 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RCURL_in_vector249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_vector254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_pointer277 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_pointer279 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_pointer282 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_pointer284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function307 = new BitSet(new long[]{0x0000040038000000L});
	public static final BitSet FOLLOW_type_name_in_function310 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_function312 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_function315 = new BitSet(new long[]{0x0000000038000000L});
	public static final BitSet FOLLOW_type_name_in_function317 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_function319 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_function325 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_function327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function341 = new BitSet(new long[]{0x0020040000010100L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function346 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function348 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function351 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_identifier_in_call_function356 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_call_function360 = new BitSet(new long[]{0x0020000000010100L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function364 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function366 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function369 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_identifier_in_call_function374 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_call_function381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock400 = new BitSet(new long[]{0x0030030839100100L});
	public static final BitSet FOLLOW_statement_in_codeblock403 = new BitSet(new long[]{0x0030030839100100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement437 = new BitSet(new long[]{0x0020000800000100L});
	public static final BitSet FOLLOW_identifier_in_statement441 = new BitSet(new long[]{0x0000480A40004490L});
	public static final BitSet FOLLOW_assignment_in_statement444 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_COMMA_in_statement447 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_statement449 = new BitSet(new long[]{0x0000480800004490L});
	public static final BitSet FOLLOW_assignment_in_statement451 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_call_function_in_statement457 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_vector_in_statement461 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_pointer_in_statement466 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_statement477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_statement485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_statement493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement503 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_atom_exp_in_statement505 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStat531 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStat533 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_ifStat536 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_ifStat538 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_ifStat540 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifStat543 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat545 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifStat548 = new BitSet(new long[]{0x0010080081000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStat555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_ifStat559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStat581 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStat583 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_whileStat586 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_whileStat588 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_whileStat590 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat593 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_whileStat595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStat614 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStat616 = new BitSet(new long[]{0x0020000038000100L});
	public static final BitSet FOLLOW_type_name_in_forStat619 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat622 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_forStat624 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_forStat626 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat629 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat632 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat634 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_forStat636 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat639 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat642 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat644 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_forStat646 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_forStat649 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_forStat651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression717 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_ADD_in_expression720 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_multiply_exp_in_expression722 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_SUB_in_expression726 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_multiply_exp_in_expression728 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp752 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp755 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp757 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp761 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp763 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_INT_in_atom_exp783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom_exp818 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp821 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp823 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp839 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_atom_exp841 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_compare944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_compare948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_compare952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_compare956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_compare960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_compare964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_compare986 = new BitSet(new long[]{0x0000000000000002L});
}
