// $ANTLR 3.5.1 C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g 2020-11-28 16:42:58

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OpenWeatherMapAPIParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DUEP", "ERROR_TOKEN", 
		"EXPONENT", "FLOAT", "GC", "GO", "INT", "NAME", "QC", "QO", "VIRG", "VIRGUP", 
		"WS"
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
	public static final int QC=13;
	public static final int QO=14;
	public static final int VIRG=15;
	public static final int VIRGUP=16;
	public static final int WS=17;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g"; }


		int prova2;



	// $ANTLR start "myStartExample"
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:31:1: myStartExample : mainblock EOF ;
	public final void myStartExample() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:32:2: ( mainblock EOF )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:32:4: mainblock EOF
			{
			pushFollow(FOLLOW_mainblock_in_myStartExample64);
			mainblock();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_myStartExample66); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:35:1: mainblock : GO ( block )* GC ;
	public final void mainblock() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:36:2: ( GO ( block )* GC )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:36:4: GO ( block )* GC
			{
			match(input,GO,FOLLOW_GO_in_mainblock77); 
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:36:7: ( block )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VIRGUP) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:36:8: block
					{
					pushFollow(FOLLOW_block_in_mainblock80);
					block();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,GC,FOLLOW_GC_in_mainblock84); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:38:1: block : ( stringa DUEP sublock ) ( VIRG stringa DUEP sublock )* ;
	public final void block() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:2: ( ( stringa DUEP sublock ) ( VIRG stringa DUEP sublock )* )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:4: ( stringa DUEP sublock ) ( VIRG stringa DUEP sublock )*
			{
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:4: ( stringa DUEP sublock )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:5: stringa DUEP sublock
			{
			pushFollow(FOLLOW_stringa_in_block96);
			stringa();
			state._fsp--;

			match(input,DUEP,FOLLOW_DUEP_in_block98); 
			pushFollow(FOLLOW_sublock_in_block100);
			sublock();
			state._fsp--;

			}

			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:27: ( VIRG stringa DUEP sublock )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==VIRG) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:39:28: VIRG stringa DUEP sublock
					{
					match(input,VIRG,FOLLOW_VIRG_in_block104); 
					pushFollow(FOLLOW_stringa_in_block106);
					stringa();
					state._fsp--;

					match(input,DUEP,FOLLOW_DUEP_in_block108); 
					pushFollow(FOLLOW_sublock_in_block110);
					sublock();
					state._fsp--;

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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:41:1: stringa : VIRGUP NAME VIRGUP ;
	public final void stringa() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:42:2: ( VIRGUP NAME VIRGUP )
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:42:4: VIRGUP NAME VIRGUP
			{
			match(input,VIRGUP,FOLLOW_VIRGUP_in_stringa124); 
			match(input,NAME,FOLLOW_NAME_in_stringa126); 
			match(input,VIRGUP,FOLLOW_VIRGUP_in_stringa128); 
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
	// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:44:1: sublock : ( INT | FLOAT | stringa | ( ( QO )? GO ( block )+ GC ( QC )? ) );
	public final void sublock() throws RecognitionException {
		try {
			// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:2: ( INT | FLOAT | stringa | ( ( QO )? GO ( block )+ GC ( QC )? ) )
			int alt6=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt6=1;
				}
				break;
			case FLOAT:
				{
				alt6=2;
				}
				break;
			case VIRGUP:
				{
				alt6=3;
				}
				break;
			case GO:
			case QO:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:4: INT
					{
					match(input,INT,FOLLOW_INT_in_sublock137); 
					}
					break;
				case 2 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:10: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_sublock141); 
					}
					break;
				case 3 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:18: stringa
					{
					pushFollow(FOLLOW_stringa_in_sublock145);
					stringa();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:28: ( ( QO )? GO ( block )+ GC ( QC )? )
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:28: ( ( QO )? GO ( block )+ GC ( QC )? )
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:29: ( QO )? GO ( block )+ GC ( QC )?
					{
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:29: ( QO )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==QO) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:29: QO
							{
							match(input,QO,FOLLOW_QO_in_sublock150); 
							}
							break;

					}

					match(input,GO,FOLLOW_GO_in_sublock153); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:36: ( block )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==VIRGUP) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:37: block
							{
							pushFollow(FOLLOW_block_in_sublock156);
							block();
							state._fsp--;

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input,GC,FOLLOW_GC_in_sublock160); 
					// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:48: ( QC )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==QC) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\susim\\Desktop\\Github_Clone\\Uni\\unibg-compilers\\code\\IdeaProjects\\Progetto\\src\\OpenWeatherMapAPI.g:45:48: QC
							{
							match(input,QC,FOLLOW_QC_in_sublock162); 
							}
							break;

					}

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



	public static final BitSet FOLLOW_mainblock_in_myStartExample64 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_myStartExample66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GO_in_mainblock77 = new BitSet(new long[]{0x0000000000010200L});
	public static final BitSet FOLLOW_block_in_mainblock80 = new BitSet(new long[]{0x0000000000010200L});
	public static final BitSet FOLLOW_GC_in_mainblock84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringa_in_block96 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DUEP_in_block98 = new BitSet(new long[]{0x0000000000014D00L});
	public static final BitSet FOLLOW_sublock_in_block100 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_VIRG_in_block104 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_stringa_in_block106 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DUEP_in_block108 = new BitSet(new long[]{0x0000000000014D00L});
	public static final BitSet FOLLOW_sublock_in_block110 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_VIRGUP_in_stringa124 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NAME_in_stringa126 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VIRGUP_in_stringa128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_sublock137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_sublock141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringa_in_sublock145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QO_in_sublock150 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_GO_in_sublock153 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_block_in_sublock156 = new BitSet(new long[]{0x0000000000010200L});
	public static final BitSet FOLLOW_GC_in_sublock160 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_QC_in_sublock162 = new BitSet(new long[]{0x0000000000000002L});
}
