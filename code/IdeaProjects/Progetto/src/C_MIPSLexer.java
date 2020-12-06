// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g 2020-12-06 22:45:15

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class C_MIPSLexer extends Lexer {
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
	public static final int TOKEN_ERROR=43;
	public static final int UNDRSCR=44;
	public static final int VOID=45;
	public static final int WHILE=46;
	public static final int WORD=47;
	public static final int WS=48;

		int nErrori = 0;
		
		void printMsg () {
			nErrori++;
			System.out.println("Numero errori Trovati: \t" + nErrori);
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public C_MIPSLexer() {} 
	public C_MIPSLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public C_MIPSLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g"; }

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:66:9: ( '#include <stdio.h>' | '#include <stdlib.h>' )
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
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:66:11: '#include <stdio.h>'
					{
					match("#include <stdio.h>"); 

					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:66:34: '#include <stdlib.h>'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:68:16: ( '0' .. '9' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:69:24: ( '1' .. '9' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:17: ( '_' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:70:19: '_'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:16: ( ' ' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:71:18: ' '
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:72:14: ( '\\t' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:72:16: '\\t'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:17: ( '\\n' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:73:19: '\\n'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:17: ( '\\r' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:74:19: '\\r'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:76:4: ( ( SPACE | TAB | NEWL | SLASHR ) )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:76:6: ( SPACE | TAB | NEWL | SLASHR )
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:9: ( 'int' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:82:11: 'int'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:11: ( 'float' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:83:13: 'float'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:10: ( 'char' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:84:12: 'char'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:9: ( 'void' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:86:11: 'void'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:87:11: ( 'while' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:87:13: 'while'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:8: ( 'for' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:88:10: 'for'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:7: ( 'if' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:89:9: 'if'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:9: ( 'else' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:90:11: 'else'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:11: ( 'return' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:91:13: 'return'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:92:7: ( '==' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:92:9: '=='
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:7: ( '!=' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:93:9: '!='
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:94:7: ( '>' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:94:9: '>'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:7: ( '<' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:95:9: '<'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:6: ( '>=' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:96:8: '>='
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:97:7: ( '<=' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:97:9: '<='
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

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:9: ( '+' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:98:11: '+'
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
	// $ANTLR end "PLUS"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:8: ( '-' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:99:10: '-'
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
	// $ANTLR end "MIN"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:9: ( '*' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:100:11: '*'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:101:8: ( '/' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:101:10: '/'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:102:8: ( '=' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:102:10: '='
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:13: ( '(' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:103:15: '('
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:104:11: ( ')' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:104:13: ')'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:105:11: ( '[' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:105:13: '['
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:106:12: ( ']' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:106:14: ']'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:107:10: ( '{' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:107:12: '{'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:108:10: ( '}' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:108:12: '}'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:109:11: ( ';' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:109:13: ';'
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

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:110:10: ( '->' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:110:12: '->'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:111:11: ( '\\'' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:111:13: '\\''
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:112:11: ( '\"' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:112:13: '\"'
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:113:9: ( ',' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:113:11: ','
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:114:12: ( '&' )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:114:14: '&'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:7: ( DIGIT_NO_ZERO ( DIGIT )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:9: DIGIT_NO_ZERO ( DIGIT )*
			{
			mDIGIT_NO_ZERO(); 

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:116:23: ( DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:117:9: ( ( DIGIT )+ COMMA ( DIGIT )+ )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:117:11: ( DIGIT )+ COMMA ( DIGIT )+
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:117:11: ( DIGIT )+
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
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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

			mCOMMA(); 

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:117:24: ( DIGIT )+
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
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			int _type = WORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:119:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | UNDRSCR | DIGIT )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:119:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | UNDRSCR | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:119:33: ( 'a' .. 'z' | 'A' .. 'Z' | UNDRSCR | DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:
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
					break loop5;
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

	// $ANTLR start "TOKEN_ERROR"
	public final void mTOKEN_ERROR() throws RecognitionException {
		try {
			int _type = TOKEN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:123:14: ( . )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:123:16: .
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
		// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:8: ( INCLUDE | WS | K_INT | K_FLOAT | K_CHAR | VOID | WHILE | FOR | IF | ELSE | RETURN | EQ | NEQ | GT | LT | GE | LE | PLUS | MIN | MULT | DIV | ASS | LPAREN | RPAREN | LBRACK | RBRACK | LCURL | RCURL | SEMICOL | ARROW | S_QUOTE | D_QUOTE | COMMA | AMP | INT | FLOAT | WORD | TOKEN_ERROR )
		int alt6=38;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:10: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 2 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:18: WS
				{
				mWS(); 

				}
				break;
			case 3 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:21: K_INT
				{
				mK_INT(); 

				}
				break;
			case 4 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:27: K_FLOAT
				{
				mK_FLOAT(); 

				}
				break;
			case 5 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:35: K_CHAR
				{
				mK_CHAR(); 

				}
				break;
			case 6 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:42: VOID
				{
				mVOID(); 

				}
				break;
			case 7 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:47: WHILE
				{
				mWHILE(); 

				}
				break;
			case 8 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:53: FOR
				{
				mFOR(); 

				}
				break;
			case 9 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:57: IF
				{
				mIF(); 

				}
				break;
			case 10 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:60: ELSE
				{
				mELSE(); 

				}
				break;
			case 11 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:65: RETURN
				{
				mRETURN(); 

				}
				break;
			case 12 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:72: EQ
				{
				mEQ(); 

				}
				break;
			case 13 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:75: NEQ
				{
				mNEQ(); 

				}
				break;
			case 14 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:79: GT
				{
				mGT(); 

				}
				break;
			case 15 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:82: LT
				{
				mLT(); 

				}
				break;
			case 16 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:85: GE
				{
				mGE(); 

				}
				break;
			case 17 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:88: LE
				{
				mLE(); 

				}
				break;
			case 18 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:91: PLUS
				{
				mPLUS(); 

				}
				break;
			case 19 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:96: MIN
				{
				mMIN(); 

				}
				break;
			case 20 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:100: MULT
				{
				mMULT(); 

				}
				break;
			case 21 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:105: DIV
				{
				mDIV(); 

				}
				break;
			case 22 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:109: ASS
				{
				mASS(); 

				}
				break;
			case 23 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:113: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 24 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:120: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 25 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:127: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 26 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:134: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 27 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:141: LCURL
				{
				mLCURL(); 

				}
				break;
			case 28 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:147: RCURL
				{
				mRCURL(); 

				}
				break;
			case 29 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:153: SEMICOL
				{
				mSEMICOL(); 

				}
				break;
			case 30 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:161: ARROW
				{
				mARROW(); 

				}
				break;
			case 31 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:167: S_QUOTE
				{
				mS_QUOTE(); 

				}
				break;
			case 32 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:175: D_QUOTE
				{
				mD_QUOTE(); 

				}
				break;
			case 33 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:183: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 34 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:189: AMP
				{
				mAMP(); 

				}
				break;
			case 35 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:193: INT
				{
				mINT(); 

				}
				break;
			case 36 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:197: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 37 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:203: WORD
				{
				mWORD(); 

				}
				break;
			case 38 :
				// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\C_MIPS.g:1:208: TOKEN_ERROR
				{
				mTOKEN_ERROR(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\1\40\1\uffff\7\45\1\56\1\40\1\61\1\63\1\uffff\1\66\15\uffff\1"+
		"\104\1\40\4\uffff\1\45\1\110\1\uffff\7\45\30\uffff\1\104\1\uffff\1\120"+
		"\1\uffff\1\45\1\122\5\45\1\uffff\1\45\1\uffff\1\131\1\132\1\45\1\134\1"+
		"\45\1\136\2\uffff\1\137\1\uffff\1\45\2\uffff\1\141\1\uffff";
	static final String DFA6_eofS =
		"\142\uffff";
	static final String DFA6_minS =
		"\1\0\1\151\1\uffff\1\146\1\154\1\150\1\157\1\150\1\154\1\145\4\75\1\uffff"+
		"\1\76\15\uffff\2\54\4\uffff\1\164\1\60\1\uffff\1\157\1\162\1\141\2\151"+
		"\1\163\1\164\30\uffff\1\54\1\uffff\1\60\1\uffff\1\141\1\60\1\162\1\144"+
		"\1\154\1\145\1\165\1\uffff\1\164\1\uffff\2\60\1\145\1\60\1\162\1\60\2"+
		"\uffff\1\60\1\uffff\1\156\2\uffff\1\60\1\uffff";
	static final String DFA6_maxS =
		"\1\uffff\1\151\1\uffff\1\156\1\157\1\150\1\157\1\150\1\154\1\145\4\75"+
		"\1\uffff\1\76\15\uffff\2\71\4\uffff\1\164\1\172\1\uffff\1\157\1\162\1"+
		"\141\2\151\1\163\1\164\30\uffff\1\71\1\uffff\1\172\1\uffff\1\141\1\172"+
		"\1\162\1\144\1\154\1\145\1\165\1\uffff\1\164\1\uffff\2\172\1\145\1\172"+
		"\1\162\1\172\2\uffff\1\172\1\uffff\1\156\2\uffff\1\172\1\uffff";
	static final String DFA6_acceptS =
		"\2\uffff\1\2\13\uffff\1\22\1\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\37\1\40\1\41\1\42\2\uffff\1\45\1\46\1\1\1\2\2\uffff\1\45"+
		"\7\uffff\1\14\1\26\1\15\1\20\1\16\1\21\1\17\1\22\1\36\1\23\1\24\1\25\1"+
		"\27\1\30\1\31\1\32\1\33\1\34\1\35\1\37\1\40\1\41\1\42\1\43\1\uffff\1\44"+
		"\1\uffff\1\11\7\uffff\1\3\1\uffff\1\10\6\uffff\1\5\1\6\1\uffff\1\12\1"+
		"\uffff\1\4\1\7\1\uffff\1\13";
	static final String DFA6_specialS =
		"\1\0\141\uffff}>";
	static final String[] DFA6_transitionS = {
			"\11\40\2\2\2\40\1\2\22\40\1\2\1\13\1\32\1\1\2\40\1\34\1\31\1\22\1\23"+
			"\1\20\1\16\1\33\1\17\1\40\1\21\1\36\11\35\1\40\1\30\1\15\1\12\1\14\2"+
			"\40\32\37\1\24\1\40\1\25\3\40\2\37\1\5\1\37\1\10\1\4\2\37\1\3\10\37\1"+
			"\11\3\37\1\6\1\7\3\37\1\26\1\40\1\27\uff82\40",
			"\1\41",
			"",
			"\1\44\7\uffff\1\43",
			"\1\46\2\uffff\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\57",
			"\1\60",
			"\1\62",
			"",
			"\1\65",
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
			"\1\106\3\uffff\12\105",
			"\1\106\3\uffff\12\106",
			"",
			"",
			"",
			"",
			"\1\107",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
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
			"\1\106\3\uffff\12\105",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\121",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"\1\130",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\133",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\135",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\140",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INCLUDE | WS | K_INT | K_FLOAT | K_CHAR | VOID | WHILE | FOR | IF | ELSE | RETURN | EQ | NEQ | GT | LT | GE | LE | PLUS | MIN | MULT | DIV | ASS | LPAREN | RPAREN | LBRACK | RBRACK | LCURL | RCURL | SEMICOL | ARROW | S_QUOTE | D_QUOTE | COMMA | AMP | INT | FLOAT | WORD | TOKEN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_0 = input.LA(1);
						s = -1;
						if ( (LA6_0=='#') ) {s = 1;}
						else if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {s = 2;}
						else if ( (LA6_0=='i') ) {s = 3;}
						else if ( (LA6_0=='f') ) {s = 4;}
						else if ( (LA6_0=='c') ) {s = 5;}
						else if ( (LA6_0=='v') ) {s = 6;}
						else if ( (LA6_0=='w') ) {s = 7;}
						else if ( (LA6_0=='e') ) {s = 8;}
						else if ( (LA6_0=='r') ) {s = 9;}
						else if ( (LA6_0=='=') ) {s = 10;}
						else if ( (LA6_0=='!') ) {s = 11;}
						else if ( (LA6_0=='>') ) {s = 12;}
						else if ( (LA6_0=='<') ) {s = 13;}
						else if ( (LA6_0=='+') ) {s = 14;}
						else if ( (LA6_0=='-') ) {s = 15;}
						else if ( (LA6_0=='*') ) {s = 16;}
						else if ( (LA6_0=='/') ) {s = 17;}
						else if ( (LA6_0=='(') ) {s = 18;}
						else if ( (LA6_0==')') ) {s = 19;}
						else if ( (LA6_0=='[') ) {s = 20;}
						else if ( (LA6_0==']') ) {s = 21;}
						else if ( (LA6_0=='{') ) {s = 22;}
						else if ( (LA6_0=='}') ) {s = 23;}
						else if ( (LA6_0==';') ) {s = 24;}
						else if ( (LA6_0=='\'') ) {s = 25;}
						else if ( (LA6_0=='\"') ) {s = 26;}
						else if ( (LA6_0==',') ) {s = 27;}
						else if ( (LA6_0=='&') ) {s = 28;}
						else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {s = 29;}
						else if ( (LA6_0=='0') ) {s = 30;}
						else if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'b')||LA6_0=='d'||(LA6_0 >= 'g' && LA6_0 <= 'h')||(LA6_0 >= 'j' && LA6_0 <= 'q')||(LA6_0 >= 's' && LA6_0 <= 'u')||(LA6_0 >= 'x' && LA6_0 <= 'z')) ) {s = 31;}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\b')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\u001F')||(LA6_0 >= '$' && LA6_0 <= '%')||LA6_0=='.'||LA6_0==':'||(LA6_0 >= '?' && LA6_0 <= '@')||LA6_0=='\\'||(LA6_0 >= '^' && LA6_0 <= '`')||LA6_0=='|'||(LA6_0 >= '~' && LA6_0 <= '\uFFFF')) ) {s = 32;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
