// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g 2020-12-08 15:08:38

	// package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPS_debugLexer extends Lexer {
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

		int nErrori = 0;
		
		void printMsg () {
			nErrori++;
			System.out.println("-----------------------> ERRORE! Numero errori Trovati: \t" + nErrori);
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public C_MIPS_debugLexer() {} 
	public C_MIPS_debugLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public C_MIPS_debugLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g"; }

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:106:9: ( '#include <stdio.h>' | '#include <stdlib.h>' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='#') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='i') ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2=='n') ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3=='c') ) {
							int LA1_4 = input.LA(5);
							if ( (LA1_4=='l') ) {
								int LA1_5 = input.LA(6);
								if ( (LA1_5=='u') ) {
									int LA1_6 = input.LA(7);
									if ( (LA1_6=='d') ) {
										int LA1_7 = input.LA(8);
										if ( (LA1_7=='e') ) {
											int LA1_8 = input.LA(9);
											if ( (LA1_8==' ') ) {
												int LA1_9 = input.LA(10);
												if ( (LA1_9=='<') ) {
													int LA1_10 = input.LA(11);
													if ( (LA1_10=='s') ) {
														int LA1_11 = input.LA(12);
														if ( (LA1_11=='t') ) {
															int LA1_12 = input.LA(13);
															if ( (LA1_12=='d') ) {
																int LA1_13 = input.LA(14);
																if ( (LA1_13=='i') ) {
																	alt1=1;
																}
																else if ( (LA1_13=='l') ) {
																	alt1=2;
																}

																else {
																	int nvaeMark = input.mark();
																	try {
																		for (int nvaeConsume = 0; nvaeConsume < 14 - 1; nvaeConsume++) {
																			input.consume();
																		}
																		NoViableAltException nvae =
																			new NoViableAltException("", 1, 13, input);
																		throw nvae;
																	} finally {
																		input.rewind(nvaeMark);
																	}
																}

															}

															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++) {
																		input.consume();
																	}
																	NoViableAltException nvae =
																		new NoViableAltException("", 1, 12, input);
																	throw nvae;
																} finally {
																	input.rewind(nvaeMark);
																}
															}

														}

														else {
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++) {
																	input.consume();
																}
																NoViableAltException nvae =
																	new NoViableAltException("", 1, 11, input);
																throw nvae;
															} finally {
																input.rewind(nvaeMark);
															}
														}

													}

													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 1, 10, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 1, 9, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 1, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 1, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 1, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:106:11: '#include <stdio.h>'
					{
					match("#include <stdio.h>"); 

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:106:34: '#include <stdlib.h>'
					{
					match("#include <stdlib.h>"); 

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
	// $ANTLR end "INCLUDE"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:108:16: ( '0' .. '9' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:109:24: ( '1' .. '9' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:110:17: ( '_' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:110:19: '_'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:111:16: ( ' ' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:111:18: ' '
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:112:14: ( '\\t' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:112:16: '\\t'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:113:17: ( '\\n' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:113:19: '\\n'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:114:17: ( '\\r' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:114:19: '\\r'
			{
			match('\r'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASHR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:116:5: ( ( SPACE | TAB | NEWL | SLASHR ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:116:7: ( SPACE | TAB | NEWL | SLASHR )
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

	// $ANTLR start "K_INT"
	public final void mK_INT() throws RecognitionException {
		try {
			int _type = K_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:123:8: ( 'int' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:123:10: 'int'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:124:10: ( 'float' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:124:12: 'float'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:125:9: ( 'char' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:125:11: 'char'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:127:8: ( 'void' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:127:10: 'void'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:128:10: ( 'while' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:128:12: 'while'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:129:7: ( 'for' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:129:9: 'for'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:130:7: ( 'if' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:130:9: 'if'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:131:8: ( 'else' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:131:10: 'else'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:132:10: ( 'return' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:132:12: 'return'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:134:7: ( '==' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:134:9: '=='
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:135:7: ( '!=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:135:9: '!='
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:136:7: ( '>' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:136:9: '>'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:137:7: ( '<' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:137:9: '<'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:138:6: ( '>=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:138:8: '>='
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:139:7: ( '<=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:139:9: '<='
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

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:141:7: ( '+' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:141:9: '+'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:142:7: ( '-' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:142:9: '-'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:143:8: ( '*' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:143:10: '*'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:144:7: ( '/' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:144:9: '/'
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

	// $ANTLR start "ASS"
	public final void mASS() throws RecognitionException {
		try {
			int _type = ASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:145:7: ( '=' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:145:9: '='
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

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:146:12: ( '(' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:146:14: '('
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:147:10: ( ')' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:147:12: ')'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:148:10: ( '[' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:148:12: '['
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:149:11: ( ']' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:149:13: ']'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:150:9: ( '{' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:150:11: '{'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:151:9: ( '}' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:151:11: '}'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:152:10: ( ';' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:152:12: ';'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:153:7: ( '.' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:153:9: '.'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:154:9: ( '->' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:154:11: '->'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:155:10: ( '\\'' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:155:12: '\\''
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:156:10: ( '\"' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:156:12: '\"'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:157:8: ( ',' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:157:10: ','
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:158:11: ( '&' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:158:13: '&'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:159:7: ( '%' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:159:9: '%'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:160:10: ( '#' )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:160:12: '#'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:162:6: ( DIGIT_NO_ZERO ( DIGIT )* | '0' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='0') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:162:8: DIGIT_NO_ZERO ( DIGIT )*
					{
					mDIGIT_NO_ZERO(); 

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:162:22: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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
							break loop2;
						}
					}

					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:162:31: '0'
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:163:8: ( ( DIGIT )+ DOT ( DIGIT )+ )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:163:10: ( DIGIT )+ DOT ( DIGIT )+
			{
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:163:10: ( DIGIT )+
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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

			mDOT(); 

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:163:21: ( DIGIT )+
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:164:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "CHAR_QUOTE"
	public final void mCHAR_QUOTE() throws RecognitionException {
		try {
			int _type = CHAR_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:165:12: ( S_QUOTE ( 'a' .. 'z' | 'A' .. 'Z' ) S_QUOTE )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:165:14: S_QUOTE ( 'a' .. 'z' | 'A' .. 'Z' ) S_QUOTE
			{
			mS_QUOTE(); 

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:167:8: ( CHAR ( 'a' .. 'z' | 'A' .. 'Z' | UNDRSCR | DIGIT )+ )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:167:10: CHAR ( 'a' .. 'z' | 'A' .. 'Z' | UNDRSCR | DIGIT )+
			{
			mCHAR(); 

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:167:15: ( 'a' .. 'z' | 'A' .. 'Z' | UNDRSCR | DIGIT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:169:10: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:169:12: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:169:17: (~ ( '\\n' | '\\r' ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:
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

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:169:31: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:169:31: '\\r'
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
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:170:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:170:14: ( options {greedy=false; } : . )*
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
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:170:41: .
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
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:173:13: ( . )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:173:15: .
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
		// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:8: ( INCLUDE | WS | K_INT | K_FLOAT | K_CHAR | VOID | WHILE | FOR | IF | ELSE | RETURN | EQ | NEQ | GT | LT | GE | LE | ADD | SUB | MULT | DIV | ASS | LPAREN | RPAREN | LBRACK | RBRACK | LCURL | RCURL | SEMICOL | DOT | ARROW | S_QUOTE | D_QUOTE | COMMA | AMP | PERC | HASHTAG | INT | FLOAT | CHAR | CHAR_QUOTE | WORD | COMMENT | TOKEN_ERROR )
		int alt11=44;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:10: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 2 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:18: WS
				{
				mWS(); 

				}
				break;
			case 3 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:21: K_INT
				{
				mK_INT(); 

				}
				break;
			case 4 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:27: K_FLOAT
				{
				mK_FLOAT(); 

				}
				break;
			case 5 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:35: K_CHAR
				{
				mK_CHAR(); 

				}
				break;
			case 6 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:42: VOID
				{
				mVOID(); 

				}
				break;
			case 7 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:47: WHILE
				{
				mWHILE(); 

				}
				break;
			case 8 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:53: FOR
				{
				mFOR(); 

				}
				break;
			case 9 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:57: IF
				{
				mIF(); 

				}
				break;
			case 10 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:60: ELSE
				{
				mELSE(); 

				}
				break;
			case 11 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:65: RETURN
				{
				mRETURN(); 

				}
				break;
			case 12 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:72: EQ
				{
				mEQ(); 

				}
				break;
			case 13 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:75: NEQ
				{
				mNEQ(); 

				}
				break;
			case 14 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:79: GT
				{
				mGT(); 

				}
				break;
			case 15 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:82: LT
				{
				mLT(); 

				}
				break;
			case 16 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:85: GE
				{
				mGE(); 

				}
				break;
			case 17 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:88: LE
				{
				mLE(); 

				}
				break;
			case 18 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:91: ADD
				{
				mADD(); 

				}
				break;
			case 19 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:95: SUB
				{
				mSUB(); 

				}
				break;
			case 20 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:99: MULT
				{
				mMULT(); 

				}
				break;
			case 21 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:104: DIV
				{
				mDIV(); 

				}
				break;
			case 22 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:108: ASS
				{
				mASS(); 

				}
				break;
			case 23 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:112: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 24 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:119: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 25 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:126: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 26 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:133: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 27 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:140: LCURL
				{
				mLCURL(); 

				}
				break;
			case 28 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:146: RCURL
				{
				mRCURL(); 

				}
				break;
			case 29 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:152: SEMICOL
				{
				mSEMICOL(); 

				}
				break;
			case 30 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:160: DOT
				{
				mDOT(); 

				}
				break;
			case 31 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:164: ARROW
				{
				mARROW(); 

				}
				break;
			case 32 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:170: S_QUOTE
				{
				mS_QUOTE(); 

				}
				break;
			case 33 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:178: D_QUOTE
				{
				mD_QUOTE(); 

				}
				break;
			case 34 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:186: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 35 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:192: AMP
				{
				mAMP(); 

				}
				break;
			case 36 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:196: PERC
				{
				mPERC(); 

				}
				break;
			case 37 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:201: HASHTAG
				{
				mHASHTAG(); 

				}
				break;
			case 38 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:209: INT
				{
				mINT(); 

				}
				break;
			case 39 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:213: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 40 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:219: CHAR
				{
				mCHAR(); 

				}
				break;
			case 41 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:224: CHAR_QUOTE
				{
				mCHAR_QUOTE(); 

				}
				break;
			case 42 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:235: WORD
				{
				mWORD(); 

				}
				break;
			case 43 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:240: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 44 :
				// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS_debug.g:1:248: TOKEN_ERROR
				{
				mTOKEN_ERROR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\1\uffff\1\44\1\uffff\7\50\1\62\1\42\1\65\1\67\1\uffff\1\72\1\uffff\1"+
		"\75\10\uffff\1\106\4\uffff\2\114\1\50\4\uffff\1\51\1\120\2\uffff\7\51"+
		"\34\uffff\1\114\1\uffff\1\130\1\uffff\1\51\1\132\5\51\1\uffff\1\51\1\uffff"+
		"\1\141\1\142\1\51\1\144\1\51\1\146\2\uffff\1\147\1\uffff\1\51\2\uffff"+
		"\1\151\1\uffff";
	static final String DFA11_eofS =
		"\152\uffff";
	static final String DFA11_minS =
		"\1\0\1\151\1\uffff\7\60\4\75\1\uffff\1\76\1\uffff\1\52\10\uffff\1\101"+
		"\4\uffff\2\56\1\60\4\uffff\1\164\1\60\2\uffff\1\157\1\162\1\141\2\151"+
		"\1\163\1\164\34\uffff\1\56\1\uffff\1\60\1\uffff\1\141\1\60\1\162\1\144"+
		"\1\154\1\145\1\165\1\uffff\1\164\1\uffff\2\60\1\145\1\60\1\162\1\60\2"+
		"\uffff\1\60\1\uffff\1\156\2\uffff\1\60\1\uffff";
	static final String DFA11_maxS =
		"\1\uffff\1\151\1\uffff\7\172\4\75\1\uffff\1\76\1\uffff\1\57\10\uffff\1"+
		"\172\4\uffff\2\71\1\172\4\uffff\1\164\1\172\2\uffff\1\157\1\162\1\141"+
		"\2\151\1\163\1\164\34\uffff\1\71\1\uffff\1\172\1\uffff\1\141\1\172\1\162"+
		"\1\144\1\154\1\145\1\165\1\uffff\1\164\1\uffff\2\172\1\145\1\172\1\162"+
		"\1\172\2\uffff\1\172\1\uffff\1\156\2\uffff\1\172\1\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\13\uffff\1\22\1\uffff\1\24\1\uffff\1\27\1\30\1\31\1\32\1"+
		"\33\1\34\1\35\1\36\1\uffff\1\41\1\42\1\43\1\44\3\uffff\1\54\1\1\1\45\1"+
		"\2\2\uffff\1\50\1\52\7\uffff\1\14\1\26\1\15\1\20\1\16\1\21\1\17\1\22\1"+
		"\37\1\23\1\24\1\53\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\40\1"+
		"\51\1\41\1\42\1\43\1\44\1\46\1\uffff\1\47\1\uffff\1\11\7\uffff\1\3\1\uffff"+
		"\1\10\6\uffff\1\5\1\6\1\uffff\1\12\1\uffff\1\4\1\7\1\uffff\1\13";
	static final String DFA11_specialS =
		"\1\0\151\uffff}>";
	static final String[] DFA11_transitionS = {
			"\11\42\2\2\2\42\1\2\22\42\1\2\1\13\1\33\1\1\1\42\1\36\1\35\1\32\1\22"+
			"\1\23\1\20\1\16\1\34\1\17\1\31\1\21\1\40\11\37\1\42\1\30\1\15\1\12\1"+
			"\14\2\42\32\41\1\24\1\42\1\25\3\42\2\41\1\5\1\41\1\10\1\4\2\41\1\3\10"+
			"\41\1\11\3\41\1\6\1\7\3\41\1\26\1\42\1\27\uff82\42",
			"\1\43",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\5\51\1\47\7\51\1\46\14\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\13\51\1\52\2\51\1\53\13\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\7\51\1\54\22\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\16\51\1\55\13\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\7\51\1\56\22\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\13\51\1\57\16\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\4\51\1\60\25\51",
			"\1\61",
			"\1\63",
			"\1\64",
			"\1\66",
			"",
			"\1\71",
			"",
			"\1\74\4\uffff\1\74",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\32\107\6\uffff\32\107",
			"",
			"",
			"",
			"",
			"\1\116\1\uffff\12\115",
			"\1\116\1\uffff\12\116",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"",
			"",
			"",
			"\1\117",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
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
			"\1\116\1\uffff\12\115",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\1\131",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"\1\140",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\143",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\145",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\1\150",
			"",
			"",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
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
			return "1:1: Tokens : ( INCLUDE | WS | K_INT | K_FLOAT | K_CHAR | VOID | WHILE | FOR | IF | ELSE | RETURN | EQ | NEQ | GT | LT | GE | LE | ADD | SUB | MULT | DIV | ASS | LPAREN | RPAREN | LBRACK | RBRACK | LCURL | RCURL | SEMICOL | DOT | ARROW | S_QUOTE | D_QUOTE | COMMA | AMP | PERC | HASHTAG | INT | FLOAT | CHAR | CHAR_QUOTE | WORD | COMMENT | TOKEN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_0 = input.LA(1);
						s = -1;
						if ( (LA11_0=='#') ) {s = 1;}
						else if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 2;}
						else if ( (LA11_0=='i') ) {s = 3;}
						else if ( (LA11_0=='f') ) {s = 4;}
						else if ( (LA11_0=='c') ) {s = 5;}
						else if ( (LA11_0=='v') ) {s = 6;}
						else if ( (LA11_0=='w') ) {s = 7;}
						else if ( (LA11_0=='e') ) {s = 8;}
						else if ( (LA11_0=='r') ) {s = 9;}
						else if ( (LA11_0=='=') ) {s = 10;}
						else if ( (LA11_0=='!') ) {s = 11;}
						else if ( (LA11_0=='>') ) {s = 12;}
						else if ( (LA11_0=='<') ) {s = 13;}
						else if ( (LA11_0=='+') ) {s = 14;}
						else if ( (LA11_0=='-') ) {s = 15;}
						else if ( (LA11_0=='*') ) {s = 16;}
						else if ( (LA11_0=='/') ) {s = 17;}
						else if ( (LA11_0=='(') ) {s = 18;}
						else if ( (LA11_0==')') ) {s = 19;}
						else if ( (LA11_0=='[') ) {s = 20;}
						else if ( (LA11_0==']') ) {s = 21;}
						else if ( (LA11_0=='{') ) {s = 22;}
						else if ( (LA11_0=='}') ) {s = 23;}
						else if ( (LA11_0==';') ) {s = 24;}
						else if ( (LA11_0=='.') ) {s = 25;}
						else if ( (LA11_0=='\'') ) {s = 26;}
						else if ( (LA11_0=='\"') ) {s = 27;}
						else if ( (LA11_0==',') ) {s = 28;}
						else if ( (LA11_0=='&') ) {s = 29;}
						else if ( (LA11_0=='%') ) {s = 30;}
						else if ( ((LA11_0 >= '1' && LA11_0 <= '9')) ) {s = 31;}
						else if ( (LA11_0=='0') ) {s = 32;}
						else if ( ((LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'b')||LA11_0=='d'||(LA11_0 >= 'g' && LA11_0 <= 'h')||(LA11_0 >= 'j' && LA11_0 <= 'q')||(LA11_0 >= 's' && LA11_0 <= 'u')||(LA11_0 >= 'x' && LA11_0 <= 'z')) ) {s = 33;}
						else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\b')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\u001F')||LA11_0=='$'||LA11_0==':'||(LA11_0 >= '?' && LA11_0 <= '@')||LA11_0=='\\'||(LA11_0 >= '^' && LA11_0 <= '`')||LA11_0=='|'||(LA11_0 >= '~' && LA11_0 <= '\uFFFF')) ) {s = 34;}
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
