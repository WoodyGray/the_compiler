package com.woody.parsing;

import com.woody.domain.CompilationUnit;
import com.woody.parsing.visitor.CompilationUnitVisitor;
import org.antlr.v4.runtime.*;
import java.io.IOException;

/**
 * Created by kuba on 16.03.16.
 */
public class Parser {
    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbolutePath - file containing first enk code file
        com.woody.antlr.WlangLexer lexer = new com.woody.antlr.WlangLexer(charStream);  //create lexer (pass enk file to it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        com.woody.antlr.WlangParser parser = new com.woody.antlr.WlangParser(tokenStream);

        ANTLRErrorListener errorListener = new WlangTreeWalkErrorListener(); //WlangTreeWalkErrorListener - handles parse tree visiting error events
        parser.addErrorListener(errorListener);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
