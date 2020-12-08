grammar C_MIPS;

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
		System.out.println("Numero errori Trovati: \t" + nErrori);
	}
}

@header {
	// package myCompiler;
}

@members {
	// int test;
}



// PARSER
start			: INCLUDE* global* EOF
				;
				
global			: VOID identifier function 
				| type_name? ( pointer SEMICOL 
							 | identifier (((assignment (COMMA identifier assignment)*| vector) SEMICOL) 
										  | function))
				;
				
assignment		: ((ADD | SUB | MULT | DIV)? ASS expression)? // ASS OPZ, Gestisce anche l'indirizzo puntato
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
				| ifStat
				| whileStat
				| forStat
			  	| RETURN atom_exp SEMICOL 
			  	;
			  	
ifStat			: IF LPAREN (identifier compare expression) RPAREN codeblock (ELSE (codeblock | ifStat | whileStat))? // TODO: Operatori logici
				;
						
whileStat		: WHILE LPAREN (identifier compare expression) RPAREN codeblock
				;
				
forStat			: FOR LPAREN (type_name? identifier ASS expression) SEMICOL (identifier compare expression) SEMICOL (identifier compare expression) RPAREN codeblock 
				;


type_name		: (K_INT | K_FLOAT | K_CHAR)
				; 
				
identifier		: (WORD | CHAR)
				;

expression 		: multiply_exp (ADD multiply_exp | SUB multiply_exp)* 
    			;
    
multiply_exp 	: atom_exp (MULT atom_exp | DIV atom_exp)*
    			;

atom_exp 		: INT
				| FLOAT  
				| CHAR_QUOTE
				| (MULT | AMP)? identifier (LBRACK INT RBRACK)? // Variabili, Vettori o Puntatori 
    			| LPAREN expression RPAREN
    			;
				
anything		: INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS // TODO: Aggiungere
				;

compare			: EQ | NEQ | LT | GT | LE | GE | ((ADD | SUB | MULT | DIV)? ASS) // TODO: ASS negli If
				;
				


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

INT			: DIGIT_NO_ZERO DIGIT* | '0' ;
FLOAT		: DIGIT+ DOT DIGIT+ ;
CHAR 		: ('a'..'z' | 'A'..'Z') ;
CHAR_QUOTE	: S_QUOTE ('a'..'z' | 'A'..'Z') S_QUOTE ;

WORD 		: CHAR ('a'..'z' | 'A'..'Z' | UNDRSCR | DIGIT)+ ;

COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		| '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
 			;

TOKEN_ERROR	: . {printMsg();} ;