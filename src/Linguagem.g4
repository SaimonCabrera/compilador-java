grammar Linguagem;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
}

@parser::members {
    Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program: PROGRAM ID BRACKET_OPEN sentence* BRACKET_CLOSE;

sentence: var_decl | var_assign | println | conditional | while_loop;

var_decl: VAR ID SEMICOLON {symbolTable.put($ID.text, 0);};

var_assign: ID ASSIGN expression SEMICOLON {symbolTable.put($ID.text, $expression.value);};

println: PRINTLN expression SEMICOLON {System.out.println($expression.value);};

conditional: IF PAR_OPEN expression PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE ELSE BRACKET_OPEN sentence* BRACKET_CLOSE;

while_loop: WHILE PAR_OPEN expression PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE;

expression returns [Object value]: t1 = comparison {$value = $t1.value;}
    (OR t2 = comparison {$value = (boolean)$value || (boolean)$t2.value;})*;

comparison returns [Object value]: t1 = additive {$value = $t1.value;}
    (LT t2 = additive {$value = (int)$value < (int)$t2.value;}
    | GT t2 = additive {$value = (int)$value > (int)$t2.value;}
    | LEQ t2 = additive {$value = (int)$value <= (int)$t2.value;}
    | GEQ t2 = additive {$value = (int)$value >= (int)$t2.value;}
    | EQ t2 = additive {$value = $value.equals($t2.value);}
    | NEQ t2 = additive {$value = !$value.equals($t2.value);}
    )*;

additive returns [Object value]: t1 = multiplicative {$value = $t1.value;}
    (PLUS t2 = multiplicative {$value = (int)$value + (int)$t2.value;}
    | MINUS t2 = multiplicative {$value = (int)$value - (int)$t2.value;}
    )*;

multiplicative returns [Object value]: t1 = factor {$value = $t1.value;}
    (MULT t2 = factor {$value = (int)$value * (int)$t2.value;}
    | DIV t2 = factor {$value = (int)$value / (int)$t2.value;}
    )*;

factor returns [Object value]: NUMBER {$value = Integer.parseInt($NUMBER.text);}
    | ID {$value = symbolTable.get($ID.text);}
    | BOOLEAN {$value = Boolean.parseBoolean($BOOLEAN.text);}
    | PAR_OPEN expression PAR_CLOSE;

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

BOOLEAN: 'true' | 'false';

ID: [a-z] [a-zA-Z0-9_]*;

NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;
