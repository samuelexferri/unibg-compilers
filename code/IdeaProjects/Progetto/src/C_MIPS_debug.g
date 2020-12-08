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
				
global			: VOID {System.out.print("VOID ");} identifier function 
				| type_name? ( pointer SEMICOL {System.out.print("\n");}
							 | identifier (((assignment (COMMA {System.out.print(", ");} identifier assignment)*| vector) SEMICOL {System.out.print("\n");}) 
										  | function))
				;
				
assignment		: ((ADD | SUB | MULT | DIV)? ASS {System.out.print("\t---> ");} expression)? // ASS OPZ, Gestisce anche l'indirizzo puntato
				;
				
vector 			: {System.out.print("[vector ");} LBRACK (x=INT {System.out.print("int=" + $x.getText());})? RBRACK {System.out.print("] ");} (ASS {System.out.print("\t-v-> ");} (({System.out.print("{ ");} LCURL expression (COMMA {System.out.print(", ");} expression)* RCURL {System.out.print("} ");}) | expression))? // ASS OPZ
				;
				
pointer			: MULT {System.out.print("* ");} identifier (ASS {System.out.print("\t-p-> ");} expression)? // ASS OPZ
				;
					
function 		: {System.out.print("FUNCTION ");} LPAREN {System.out.print("( ");} (type_name identifier (COMMA {System.out.print(", ");} type_name identifier)*)? RPAREN {System.out.print(") ");} codeblock
				;

call_function 	: {System.out.print("CALL_FUNCTION ");} LPAREN {System.out.print("( ");} (((D_QUOTE anything* D_QUOTE) | MULT? identifier) (COMMA ((D_QUOTE anything* D_QUOTE) | MULT? identifier))*)? RPAREN {System.out.print(") ");}
				;
				
codeblock 		: {System.out.print("\n");} {System.out.print("{\n");} LCURL (statement)* RCURL {System.out.print("}\n");} 
	    		| SEMICOL {System.out.print("\n");} // SEMICOL di function	
				;

statement 		: type_name? (identifier (assignment (COMMA {System.out.print(", ");} identifier assignment)* | call_function | vector) | pointer) SEMICOL {System.out.print("\n");}
				| ifStat
				| whileStat
				| forStat 
			  	| {System.out.print("return ");} RETURN atom_exp SEMICOL {System.out.print("\n");}
			  	;
			  	
ifStat			: {System.out.print("IF ");} IF {System.out.print("( ");} LPAREN (identifier compare expression) RPAREN {System.out.print(") ");} codeblock (ELSE {System.out.print("ELSE ");}(codeblock | ifStat | whileStat))? // TODO: Operatori logici
				;
						
whileStat		: {System.out.print("WHILE ");} WHILE {System.out.print("( ");} LPAREN (identifier compare expression) RPAREN {System.out.print(") ");} codeblock 
				;
				
forStat			: {System.out.print("FOR ");} FOR {System.out.print("( ");} LPAREN (type_name? identifier ASS expression) {System.out.print("; ");} SEMICOL (identifier compare expression) {System.out.print("; ");} SEMICOL (identifier compare expression) RPAREN {System.out.print(") ");} codeblock 
				;

type_name		: (x=K_INT | x=K_FLOAT | x=K_CHAR){System.out.print("type:" + $x.getText() + " ");}
				; 
				
identifier		: (x=WORD | x=CHAR){System.out.print("id:" + $x.getText() + " ");}
				;

expression 		: multiply_exp ((x=ADD | x=SUB) {System.out.print("exp:" + $x.getText() + " ");} multiply_exp)* 
    			;
    
multiply_exp 	: atom_exp ((x=MULT|x=DIV) {System.out.print("mexp:" + $x.getText() + " ");} atom_exp)*
    			;

atom_exp 		: x=INT {System.out.print("int=" + $x.getText() + " ");}
				| x=FLOAT {System.out.print("float=" + $x.getText() + " ");}
				| x=CHAR_QUOTE {System.out.print("char_quote=" + $x.getText() + " ");}
				| (MULT {System.out.print("* ");} | AMP {System.out.print("& ");})? identifier (LBRACK INT RBRACK)? // Variabili, Vettori o Puntatori 
    			| LPAREN {System.out.print("( ");} expression RPAREN {System.out.print(") ");}
    			;
				
anything		: x=(INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS)  {System.out.print("#A_" + $x.getText() + " ");} // TODO: Aggiungere
				;

compare			: (x=EQ | x=NEQ | x=LT | x=GT | x=LE | x=GE | ((ADD | SUB | MULT | DIV)? x=ASS)) {System.out.print("#C_" + $x.getText() + " ");} // TODO: ASS negli If
				;

include 		: INCLUDE {System.out.println("INCLUDE");} ;			


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