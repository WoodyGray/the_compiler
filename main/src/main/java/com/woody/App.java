package com.woody;

import com.woody.ast.Expression;
import com.woody.ast.Statement;
import com.woody.lib.Variables;
import com.woody.parser.Lexer;
import com.woody.parser.Parser;
import com.woody.parser.Token;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
//        final String input = "(2.193 + PI) * #FABCDEF";
        final String input = new String(Files.readAllBytes(Paths.get("program.txt")), "UTF-8");
        final List<Token> tokens = new Lexer(input).tokenize();

        for (Token token: tokens
             ) {
            System.out.println(token);
        }

        final List<Statement> statements = new Parser(tokens).parse();
        for (Statement statement: statements
             ) {
            System.out.println(statement);
        }

        for (Statement statement: statements
        ) {
            statement.execute();
        }
    }
}
