grammar C_MIPS_debug;

options {
	language = Java;
	k = 1; // Compilatore con prospettiva 1
}

@lexer::header {
	// package myCompiler;
}

@lexer::members {
	int nErrori = 0;
	
	void printMsg () {
		nErrori++;
		System.out.println("-----------------------> ERRORE! Numero errori Trovati: \t" + nErrori);
	}
}

@header {
	// package myCompiler;
}

@members {
	// int test;
}



// PARSER
start			: include* global* EOF
				;
				
global			: VOID identifier function 
				| type_name? ( pointer SEMICOL 
							 | identifier (((assignment (COMMA identifier assignment)*| vector) SEMICOL) 
										  | function))
				;
				
assignment		: ((ADD | SUB | MULT | DIV)? ASS {System.out.print("Assegnamento ");} expression)? // ASS OPZ, Gestisce anche l'indirizzo puntato
				;
				
vector 			: LBRACK INT? RBRACK (ASS ((LCURL expression (COMMA expression)* RCURL) | expression))? // ASS OPZ
				;
				
pointer			: MULT identifier (ASS expression)? // ASS OPZ
				;
					
function 		: LPAREN (type_name identifier (COMMA type_name identifier)*)? RPAREN codeblock
				;

call_function 	: LPAREN (((D_QUOTE anything* D_QUOTE) | MULT? identifier) (COMMA ((D_QUOTE anything* D_QUOTE) | MULT? identifier))*)? RPAREN
				;
				
codeblock 		: LCURL (statement)* RCURL   
	    		| SEMICOL // SEMICOL di function	
				;

statement 		: type_name? (identifier (assignment (COMMA identifier assignment)* | call_function | vector) | pointer) SEMICOL
				| ifStat {System.out.println("If");}
				| whileStat {System.out.println("While");}
				| forStat {System.out.println("For");}
			  	| RETURN atom_exp SEMICOL {System.out.println("Return");}
			  	;
			  	
ifStat			: IF LPAREN (identifier compare expression) RPAREN codeblock (ELSE {System.out.println("Else");}(codeblock | ifStat | whileStat))? // TODO: Operatori logici
				;
						
whileStat		: WHILE LPAREN (identifier compare expression) RPAREN codeblock 
				;
				
forStat			: FOR LPAREN (type_name? identifier ASS expression) SEMICOL (identifier compare expression) SEMICOL (identifier compare expression) RPAREN codeblock 
				;

type_name		: (x=K_INT | x=K_FLOAT | x=K_CHAR){System.out.println("Type_name:\t" + $x.getText());}
				; 
				
identifier		: (x=WORD | x=CHAR){System.out.println("Identifier:\t" + $x.getText());}
				;

expression 		: multiply_exp ((x=ADD | x=SUB) {System.out.print("expression:\t" + $x.getText());} multiply_exp)* 
    			;
    
multiply_exp 	: atom_exp ((x=MULT|x=DIV) {System.out.println("Multiply_exp:\t" + $x.getText());} atom_exp)*
    			;

atom_exp 		: x=INT {System.out.println("int:\t" + $x.getText());}
				| x=FLOAT  {System.out.println("float:\t" + $x.getText());}
				| CHAR_QUOTE {System.out.println("If");}
				| (MULT | AMP)? identifier (LBRACK INT RBRACK)? // Variabili, Vettori o Puntatori 
    			| LPAREN {System.out.print("Aperta tonda ");} expression RPAREN {System.out.println(" Chiusa tonda");}
    			;
				
anything		: INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS // TODO: Aggiungere
				;

compare			: x=EQ | x=NEQ | x=LT | x=GT | x=LE | x=GE | ((ADD | SUB | MULT | DIV)? x=ASS) {System.out.print("Compare:\t" + $x.getText());} // TODO: ASS negli If
				;

include 		: INCLUDE {System.out.print ("Include Instrucion\n");} ;			


// LEXER

INCLUDE	: '#include <stdio.h>' | '#include <stdlib.h>';

fragment DIGIT	: '0'..'9' ;
fragment DIGIT_NO_ZERO	: '1'..'9' ;
fragment UNDRSCR: '_' ;
fragment SPACE	: ' ' ;
fragment TAB	: '\t';
fragment NEWL   : '\n';
fragment SLASHR : '\r';

WS 	: ( SPACE 
	| TAB 
	| NEWL 
	| SLASHR 
	){$channel=HIDDEN;}
	;

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

ADD 		: '+' ;
SUB 		: '-' ;
MULT 		: '*' ;
DIV 		: '/' ;
ASS 		: '=' ;
LPAREN    	: '(' ;
RPAREN 		: ')' ;
LBRACK 		: '[' ;
RBRACK   	: ']' ;
LCURL 		: '{' ;
RCURL 		: '}' ;
SEMICOL		: ';' ;
DOT 		: '.' ; // Float
ARROW 		: '->' ; // Arrow
S_QUOTE 	: '\'' ;
D_QUOTE 	: '"' ;
COMMA		: ',' ;
AMP      	: '&' ;
PERC		: '%' ;
HASHTAG		: '#' ;

INT		: DIGIT_NO_ZERO DIGIT* | '0' ;
FLOAT		: DIGIT+ DOT DIGIT+ ;
CHAR 		: ('a'..'z' | 'A'..'Z') ;
CHAR_QUOTE	: S_QUOTE ('a'..'z' | 'A'..'Z') S_QUOTE ;

WORD 		: CHAR ('a'..'z' | 'A'..'Z' | UNDRSCR | DIGIT)+ ;

COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		| '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
 			;

TOKEN_ERROR	: . {printMsg();} ;