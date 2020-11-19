// $ANTLR 3.5.1 C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g 2020-11-17 17:58:35

	//package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AssignmentCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "EQ", "ERROR_TOKEN", 
		"EXPONENT", "FLOAT", "ID", "INT", "LP", "OP", "RP", "SC", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int EQ=5;
	public static final int ERROR_TOKEN=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int ID=9;
	public static final int INT=10;
	public static final int LP=11;
	public static final int OP=12;
	public static final int RP=13;
	public static final int SC=14;
	public static final int WS=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AssignmentCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AssignmentCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AssignmentCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g"; }


		int prova2;



	// $ANTLR start "myStartExample"
	// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:24:1: myStartExample : ( assignement )+ ;
	public final void myStartExample() throws RecognitionException {
		try {
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:25:2: ( ( assignement )+ )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:25:4: ( assignement )+
			{
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:25:4: ( assignement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:25:4: assignement
					{
					pushFollow(FOLLOW_assignement_in_myStartExample55);
					assignement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
	// $ANTLR end "myStartExample"



	// $ANTLR start "assignement"
	// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:28:1: assignement : ID EQ expression SC ;
	public final void assignement() throws RecognitionException {
		try {
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:29:2: ( ID EQ expression SC )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:29:4: ID EQ expression SC
			{
			match(input,ID,FOLLOW_ID_in_assignement67); 
			match(input,EQ,FOLLOW_EQ_in_assignement69); 
			pushFollow(FOLLOW_expression_in_assignement71);
			expression();
			state._fsp--;

			match(input,SC,FOLLOW_SC_in_assignement73); 
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
	// $ANTLR end "assignement"



	// $ANTLR start "expression"
	// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:32:1: expression : atom (x= OP atom )* ;
	public final void expression() throws RecognitionException {
		Token x=null;

		try {
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:33:2: ( atom (x= OP atom )* )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:33:4: atom (x= OP atom )*
			{
			pushFollow(FOLLOW_atom_in_expression85);
			atom();
			state._fsp--;

			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:33:9: (x= OP atom )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==OP) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:33:10: x= OP atom
					{
					x=(Token)match(input,OP,FOLLOW_OP_in_expression90); 
					System.out.println("Ho trovato questa operazione: \t" + x.getText());
					pushFollow(FOLLOW_atom_in_expression94);
					atom();
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
	// $ANTLR end "expression"



	// $ANTLR start "atom"
	// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:35:1: atom : ( INT | FLOAT | ID | LP expression RP ) ;
	public final void atom() throws RecognitionException {
		try {
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:36:2: ( ( INT | FLOAT | ID | LP expression RP ) )
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:36:5: ( INT | FLOAT | ID | LP expression RP )
			{
			// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:36:5: ( INT | FLOAT | ID | LP expression RP )
			int alt3=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt3=1;
				}
				break;
			case FLOAT:
				{
				alt3=2;
				}
				break;
			case ID:
				{
				alt3=3;
				}
				break;
			case LP:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:36:7: INT
					{
					match(input,INT,FOLLOW_INT_in_atom110); 
					}
					break;
				case 2 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:37:5: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom116); 
					}
					break;
				case 3 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:38:5: ID
					{
					match(input,ID,FOLLOW_ID_in_atom122); 
					}
					break;
				case 4 :
					// C:\\Google Drive\\Università\\Anno V\\Linguaggi formali e compilatori\\Tutorato\\IdeaProjects\\ANTLR Scanner\\src\\AssignmentCompiler.g:39:5: LP expression RP
					{
					match(input,LP,FOLLOW_LP_in_atom128); 
					pushFollow(FOLLOW_expression_in_atom130);
					expression();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_atom132); 
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
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_assignement_in_myStartExample55 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ID_in_assignement67 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EQ_in_assignement69 = new BitSet(new long[]{0x0000000000000F00L});
	public static final BitSet FOLLOW_expression_in_assignement71 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_SC_in_assignement73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_expression85 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_OP_in_expression90 = new BitSet(new long[]{0x0000000000000F00L});
	public static final BitSet FOLLOW_atom_in_expression94 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_INT_in_atom110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom128 = new BitSet(new long[]{0x0000000000000F00L});
	public static final BitSet FOLLOW_expression_in_atom130 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RP_in_atom132 = new BitSet(new long[]{0x0000000000000002L});
}
