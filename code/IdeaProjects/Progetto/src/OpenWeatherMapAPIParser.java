// $ANTLR 3.5.1 C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g 2020-11-24 16:59:54

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OpenWeatherMapAPIParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DUEP", "ERROR_TOKEN", 
		"EXPONENT", "FLOAT", "GC", "GO", "INT", "NAME", "VIRG", "VIRGUP", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DUEP=5;
	public static final int ERROR_TOKEN=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int GC=9;
	public static final int GO=10;
	public static final int INT=11;
	public static final int NAME=12;
	public static final int VIRG=13;
	public static final int VIRGUP=14;
	public static final int WS=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public OpenWeatherMapAPIParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public OpenWeatherMapAPIParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return OpenWeatherMapAPIParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g"; }


		int prova2;



	// $ANTLR start "myStartExample"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:25:1: myStartExample : mainblock ;
	public final void myStartExample() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:26:2: ( mainblock )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:26:4: mainblock
			{
			pushFollow(FOLLOW_mainblock_in_myStartExample64);
			mainblock();
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
	// $ANTLR end "myStartExample"



	// $ANTLR start "mainblock"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:29:1: mainblock : GO ( block )* GC ;
	public final void mainblock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:30:2: ( GO ( block )* GC )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:30:4: GO ( block )* GC
			{
			match(input,GO,FOLLOW_GO_in_mainblock75); 
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:30:7: ( block )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VIRGUP) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:30:8: block
					{
					pushFollow(FOLLOW_block_in_mainblock78);
					block();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,GC,FOLLOW_GC_in_mainblock82); 
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
	// $ANTLR end "mainblock"



	// $ANTLR start "block"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:32:1: block : stringa DUEP sublock ( VIRG )* ;
	public final void block() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:33:2: ( stringa DUEP sublock ( VIRG )* )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:33:4: stringa DUEP sublock ( VIRG )*
			{
			pushFollow(FOLLOW_stringa_in_block93);
			stringa();
			state._fsp--;

			match(input,DUEP,FOLLOW_DUEP_in_block95); 
			pushFollow(FOLLOW_sublock_in_block97);
			sublock();
			state._fsp--;

			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:33:25: ( VIRG )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==VIRG) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:33:25: VIRG
					{
					match(input,VIRG,FOLLOW_VIRG_in_block99); 
					}
					break;

				default :
					break loop2;
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
	// $ANTLR end "block"



	// $ANTLR start "stringa"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:35:1: stringa : VIRGUP NAME VIRGUP ;
	public final void stringa() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:36:2: ( VIRGUP NAME VIRGUP )
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:36:4: VIRGUP NAME VIRGUP
			{
			match(input,VIRGUP,FOLLOW_VIRGUP_in_stringa111); 
			match(input,NAME,FOLLOW_NAME_in_stringa113); 
			match(input,VIRGUP,FOLLOW_VIRGUP_in_stringa115); 
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
	// $ANTLR end "stringa"



	// $ANTLR start "sublock"
	// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:38:1: sublock : ( INT | FLOAT | stringa | ( GO ( block )+ GC ) );
	public final void sublock() throws RecognitionException {
		try {
			// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:2: ( INT | FLOAT | stringa | ( GO ( block )+ GC ) )
			int alt4=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt4=1;
				}
				break;
			case FLOAT:
				{
				alt4=2;
				}
				break;
			case VIRGUP:
				{
				alt4=3;
				}
				break;
			case GO:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:4: INT
					{
					match(input,INT,FOLLOW_INT_in_sublock124); 
					}
					break;
				case 2 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:10: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_sublock128); 
					}
					break;
				case 3 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:18: stringa
					{
					pushFollow(FOLLOW_stringa_in_sublock132);
					stringa();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:28: ( GO ( block )+ GC )
					{
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:28: ( GO ( block )+ GC )
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:29: GO ( block )+ GC
					{
					match(input,GO,FOLLOW_GO_in_sublock137); 
					// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:32: ( block )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==VIRGUP) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\GitHub\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:33: block
							{
							pushFollow(FOLLOW_block_in_sublock140);
							block();
							state._fsp--;

							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input,GC,FOLLOW_GC_in_sublock144); 
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
	// $ANTLR end "sublock"

	// Delegated rules



	public static final BitSet FOLLOW_mainblock_in_myStartExample64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GO_in_mainblock75 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_block_in_mainblock78 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_GC_in_mainblock82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringa_in_block93 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DUEP_in_block95 = new BitSet(new long[]{0x0000000000004D00L});
	public static final BitSet FOLLOW_sublock_in_block97 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_VIRG_in_block99 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_VIRGUP_in_stringa111 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NAME_in_stringa113 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_VIRGUP_in_stringa115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_sublock124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_sublock128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringa_in_sublock132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GO_in_sublock137 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_block_in_sublock140 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_GC_in_sublock144 = new BitSet(new long[]{0x0000000000000002L});
}
