grammar TestScript;

// Правило для программы
program: statement+ EOF;

// Правило для операторов
statement: assignment
         | arithmeticOperation
         | logicalOperation
         | conditionalStatement
         | loopStatement
         | basicOutput
         | functionDeclaration
         | functionCall
         | COMMENT;

// Правило для оператора присваивания
assignment: variable '=' expression;

// Правило для арифметических операций
arithmeticOperation: expression op=('*' | '/' | '+' | '-') expression;

// Правило для логических операций
logicalOperation: expression op=('==' | '!=' | '>' | '<') expression;

// Правило для условного оператора
conditionalStatement: 'if' '(' expr=expression ')' '{' trueBranch=statement+ '}' ('else' '{' falseBranch=statement+ '}')?;

// Правило для циклов
loopStatement: 'for' '(' initialization=assignment ';' expr=expression ';' update=assignment ')' '{' body=statement+ '}'
            | 'while' '(' expr=expression ')' '{' body=statement+ '}'
            | 'do' '{' body=statement+ '}' 'while' '(' expr=expression ')';

// Правило для базового вывода
basicOutput: 'print' expression;

// Правило для определения функции
functionDeclaration: 'def' functionName '(' parameterList? ')' '{' statement+ '}';

// Правило для списка параметров функции
parameterList: variable (',' variable)*;

// Правило для вызова функции
functionCall: functionName '(' argumentList? ')';

// Правило для имени функции
functionName: ID;


// Правило для списка аргументов функции
argumentList: expression (',' expression)*;

// Правило для условия
condition: expression;

// Правило для арифметического или логического выражения
expression: variable | number | '(' expression ')' | expression op=('+' | '-' | '*' | '/' | '==' | '!=' | '>' | '<') expression;

// Правило для переменной
variable: ID;

// Правило для числа
number: INTEGER | FLOAT;

INTEGER: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;

// Правило для идентификатора (названия переменной или функции)
ID: [a-zA-Z_][a-zA-Z_0-9]*;

// Правило для комментариев
COMMENT: '/*' .*? '*/';

// Пропускаем пробельные символы и символы новой строки
WS: [ \t\r\n]+ -> skip;
