grammar SimpleLanguageSemantic;

options {
  language = Java;
  k = 1;
}

@header{
  package compilerPackage;
  
  import compilerPackage.util.*;
}

@lexer::header{
  package compilerPackage;
}

@members {
  ParserHandler handler;
  
  void init () {
    handler = new ParserHandler ();
  }
  
  public String getTranslation () {
    return handler.translation.toString();
  }
  
  public String getPrint () {
    return handler.print.toString();
  }
  
  public ArrayList<String> getErrors () {
    return handler.errorList;
  }

  public void displayRecognitionError(String[] tokenNames,
                                       RecognitionException e) {
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		  
		Token tk = input.LT(1);
		handler.handleError(tokenNames, e, hdr, msg);
  }
   
  
}


/* This will be the entry point of our parser. */
// produzioni parser
start 
@init { init (); }
    : BEGIN  
        ( declaration 
        | instruction 
        )*
      END
    ;


declaration 
    : type=DATATYPE var=ID                	{ handler.addNewVariable ($type, $var); }
      ( eq=EQ         // memorizzo il token EQ per la messaggistica.         
        value=expression[$type.getText()] 	{ handler.assignValue (var, value, eq); } )? 
      SC 
    ;


instruction
    : print 
    | assignment							
    | noPriorityAssignment
    ;


print
    : PRINT LP 
        ( p1=factor[ValueTypes.ANYVALUE_STR] 
        
          (	ADD p2=factor[ValueTypes.ANYVALUE_STR] 
            { p1=handler.concat(p1, p2); } 
          )*
        
        )?
      RP {  handler.doPrint (p1); }
      SC
    ;
    
    
assignment
    : var=ID 																							{ handler.checkDeclaration ($var); }
      eq=EQ       // memorizzo il token EQ per la messaggistica.
      vl=expression[handler.getVarType($var)]  						{ handler.assignValue ($var, vl, $eq); } 
      SC    
    ;

/*	assignments where the expression do not folllow the 
		classic math priorities */
noPriorityAssignment
    : NOPRIORITY 
    	var=ID 																							{ handler.checkDeclaration ($var); }
    	eq=EQ 		// memorizzo il token EQ per la messaggistica.
    	v1=noPriorityExpression[handler.getVarType($var)]		{ handler.assignValue ($var, v1, $eq); } 
    	SC    																					
    ;


    
/* Addition and subtraction have the lowest precedence. */
expression [String type] returns [Value value]
    : ( s=ADD | s=SUB )?
    	v1=term[type] 								{	v1.setSign (s);	}
       ( op=ADD v2=term[type]				{ v1 = handler.doAdd ($op, v1, v2); }
       | op=SUB v2=term[type] 				{ v1 = handler.doSub($op, v1, v2); }
      )* 
      { value = v1; }
    ;


/* Multiplication and division have a higher precedence. */
term [String type] returns [Value value]
    : v1=factor[type]
       ( op=MUL v2=factor[type] 				{ v1 = handler.doMul ($op, v1, v2); } 
       | op=DIV v2=factor[type] 				{ v1 = handler.doDiv ($op, v1, v2); }
      )*
      { value = v1;}
    ;

/* An expression atom is the smallest part of an expression: a number. Or 
   when we encounter parenthesis, we're making a recursive call back to the
   rule 'additionExp'. As you can see, an 'atomExp' has the highest precedence. */
factor [String type] returns [Value value]
    : tk=INT    							{ value = handler.setValue($tk, ValueTypes.INT_STR, type); }
    | tk=FLOAT  							{ value = handler.setValue($tk, ValueTypes.FLOAT_STR, type); }
    | tk=STRING 							{ value = handler.setValue($tk, ValueTypes.STRING_STR, type); }
    | tk=ID     							{ value = handler.getDeclaredValue ($tk, type); }
    | LP v=expression[type] 	{ value = v; } 			RP
    ;

/* All math operators have the same priority. */
noPriorityExpression [String type] returns [Value value]
    : ( s=ADD | s=SUB )?
    	v1=noPriorityTermFactor[type] 						{	v1.setSign (s);	}
    		( ( op=SUB | op=MUL | op=ADD | op=DIV ) 
    			v2=noPriorityTermFactor[type]  				{ v1 = handler.doOp ($op, v1, v2); }
    		)*
    	{ value = v1; }
    ;

/* An expression atom is the smallest part of an expression: a number. Or 
   when we encounter parenthesis, we're making a recursive call back to the
   rule 'additionExp'. As you can see, an 'atomExp' has the highest precedence. */
noPriorityTermFactor[String type] returns [Value value]
    : tk=INT    												{ value = handler.setValue($tk, ValueTypes.INT_STR, type); }
    | tk=FLOAT  												{ value = handler.setValue($tk, ValueTypes.FLOAT_STR, type); }
    | tk=STRING 												{ value = handler.setValue($tk, ValueTypes.STRING_STR, type); }
    | tk=ID     												{ value = handler.getDeclaredValue ($tk, type); }
    | LP v=noPriorityExpression[type] 	{ value = v; } 	RP
    ;



// LEXER TOKENS

SC    // semicolon
    : ';' 
    ;

LP    // Left Parenthesis
    : '(' 
    ;

RP    // Right Parenthesis 
    : ')' 
    ;

EQ   
    : '=' 
    ;

ADD   
    : '+' 
    ;

SUB   
    : '-' 
    ;

MUL   
    : '*' 
    ;

DIV   
    : '/' 
    ;

BEGIN 
    : 'begin' 
    ;

END 
    : 'end' 
    ;

DATATYPE 
    : 'int' 
    | 'float' 
    | 'String' 
    ;

PRINT 
    : 'println' 
    ;

INT : '0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* 
    |   '.' ('0'..'9')+ 
    ;
    
NOPRIORITY : 'NO PRIORITY' 
		;

ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '           
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' (~('\\'|'"') )* '"'
    ;

SCAN_ERROR   
    : .
    ; 
