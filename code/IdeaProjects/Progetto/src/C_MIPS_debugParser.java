// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g 2020-12-08 16:25:00

	// package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPS_debugParser extends Parser {
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


	public C_MIPS_debugParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public C_MIPS_debugParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return C_MIPS_debugParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g"; }


		// int test;



	// $ANTLR start "start"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:32:1: start : ( include )* ( global )* EOF ;
	public final void start() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:32:9: ( ( include )* ( global )* EOF )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:32:11: ( include )* ( global )* EOF
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:32:11: ( include )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:32:11: include
					{
					pushFollow(FOLLOW_include_in_start67);
					include();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:32:20: ( global )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHAR||(LA2_0 >= K_CHAR && LA2_0 <= K_INT)||LA2_0==MULT||LA2_0==VOID||LA2_0==WORD) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:32:20: global
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:35:1: global : ( VOID identifier function | ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) ) );
	public final void global() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:35:10: ( VOID identifier function | ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) ) )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:35:12: VOID identifier function
					{
					match(input,VOID,FOLLOW_VOID_in_global92); 
					System.out.print("VOID ");
					pushFollow(FOLLOW_identifier_in_global96);
					identifier();
					state._fsp--;

					pushFollow(FOLLOW_function_in_global98);
					function();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:36:7: ( type_name )? ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:36:7: ( type_name )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= K_CHAR && LA3_0 <= K_INT)) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:36:7: type_name
							{
							pushFollow(FOLLOW_type_name_in_global107);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:36:18: ( pointer SEMICOL | identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function ) )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:36:20: pointer SEMICOL
							{
							pushFollow(FOLLOW_pointer_in_global112);
							pointer();
							state._fsp--;

							match(input,SEMICOL,FOLLOW_SEMICOL_in_global114); 
							System.out.print("\n");
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:11: identifier ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function )
							{
							pushFollow(FOLLOW_identifier_in_global128);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:22: ( ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL ) | function )
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
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:23: ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:23: ( ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:24: ( assignment ( COMMA identifier assignment )* | vector ) SEMICOL
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:24: ( assignment ( COMMA identifier assignment )* | vector )
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
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:25: assignment ( COMMA identifier assignment )*
											{
											pushFollow(FOLLOW_assignment_in_global133);
											assignment();
											state._fsp--;

											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:36: ( COMMA identifier assignment )*
											loop4:
											while (true) {
												int alt4=2;
												int LA4_0 = input.LA(1);
												if ( (LA4_0==COMMA) ) {
													alt4=1;
												}

												switch (alt4) {
												case 1 :
													// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:37: COMMA identifier assignment
													{
													match(input,COMMA,FOLLOW_COMMA_in_global136); 
													System.out.print(", ");
													pushFollow(FOLLOW_identifier_in_global140);
													identifier();
													state._fsp--;

													pushFollow(FOLLOW_assignment_in_global142);
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
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:37:94: vector
											{
											pushFollow(FOLLOW_vector_in_global147);
											vector();
											state._fsp--;

											}
											break;

									}

									match(input,SEMICOL,FOLLOW_SEMICOL_in_global150); 
									System.out.print("\n");
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:38:15: function
									{
									pushFollow(FOLLOW_function_in_global170);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:41:1: assignment : ( ( ADD | SUB | MULT | DIV )? ASS expression )? ;
	public final void assignment() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:41:13: ( ( ( ADD | SUB | MULT | DIV )? ASS expression )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:41:15: ( ( ADD | SUB | MULT | DIV )? ASS expression )?
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:41:15: ( ( ADD | SUB | MULT | DIV )? ASS expression )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ADD||LA10_0==ASS||LA10_0==DIV||LA10_0==MULT||LA10_0==SUB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:41:16: ( ADD | SUB | MULT | DIV )? ASS expression
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:41:16: ( ADD | SUB | MULT | DIV )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ADD||LA9_0==DIV||LA9_0==MULT||LA9_0==SUB) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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

					match(input,ASS,FOLLOW_ASS_in_assignment208); 
					System.out.print("\t---> ");
					pushFollow(FOLLOW_expression_in_assignment212);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:1: vector : LBRACK (x= INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? ;
	public final void vector() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:11: ( LBRACK (x= INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:13: LBRACK (x= INT )? RBRACK ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			{
			System.out.print("[vector ");
			match(input,LBRACK,FOLLOW_LBRACK_in_vector237); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:52: (x= INT )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:53: x= INT
					{
					x=(Token)match(input,INT,FOLLOW_INT_in_vector242); 
					System.out.print("int=" + x.getText());
					}
					break;

			}

			match(input,RBRACK,FOLLOW_RBRACK_in_vector248); 
			System.out.print("] ");
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:137: ( ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ASS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:138: ASS ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
					{
					match(input,ASS,FOLLOW_ASS_in_vector253); 
					System.out.print("\t-v-> ");
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:173: ( ( LCURL expression ( COMMA expression )* RCURL ) | expression )
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:174: ( LCURL expression ( COMMA expression )* RCURL )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:174: ( LCURL expression ( COMMA expression )* RCURL )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:175: LCURL expression ( COMMA expression )* RCURL
							{
							System.out.print("{ ");
							match(input,LCURL,FOLLOW_LCURL_in_vector261); 
							pushFollow(FOLLOW_expression_in_vector263);
							expression();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:218: ( COMMA expression )*
							loop12:
							while (true) {
								int alt12=2;
								int LA12_0 = input.LA(1);
								if ( (LA12_0==COMMA) ) {
									alt12=1;
								}

								switch (alt12) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:219: COMMA expression
									{
									match(input,COMMA,FOLLOW_COMMA_in_vector266); 
									System.out.print(", ");
									pushFollow(FOLLOW_expression_in_vector270);
									expression();
									state._fsp--;

									}
									break;

								default :
									break loop12;
								}
							}

							match(input,RCURL,FOLLOW_RCURL_in_vector274); 
							System.out.print("} ");
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:44:299: expression
							{
							pushFollow(FOLLOW_expression_in_vector281);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:47:1: pointer : MULT identifier ( ASS expression )? ;
	public final void pointer() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:47:11: ( MULT identifier ( ASS expression )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:47:13: MULT identifier ( ASS expression )?
			{
			match(input,MULT,FOLLOW_MULT_in_pointer304); 
			System.out.print("* ");
			pushFollow(FOLLOW_identifier_in_pointer308);
			identifier();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:47:55: ( ASS expression )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ASS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:47:56: ASS expression
					{
					match(input,ASS,FOLLOW_ASS_in_pointer311); 
					System.out.print("\t-p-> ");
					pushFollow(FOLLOW_expression_in_pointer315);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:50:1: function : LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock ;
	public final void function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:50:12: ( LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:50:14: LPAREN ( type_name identifier ( COMMA type_name identifier )* )? RPAREN codeblock
			{
			System.out.print("FUNCTION ");
			match(input,LPAREN,FOLLOW_LPAREN_in_function340); 
			System.out.print("( ");
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:50:80: ( type_name identifier ( COMMA type_name identifier )* )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= K_CHAR && LA17_0 <= K_INT)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:50:81: type_name identifier ( COMMA type_name identifier )*
					{
					pushFollow(FOLLOW_type_name_in_function345);
					type_name();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_function347);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:50:102: ( COMMA type_name identifier )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:50:103: COMMA type_name identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_function350); 
							System.out.print(", ");
							pushFollow(FOLLOW_type_name_in_function354);
							type_name();
							state._fsp--;

							pushFollow(FOLLOW_identifier_in_function356);
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

			match(input,RPAREN,FOLLOW_RPAREN_in_function362); 
			System.out.print(") ");
			pushFollow(FOLLOW_codeblock_in_function366);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:1: call_function : LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )? RPAREN ;
	public final void call_function() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:16: ( LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )? RPAREN )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:18: LPAREN ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )? RPAREN
			{
			System.out.print("CALL_FUNCTION ");
			match(input,LPAREN,FOLLOW_LPAREN_in_call_function382); 
			System.out.print("( ");
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:89: ( ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )* )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==CHAR||LA25_0==D_QUOTE||LA25_0==MULT||LA25_0==WORD) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:90: ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )*
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:90: ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==D_QUOTE) ) {
						alt20=1;
					}
					else if ( (LA20_0==CHAR||LA20_0==MULT||LA20_0==WORD) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:91: ( D_QUOTE ( anything )* D_QUOTE )
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:91: ( D_QUOTE ( anything )* D_QUOTE )
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:92: D_QUOTE ( anything )* D_QUOTE
							{
							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function389); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:100: ( anything )*
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( ((LA18_0 >= ADD && LA18_0 <= AMP)||(LA18_0 >= ASS && LA18_0 <= CHAR)||LA18_0==DIV||(LA18_0 >= FLOAT && LA18_0 <= FOR)||(LA18_0 >= HASHTAG && LA18_0 <= IF)||LA18_0==INT||LA18_0==MULT||LA18_0==PERC||(LA18_0 >= SPACE && LA18_0 <= SUB)||(LA18_0 >= WHILE && LA18_0 <= WS)) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:100: anything
									{
									pushFollow(FOLLOW_anything_in_call_function391);
									anything();
									state._fsp--;

									}
									break;

								default :
									break loop18;
								}
							}

							match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function394); 
							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:121: ( MULT )? identifier
							{
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:121: ( MULT )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==MULT) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:121: MULT
									{
									match(input,MULT,FOLLOW_MULT_in_call_function399); 
									}
									break;

							}

							pushFollow(FOLLOW_identifier_in_call_function402);
							identifier();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:139: ( COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier ) )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==COMMA) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:140: COMMA ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier )
							{
							match(input,COMMA,FOLLOW_COMMA_in_call_function406); 
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:146: ( ( D_QUOTE ( anything )* D_QUOTE ) | ( MULT )? identifier )
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==D_QUOTE) ) {
								alt23=1;
							}
							else if ( (LA23_0==CHAR||LA23_0==MULT||LA23_0==WORD) ) {
								alt23=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 23, 0, input);
								throw nvae;
							}

							switch (alt23) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:147: ( D_QUOTE ( anything )* D_QUOTE )
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:147: ( D_QUOTE ( anything )* D_QUOTE )
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:148: D_QUOTE ( anything )* D_QUOTE
									{
									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function410); 
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:156: ( anything )*
									loop21:
									while (true) {
										int alt21=2;
										int LA21_0 = input.LA(1);
										if ( ((LA21_0 >= ADD && LA21_0 <= AMP)||(LA21_0 >= ASS && LA21_0 <= CHAR)||LA21_0==DIV||(LA21_0 >= FLOAT && LA21_0 <= FOR)||(LA21_0 >= HASHTAG && LA21_0 <= IF)||LA21_0==INT||LA21_0==MULT||LA21_0==PERC||(LA21_0 >= SPACE && LA21_0 <= SUB)||(LA21_0 >= WHILE && LA21_0 <= WS)) ) {
											alt21=1;
										}

										switch (alt21) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:156: anything
											{
											pushFollow(FOLLOW_anything_in_call_function412);
											anything();
											state._fsp--;

											}
											break;

										default :
											break loop21;
										}
									}

									match(input,D_QUOTE,FOLLOW_D_QUOTE_in_call_function415); 
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:177: ( MULT )? identifier
									{
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:177: ( MULT )?
									int alt22=2;
									int LA22_0 = input.LA(1);
									if ( (LA22_0==MULT) ) {
										alt22=1;
									}
									switch (alt22) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:53:177: MULT
											{
											match(input,MULT,FOLLOW_MULT_in_call_function420); 
											}
											break;

									}

									pushFollow(FOLLOW_identifier_in_call_function423);
									identifier();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_call_function430); 
			System.out.print(") ");
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:56:1: codeblock : ( LCURL ( statement )* RCURL | SEMICOL );
	public final void codeblock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:56:13: ( LCURL ( statement )* RCURL | SEMICOL )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==LCURL) ) {
				alt27=1;
			}
			else if ( (LA27_0==SEMICOL) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:56:15: LCURL ( statement )* RCURL
					{
					System.out.print("\n");
					System.out.print("{\n");
					match(input,LCURL,FOLLOW_LCURL_in_codeblock455); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:56:74: ( statement )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==CHAR||LA26_0==FOR||LA26_0==IF||(LA26_0 >= K_CHAR && LA26_0 <= K_INT)||LA26_0==MULT||LA26_0==RETURN||(LA26_0 >= WHILE && LA26_0 <= WORD)) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:56:75: statement
							{
							pushFollow(FOLLOW_statement_in_codeblock458);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop26;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_codeblock462); 
					System.out.print("}\n");
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:57:10: SEMICOL
					{
					match(input,SEMICOL,FOLLOW_SEMICOL_in_codeblock476); 
					System.out.print("\n");
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:1: statement : ( ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL | ifStat | whileStat | forStat | RETURN atom_exp SEMICOL );
	public final void statement() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:13: ( ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL | ifStat | whileStat | forStat | RETURN atom_exp SEMICOL )
			int alt32=5;
			switch ( input.LA(1) ) {
			case CHAR:
			case K_CHAR:
			case K_FLOAT:
			case K_INT:
			case MULT:
			case WORD:
				{
				alt32=1;
				}
				break;
			case IF:
				{
				alt32=2;
				}
				break;
			case WHILE:
				{
				alt32=3;
				}
				break;
			case FOR:
				{
				alt32=4;
				}
				break;
			case RETURN:
				{
				alt32=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:15: ( type_name )? ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer ) SEMICOL
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:15: ( type_name )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( ((LA28_0 >= K_CHAR && LA28_0 <= K_INT)) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:15: type_name
							{
							pushFollow(FOLLOW_type_name_in_statement494);
							type_name();
							state._fsp--;

							}
							break;

					}

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:26: ( identifier ( assignment ( COMMA identifier assignment )* | call_function | vector ) | pointer )
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==CHAR||LA31_0==WORD) ) {
						alt31=1;
					}
					else if ( (LA31_0==MULT) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:27: identifier ( assignment ( COMMA identifier assignment )* | call_function | vector )
							{
							pushFollow(FOLLOW_identifier_in_statement498);
							identifier();
							state._fsp--;

							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:38: ( assignment ( COMMA identifier assignment )* | call_function | vector )
							int alt30=3;
							switch ( input.LA(1) ) {
							case ADD:
							case ASS:
							case COMMA:
							case DIV:
							case MULT:
							case SEMICOL:
							case SUB:
								{
								alt30=1;
								}
								break;
							case LPAREN:
								{
								alt30=2;
								}
								break;
							case LBRACK:
								{
								alt30=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 30, 0, input);
								throw nvae;
							}
							switch (alt30) {
								case 1 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:39: assignment ( COMMA identifier assignment )*
									{
									pushFollow(FOLLOW_assignment_in_statement501);
									assignment();
									state._fsp--;

									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:50: ( COMMA identifier assignment )*
									loop29:
									while (true) {
										int alt29=2;
										int LA29_0 = input.LA(1);
										if ( (LA29_0==COMMA) ) {
											alt29=1;
										}

										switch (alt29) {
										case 1 :
											// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:51: COMMA identifier assignment
											{
											match(input,COMMA,FOLLOW_COMMA_in_statement504); 
											System.out.print(", ");
											pushFollow(FOLLOW_identifier_in_statement508);
											identifier();
											state._fsp--;

											pushFollow(FOLLOW_assignment_in_statement510);
											assignment();
											state._fsp--;

											}
											break;

										default :
											break loop29;
										}
									}

									}
									break;
								case 2 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:109: call_function
									{
									pushFollow(FOLLOW_call_function_in_statement516);
									call_function();
									state._fsp--;

									}
									break;
								case 3 :
									// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:125: vector
									{
									pushFollow(FOLLOW_vector_in_statement520);
									vector();
									state._fsp--;

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:60:135: pointer
							{
							pushFollow(FOLLOW_pointer_in_statement525);
							pointer();
							state._fsp--;

							}
							break;

					}

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement528); 
					System.out.print("\n");
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:61:7: ifStat
					{
					pushFollow(FOLLOW_ifStat_in_statement538);
					ifStat();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:62:7: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_statement546);
					whileStat();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:63:7: forStat
					{
					pushFollow(FOLLOW_forStat_in_statement554);
					forStat();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:64:9: RETURN atom_exp SEMICOL
					{
					System.out.print("return ");
					match(input,RETURN,FOLLOW_RETURN_in_statement567); 
					pushFollow(FOLLOW_atom_exp_in_statement569);
					atom_exp();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement571); 
					System.out.print("\n");
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:1: ifStat : IF LPAREN ( identifier compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? ;
	public final void ifStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:10: ( IF LPAREN ( identifier compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )? )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:12: IF LPAREN ( identifier compare expression ) RPAREN codeblock ( ELSE ( codeblock | ifStat | whileStat ) )?
			{
			System.out.print("IF ");
			match(input,IF,FOLLOW_IF_in_ifStat598); 
			System.out.print("( ");
			match(input,LPAREN,FOLLOW_LPAREN_in_ifStat602); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:75: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:76: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_ifStat605);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_ifStat607);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_ifStat609);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_ifStat612); 
			System.out.print(") ");
			pushFollow(FOLLOW_codeblock_in_ifStat616);
			codeblock();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:150: ( ELSE ( codeblock | ifStat | whileStat ) )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==ELSE) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:151: ELSE ( codeblock | ifStat | whileStat )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStat619); 
					System.out.print("ELSE ");
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:184: ( codeblock | ifStat | whileStat )
					int alt33=3;
					switch ( input.LA(1) ) {
					case LCURL:
					case SEMICOL:
						{
						alt33=1;
						}
						break;
					case IF:
						{
						alt33=2;
						}
						break;
					case WHILE:
						{
						alt33=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}
					switch (alt33) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:185: codeblock
							{
							pushFollow(FOLLOW_codeblock_in_ifStat623);
							codeblock();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:197: ifStat
							{
							pushFollow(FOLLOW_ifStat_in_ifStat627);
							ifStat();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:67:206: whileStat
							{
							pushFollow(FOLLOW_whileStat_in_ifStat631);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:70:1: whileStat : WHILE LPAREN ( identifier compare expression ) RPAREN codeblock ;
	public final void whileStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:70:12: ( WHILE LPAREN ( identifier compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:70:14: WHILE LPAREN ( identifier compare expression ) RPAREN codeblock
			{
			System.out.print("WHILE ");
			match(input,WHILE,FOLLOW_WHILE_in_whileStat657); 
			System.out.print("( ");
			match(input,LPAREN,FOLLOW_LPAREN_in_whileStat661); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:70:83: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:70:84: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_whileStat664);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_whileStat666);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_whileStat668);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat671); 
			System.out.print(") ");
			pushFollow(FOLLOW_codeblock_in_whileStat675);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:1: forStat : FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock ;
	public final void forStat() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:11: ( FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:13: FOR LPAREN ( ( type_name )? identifier ASS expression ) SEMICOL ( identifier compare expression ) SEMICOL ( identifier compare expression ) RPAREN codeblock
			{
			System.out.print("FOR ");
			match(input,FOR,FOLLOW_FOR_in_forStat697); 
			System.out.print("( ");
			match(input,LPAREN,FOLLOW_LPAREN_in_forStat701); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:78: ( ( type_name )? identifier ASS expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:79: ( type_name )? identifier ASS expression
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:79: ( type_name )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( ((LA35_0 >= K_CHAR && LA35_0 <= K_INT)) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:79: type_name
					{
					pushFollow(FOLLOW_type_name_in_forStat704);
					type_name();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_forStat707);
			identifier();
			state._fsp--;

			match(input,ASS,FOLLOW_ASS_in_forStat709); 
			pushFollow(FOLLOW_expression_in_forStat711);
			expression();
			state._fsp--;

			}

			System.out.print("; ");
			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat716); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:151: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:152: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat719);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat721);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat723);
			expression();
			state._fsp--;

			}

			System.out.print("; ");
			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat728); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:217: ( identifier compare expression )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:73:218: identifier compare expression
			{
			pushFollow(FOLLOW_identifier_in_forStat731);
			identifier();
			state._fsp--;

			pushFollow(FOLLOW_compare_in_forStat733);
			compare();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStat735);
			expression();
			state._fsp--;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat738); 
			System.out.print(") ");
			pushFollow(FOLLOW_codeblock_in_forStat742);
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:76:1: type_name : (x= K_INT |x= K_FLOAT |x= K_CHAR ) ;
	public final void type_name() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:76:12: ( (x= K_INT |x= K_FLOAT |x= K_CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:76:14: (x= K_INT |x= K_FLOAT |x= K_CHAR )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:76:14: (x= K_INT |x= K_FLOAT |x= K_CHAR )
			int alt36=3;
			switch ( input.LA(1) ) {
			case K_INT:
				{
				alt36=1;
				}
				break;
			case K_FLOAT:
				{
				alt36=2;
				}
				break;
			case K_CHAR:
				{
				alt36=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:76:15: x= K_INT
					{
					x=(Token)match(input,K_INT,FOLLOW_K_INT_in_type_name760); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:76:25: x= K_FLOAT
					{
					x=(Token)match(input,K_FLOAT,FOLLOW_K_FLOAT_in_type_name766); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:76:37: x= K_CHAR
					{
					x=(Token)match(input,K_CHAR,FOLLOW_K_CHAR_in_type_name772); 
					}
					break;

			}

			System.out.print("type:" + x.getText() + " ");
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:79:1: identifier : (x= WORD |x= CHAR ) ;
	public final void identifier() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:79:13: ( (x= WORD |x= CHAR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:79:15: (x= WORD |x= CHAR )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:79:15: (x= WORD |x= CHAR )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==WORD) ) {
				alt37=1;
			}
			else if ( (LA37_0==CHAR) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:79:16: x= WORD
					{
					x=(Token)match(input,WORD,FOLLOW_WORD_in_identifier796); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:79:25: x= CHAR
					{
					x=(Token)match(input,CHAR,FOLLOW_CHAR_in_identifier802); 
					}
					break;

			}

			System.out.print("id:" + x.getText() + " ");
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:1: expression : multiply_exp ( (x= ADD |x= SUB ) multiply_exp )* ;
	public final void expression() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:14: ( multiply_exp ( (x= ADD |x= SUB ) multiply_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:16: multiply_exp ( (x= ADD |x= SUB ) multiply_exp )*
			{
			pushFollow(FOLLOW_multiply_exp_in_expression819);
			multiply_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:29: ( (x= ADD |x= SUB ) multiply_exp )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==ADD||LA39_0==SUB) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:30: (x= ADD |x= SUB ) multiply_exp
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:30: (x= ADD |x= SUB )
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==ADD) ) {
						alt38=1;
					}
					else if ( (LA38_0==SUB) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:31: x= ADD
							{
							x=(Token)match(input,ADD,FOLLOW_ADD_in_expression825); 
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:82:39: x= SUB
							{
							x=(Token)match(input,SUB,FOLLOW_SUB_in_expression831); 
							}
							break;

					}

					System.out.print("exp:" + x.getText() + " ");
					pushFollow(FOLLOW_multiply_exp_in_expression836);
					multiply_exp();
					state._fsp--;

					}
					break;

				default :
					break loop39;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:1: multiply_exp : atom_exp ( (x= MULT |x= DIV ) atom_exp )* ;
	public final void multiply_exp() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:15: ( atom_exp ( (x= MULT |x= DIV ) atom_exp )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:17: atom_exp ( (x= MULT |x= DIV ) atom_exp )*
			{
			pushFollow(FOLLOW_atom_exp_in_multiply_exp860);
			atom_exp();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:26: ( (x= MULT |x= DIV ) atom_exp )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==DIV||LA41_0==MULT) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:27: (x= MULT |x= DIV ) atom_exp
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:27: (x= MULT |x= DIV )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==MULT) ) {
						alt40=1;
					}
					else if ( (LA40_0==DIV) ) {
						alt40=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:28: x= MULT
							{
							x=(Token)match(input,MULT,FOLLOW_MULT_in_multiply_exp866); 
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:85:35: x= DIV
							{
							x=(Token)match(input,DIV,FOLLOW_DIV_in_multiply_exp870); 
							}
							break;

					}

					System.out.print("mexp:" + x.getText() + " ");
					pushFollow(FOLLOW_atom_exp_in_multiply_exp875);
					atom_exp();
					state._fsp--;

					}
					break;

				default :
					break loop41;
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:88:1: atom_exp : (x= INT |x= FLOAT |x= CHAR_QUOTE | ( MULT | AMP )? identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN );
	public final void atom_exp() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:88:12: (x= INT |x= FLOAT |x= CHAR_QUOTE | ( MULT | AMP )? identifier ( LBRACK INT RBRACK )? | LPAREN expression RPAREN )
			int alt44=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt44=1;
				}
				break;
			case FLOAT:
				{
				alt44=2;
				}
				break;
			case CHAR_QUOTE:
				{
				alt44=3;
				}
				break;
			case AMP:
			case CHAR:
			case MULT:
			case WORD:
				{
				alt44=4;
				}
				break;
			case LPAREN:
				{
				alt44=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:88:14: x= INT
					{
					x=(Token)match(input,INT,FOLLOW_INT_in_atom_exp897); 
					System.out.print("int=" + x.getText() + " ");
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:89:7: x= FLOAT
					{
					x=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom_exp909); 
					System.out.print("float=" + x.getText() + " ");
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:90:7: x= CHAR_QUOTE
					{
					x=(Token)match(input,CHAR_QUOTE,FOLLOW_CHAR_QUOTE_in_atom_exp921); 
					System.out.print("char_quote=" + x.getText() + " ");
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:91:7: ( MULT | AMP )? identifier ( LBRACK INT RBRACK )?
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:91:7: ( MULT | AMP )?
					int alt42=3;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==MULT) ) {
						alt42=1;
					}
					else if ( (LA42_0==AMP) ) {
						alt42=2;
					}
					switch (alt42) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:91:8: MULT
							{
							match(input,MULT,FOLLOW_MULT_in_atom_exp932); 
							System.out.print("* ");
							}
							break;
						case 2 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:91:41: AMP
							{
							match(input,AMP,FOLLOW_AMP_in_atom_exp938); 
							System.out.print("& ");
							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_atom_exp944);
					identifier();
					state._fsp--;

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:91:84: ( LBRACK INT RBRACK )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==LBRACK) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:91:85: LBRACK INT RBRACK
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_atom_exp947); 
							match(input,INT,FOLLOW_INT_in_atom_exp949); 
							match(input,RBRACK,FOLLOW_RBRACK_in_atom_exp951); 
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:92:10: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom_exp965); 
					System.out.print("( ");
					pushFollow(FOLLOW_expression_in_atom_exp969);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom_exp971); 
					System.out.print(") ");
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:95:1: anything : x= ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS ) ;
	public final void anything() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:95:11: (x= ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:95:13: x= ( INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS )
			{
			x=input.LT(1);
			if ( (input.LA(1) >= ADD && input.LA(1) <= AMP)||(input.LA(1) >= ASS && input.LA(1) <= CHAR)||input.LA(1)==DIV||(input.LA(1) >= FLOAT && input.LA(1) <= FOR)||(input.LA(1) >= HASHTAG && input.LA(1) <= IF)||input.LA(1)==INT||input.LA(1)==MULT||input.LA(1)==PERC||(input.LA(1) >= SPACE && input.LA(1) <= SUB)||(input.LA(1) >= WHILE && input.LA(1) <= WS) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			System.out.print("#A_" + x.getText() + " ");
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
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:1: compare : (x= EQ |x= NEQ |x= LT |x= GT |x= LE |x= GE | ( ( ADD | SUB | MULT | DIV )? x= ASS ) ) ;
	public final void compare() throws RecognitionException {
		Token x=null;

		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:11: ( (x= EQ |x= NEQ |x= LT |x= GT |x= LE |x= GE | ( ( ADD | SUB | MULT | DIV )? x= ASS ) ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:13: (x= EQ |x= NEQ |x= LT |x= GT |x= LE |x= GE | ( ( ADD | SUB | MULT | DIV )? x= ASS ) )
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:13: (x= EQ |x= NEQ |x= LT |x= GT |x= LE |x= GE | ( ( ADD | SUB | MULT | DIV )? x= ASS ) )
			int alt46=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt46=1;
				}
				break;
			case NEQ:
				{
				alt46=2;
				}
				break;
			case LT:
				{
				alt46=3;
				}
				break;
			case GT:
				{
				alt46=4;
				}
				break;
			case LE:
				{
				alt46=5;
				}
				break;
			case GE:
				{
				alt46=6;
				}
				break;
			case ADD:
			case ASS:
			case DIV:
			case MULT:
			case SUB:
				{
				alt46=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:14: x= EQ
					{
					x=(Token)match(input,EQ,FOLLOW_EQ_in_compare1084); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:21: x= NEQ
					{
					x=(Token)match(input,NEQ,FOLLOW_NEQ_in_compare1090); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:29: x= LT
					{
					x=(Token)match(input,LT,FOLLOW_LT_in_compare1096); 
					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:36: x= GT
					{
					x=(Token)match(input,GT,FOLLOW_GT_in_compare1102); 
					}
					break;
				case 5 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:43: x= LE
					{
					x=(Token)match(input,LE,FOLLOW_LE_in_compare1108); 
					}
					break;
				case 6 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:50: x= GE
					{
					x=(Token)match(input,GE,FOLLOW_GE_in_compare1114); 
					}
					break;
				case 7 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:57: ( ( ADD | SUB | MULT | DIV )? x= ASS )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:57: ( ( ADD | SUB | MULT | DIV )? x= ASS )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:58: ( ADD | SUB | MULT | DIV )? x= ASS
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:98:58: ( ADD | SUB | MULT | DIV )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==ADD||LA45_0==DIV||LA45_0==MULT||LA45_0==SUB) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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

					x=(Token)match(input,ASS,FOLLOW_ASS_in_compare1138); 
					}

					}
					break;

			}

			System.out.print("#C_" + x.getText() + " ");
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



	// $ANTLR start "include"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:101:1: include : INCLUDE ;
	public final void include() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:101:11: ( INCLUDE )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:101:13: INCLUDE
			{
			match(input,INCLUDE,FOLLOW_INCLUDE_in_include1158); 
			System.out.println("INCLUDE");
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
	// $ANTLR end "include"

	// Delegated rules



	public static final BitSet FOLLOW_include_in_start67 = new BitSet(new long[]{0x002800083A000100L});
	public static final BitSet FOLLOW_global_in_start70 = new BitSet(new long[]{0x0028000838000100L});
	public static final BitSet FOLLOW_EOF_in_start73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_global92 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_global96 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_function_in_global98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_global107 = new BitSet(new long[]{0x0020000800000100L});
	public static final BitSet FOLLOW_pointer_in_global112 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_global128 = new BitSet(new long[]{0x0000480A40004490L});
	public static final BitSet FOLLOW_assignment_in_global133 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_COMMA_in_global136 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_global140 = new BitSet(new long[]{0x0000480800004490L});
	public static final BitSet FOLLOW_assignment_in_global142 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_vector_in_global147 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_global150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_global170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_assignment208 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_assignment212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_vector237 = new BitSet(new long[]{0x0000008004000000L});
	public static final BitSet FOLLOW_INT_in_vector242 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_vector248 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_vector253 = new BitSet(new long[]{0x0020000A84080320L});
	public static final BitSet FOLLOW_LCURL_in_vector261 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_vector263 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_COMMA_in_vector266 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_vector270 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_RCURL_in_vector274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_vector281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_pointer304 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_pointer308 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASS_in_pointer311 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_pointer315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_function340 = new BitSet(new long[]{0x0000040038000000L});
	public static final BitSet FOLLOW_type_name_in_function345 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_function347 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_function350 = new BitSet(new long[]{0x0000000038000000L});
	public static final BitSet FOLLOW_type_name_in_function354 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_function356 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_function362 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_function366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_call_function382 = new BitSet(new long[]{0x0020040800010100L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function389 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function391 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function394 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_MULT_in_call_function399 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function402 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_COMMA_in_call_function406 = new BitSet(new long[]{0x0020000800010100L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function410 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_anything_in_call_function412 = new BitSet(new long[]{0x00706048059941B0L});
	public static final BitSet FOLLOW_D_QUOTE_in_call_function415 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_MULT_in_call_function420 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_call_function423 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_RPAREN_in_call_function430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_codeblock455 = new BitSet(new long[]{0x0030030839100100L});
	public static final BitSet FOLLOW_statement_in_codeblock458 = new BitSet(new long[]{0x0030030839100100L});
	public static final BitSet FOLLOW_RCURL_in_codeblock462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOL_in_codeblock476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_name_in_statement494 = new BitSet(new long[]{0x0020000800000100L});
	public static final BitSet FOLLOW_identifier_in_statement498 = new BitSet(new long[]{0x0000480A40004490L});
	public static final BitSet FOLLOW_assignment_in_statement501 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_COMMA_in_statement504 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_statement508 = new BitSet(new long[]{0x0000480800004490L});
	public static final BitSet FOLLOW_assignment_in_statement510 = new BitSet(new long[]{0x0000080000000400L});
	public static final BitSet FOLLOW_call_function_in_statement516 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_vector_in_statement520 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_pointer_in_statement525 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_statement538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_statement546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_statement554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement567 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_atom_exp_in_statement569 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_statement571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStat598 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifStat602 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_ifStat605 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_ifStat607 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_ifStat609 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifStat612 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat616 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifStat619 = new BitSet(new long[]{0x0010080081000000L});
	public static final BitSet FOLLOW_codeblock_in_ifStat623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStat627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_ifStat631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStat657 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileStat661 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_whileStat664 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_whileStat666 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_whileStat668 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat671 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_whileStat675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStat697 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_forStat701 = new BitSet(new long[]{0x0020000038000100L});
	public static final BitSet FOLLOW_type_name_in_forStat704 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat707 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASS_in_forStat709 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_forStat711 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat716 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat719 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat721 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_forStat723 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat728 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_forStat731 = new BitSet(new long[]{0x0000401D00644090L});
	public static final BitSet FOLLOW_compare_in_forStat733 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_forStat735 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_forStat738 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_codeblock_in_forStat742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_type_name760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_type_name766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CHAR_in_type_name772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_identifier796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_identifier802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_exp_in_expression819 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_ADD_in_expression825 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_SUB_in_expression831 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_multiply_exp_in_expression836 = new BitSet(new long[]{0x0000400000000012L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp860 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_MULT_in_multiply_exp866 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_DIV_in_multiply_exp870 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_atom_exp_in_multiply_exp875 = new BitSet(new long[]{0x0000000800004002L});
	public static final BitSet FOLLOW_INT_in_atom_exp897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom_exp909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_QUOTE_in_atom_exp921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_atom_exp932 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_AMP_in_atom_exp938 = new BitSet(new long[]{0x0020000000000100L});
	public static final BitSet FOLLOW_identifier_in_atom_exp944 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom_exp947 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_INT_in_atom_exp949 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom_exp951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom_exp965 = new BitSet(new long[]{0x0020000A04080320L});
	public static final BitSet FOLLOW_expression_in_atom_exp969 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom_exp971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_anything996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_compare1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_compare1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_compare1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_compare1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_compare1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_compare1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASS_in_compare1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include1158 = new BitSet(new long[]{0x0000000000000002L});
}
