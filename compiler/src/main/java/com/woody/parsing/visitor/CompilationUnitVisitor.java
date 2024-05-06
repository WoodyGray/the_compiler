package com.woody.parsing.visitor;

import com.woody.antlr.EnkelBaseVisitor;
import com.woody.antlr.EnkelParser;
import com.woody.antlr.EnkelParser.ClassDeclarationContext;
import com.woody.antlr.EnkelParser.CompilationUnitContext;
import com.woody.domain.CompilationUnit;
import com.woody.domain.ClassDeclaration;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by kuba on 28.03.16.
 */
public class CompilationUnitVisitor extends EnkelBaseVisitor<CompilationUnit> {

    @Override
    public CompilationUnit visitCompilationUnit(@NotNull CompilationUnitContext ctx) {
        ClassVisitor classVisitor = new ClassVisitor();
        ClassDeclarationContext classDeclarationContext = ctx.classDeclaration();
        ClassDeclaration classDeclaration = classDeclarationContext.accept(classVisitor);
        return new CompilationUnit(classDeclaration);
    }
}
