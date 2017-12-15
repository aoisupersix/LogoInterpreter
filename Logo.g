grammar Logo;
options {
    output=AST;
    backtrack=true;
    memoize=true;
}

tokens {
    SIMPLE;
    COMPOUND;
    MAKE;
    VAR;
    PLUS;
    MINUS;
    MULT;
    DIV;
    NEG;
    LST;
}

//構文の定義
prog :
      stats EOF -> stats
    ;

stats :
      stat stats -> ^(COMPOUND stat stats)
    | stat -> ^(SIMPLE stat)
    ;

stat :
      FORWARD expr -> ^(FORWARD expr)
    | RIGHT expr -> ^(RIGHT expr)
    | LEFT expr -> ^(LEFT expr)
    | BACK expr -> ^(BACK expr)
    | PENUP -> ^(PENUP)
    | PENDOWN -> ^(PENDOWN)
    | REPEAT expr '[' stats ']' -> ^(REPEAT expr stats)
    | MAKE '"' VAR expr -> ^(MAKE VAR expr)
    | LOCAL '"' VAR -> ^(LOCAL VAR)
    | CLEAR -> ^(CLEAR)
    | IF bexpr '[' stats ']' -> ^(IF bexpr stats)
    | SHOW
    | HIDE
    | SETPCRGB^ expr expr expr
    | SETPENSIZE expr -> ^(SETPENSIZE expr)
    | SETPOS^ expr expr
    | SETH^ expr
    | TO VAR params stats END -> ^(TO VAR params stats)
    | CALL VAR exprs -> ^(CALL VAR exprs)
    | STOP
    ;

params :
    (':' VAR)* -> ^(LST VAR*)
    ;

exprs :
    expr* -> ^(LST expr*)
    ;

bexpr :
      expr EQ^ expr
    | expr NEQ^ expr
    | expr LESS^ expr
    | expr GREATER^ expr
    ;

expr :
	  multExpr '+' expr -> ^(PLUS multExpr expr)
    | multExpr '-' expr -> ^(MINUS multExpr expr)
	| multExpr -> multExpr
	;

multExpr :
	  atom '*' multExpr -> ^(MULT atom multExpr)
    | atom '/' multExpr -> ^(DIV atom multExpr)
	| atom -> atom
	;

atom :
	  NUM -> ^(NUM)
	| '(' expr ')' -> expr
	| '-' atom -> ^(NEG atom)
    | REPCOUNT -> REPCOUNT
    | ':' VAR -> ^(VAR)
	;

//字句の定義
FORWARD : 'FD';
RIGHT : 'RT';
LEFT : 'LT';
BACK : 'BK';
PENUP : 'PU';
PENDOWN : 'PD';
REPEAT : 'REPEAT';
REPCOUNT : 'REPCOUNT';
CLEAR : 'CS';
IF : 'IF';
SHOW : 'ST';
HIDE : 'HT';
SETPCRGB : 'SETPCRGB';
SETPENSIZE : 'SETPENSIZE';
SETPOS : 'SETPOS';
SETH : 'SETH';
TO : 'TO';
END : 'END';
CALL : 'CALL';
STOP : 'STOP';
EQ : '==';
NEQ : '!=';
LESS : '<';
GREATER : '>';
MAKE : 'MAKE';
LOCAL : 'LOCAL';
VAR : ('a'..'z' | 'A'..'Z')+;
NUM : ('0'..'9'+) | ('0'..'9'+ '.' '0'..'9'+);
COMMENT : ('//' | '#') ~('\r' | '\n')* {skip();} ;
WS : (' ' | '\t' | '\r' | '\n' )+   {skip();} ;
