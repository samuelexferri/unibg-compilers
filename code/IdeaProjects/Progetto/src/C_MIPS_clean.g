grammar C_MIPS_clean;

options {
	language = Java;
	k = 1; // Compilatore con prospettiva 1
}

@lexer::header {
	// package myCompiler;
}

@lexer::members {
	int nErrori = 0;
	
	void printMsg() {
		nErrori++;
		System.out.println("\n*********************************************\n" + "*****\tLexing completato con " + nErrori + " errori\t*****" + "\n*********************************************");
	}
}

@header {
	// package myCompiler;

    import util.*;
    import java.util.Hashtable;
    import java.io.FileWriter;
}

@members {
	ParserEnvironment env;
	Translation tra;

    void init(FileWriter fOut) {
    	System.out.println("Inizio l'analisi\n");
        env = new ParserEnvironment(fOut);
    }

    public Hashtable<String, Value> getSymbolTable() {
		return env.symbolTable;
    }
    
    public Hashtable<String, Value> getSymbolTableLocal() {
	    return env.symbolTableLocal;
    }
  
	public String getDebug() {
		return env.debug.toString();
	}
	
	public String getTranslation() {
    	return env.tra.translation.toString();
    }

    public ArrayList<String> getErrors() {
    	return env.errorList;
  	}

  	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		  
		Token tk = input.LT(1);
		env.handleError(tokenNames, e, hdr, msg);
  }
}



// PARSER
start			: include* global* EOF
				;

include			: INCLUDE LT WORD (DOT WORD)? GT
				;
				
global			: funct_void
				| (type_name)? (pointer SEMICOL 
				     		   | WORD ((ass_multiple
				     		 		   | vector) SEMICOL
									   | funct_params))
				;
				
funct_void		: VOID WORD funct_params
				;
				
funct_params 	: LPAREN (type_name WORD (COMMA type_name WORD)*)? RPAREN codeblock
				; 
				
assignment		: (ADD ASS | SUB ASS | MULT ASS | DIV ASS | ASS) expression
				;

ass_multiple	: assignment? (COMMA WORD assignment?)* // Assegnamento multiplo: int a, b=2, c...
				;
							
ass_vector		: ASS ((LCURL expression (COMMA expression)* RCURL)
					  | expression)
				;
				
vector 			: LBRACK (INT)? RBRACK ass_vector?
				;
				
pointer			: MULT (WORD | LPAREN expression RPAREN) assignment? // Puntatori: *p o *(p+1)
				;
					
call_function 	: LPAREN (call_args (COMMA call_args)*)? RPAREN
				;

call_args		: stringquote
				| MULT WORD
				| WORD ((LBRACK INT RBRACK)? | call_function)
				;
				
codeblock 		: LCURL statement* RCURL
	    		| SEMICOL // SEMICOL di function	
				;

statement 		: local
				| codeblock
				| ifStat
				| whileStat
				| forStat
				| returnStat
				;

local			: (type_name)? (pointer
							   | WORD ( ass_multiple
									  | vector 
									  | call_function)) SEMICOL
				;

returnStat		: RETURN (atom_exp)? SEMICOL 
				;

type_name		: 
				( K_INT
				| K_FLOAT 
				| K_CHAR)
				;

expression 		: multiply_exp ( ADD multiply_exp  
							   | SUB multiply_exp )* 
    			;
    
multiply_exp 	: atom_exp ( MULT atom_exp 
						   | DIV atom_exp )*
    			;
    			
atom_exp 		: INT
				| FLOAT
				| CHAR_QUOTE
				| WORD ((LBRACK (INT)? RBRACK)
					   		| call_function
					   		| ) // Variabile o Vettore
				| MULT WORD // Puntatore
				| AMP WORD // Indirizzo (da estrarre)
    			| LPAREN expression RPAREN // Parentesi
    			;
    			
ifStat			: IF LPAREN condition RPAREN codeblock (ELSE statement)?
				;
						
whileStat		: WHILE LPAREN condition RPAREN statement
				;
				
forStat			: FOR LPAREN initialization SEMICOL condition SEMICOL increment RPAREN statement
				;

initialization	: (type_name)? WORD assignment?
				;

condition		: expression compare expression (operator expression compare expression)*
				;
				
increment		: WORD assignment
				;

compare			:
				( EQ 
				| NEQ 
				| LT 
				| GT 
				| LE 
				| GE )
				;
				
operator		:
				( AMP AMP
				| OR OR
				)
				;
				
stringquote		: D_QUOTE ~(D_QUOTE)* D_QUOTE
				;



// LEXER
fragment DIGIT			: '0'..'9' ;
fragment DIGIT_NO_ZERO	: '1'..'9' ;
fragment UNDRSCR	: '_' ;
fragment SPACE		: ' ' ;
fragment TAB		: '\t';
fragment NEWL   	: '\n';
fragment SLASHR 	: '\r';
fragment CHAR 		: ('a'..'z' | 'A'..'Z') ;

BACKSLASH 	: '\\';

WS 	: ( SPACE 
	| TAB 
	| NEWL 
	| SLASHR 
	){$channel=HIDDEN;}
	;

INCLUDE		: '#include';

K_INT		: 'int' ;
K_FLOAT		: 'float' ;
K_CHAR		: 'char' ;

VOID 		: 'void' ;
WHILE 	 	: 'while' ;
FOR 		: 'for' ;
IF 			: 'if' ;
ELSE 		: 'else' ;
RETURN 		: 'return' ;

EQ 			: '==' ;
NEQ			: '!=' ;
GT 			: '>' ;
LT 			: '<' ;
GE			: '>=' ;
LE 			: '<=' ;

ASS 		: '=' ;

ADD 		: '+' ;
SUB 		: '-' ;
MULT 		: '*' ;
DIV 		: '/' ;
LPAREN    	: '(' ;
RPAREN 		: ')' ;
LBRACK 		: '[' ;
RBRACK   	: ']' ;
LCURL 		: '{' ;
RCURL 		: '}' ;
SEMICOL		: ';' ;
DOT 		: '.' ; // Float
ARROW 		: '->' ;
S_QUOTE 	: '\'' ;
D_QUOTE 	: '"' ;
COMMA		: ',' ;
AMP      	: '&' ;
PERC		: '%' ;
HASHTAG		: '#' ;
OR			: '|' ;

INT			: DIGIT_NO_ZERO DIGIT* 
			| '0' ;
FLOAT		: DIGIT+ DOT DIGIT+ ;
CHAR_QUOTE	: S_QUOTE (DIGIT 
					  | CHAR 
					  | BACKSLASH ('0' | 'n')) S_QUOTE ;

WORD 		: CHAR (CHAR | UNDRSCR | DIGIT)* ;

COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		| '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
 			;

TOKEN_ERROR	: . {printMsg();} ;