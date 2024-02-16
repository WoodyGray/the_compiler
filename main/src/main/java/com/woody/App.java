package com.woody;

import com.woody.ast.Expression;
import com.woody.parser.Lexer;
import com.woody.parser.Parser;
import com.woody.parser.Token;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final String input = "(2 + 2) * #FABCDEF";
        final List<Token> tokens = new Lexer(input).tokenize();

        for (Token token: tokens
             ) {
            System.out.println(token);
        }

        final List<Expression> expressions = new Parser(tokens).parse();
        for (Expression expr: expressions
             ) {
            System.out.println(expr + " = " + expr.eval());
        }

    }
}
