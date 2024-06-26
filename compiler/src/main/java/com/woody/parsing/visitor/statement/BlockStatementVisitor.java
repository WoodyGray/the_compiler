package com.woody.parsing.visitor.statement;

import com.woody.antlr.WlangParser.BlockContext;
import com.woody.antlr.WlangParser.StatementContext;
import com.woody.domain.scope.Scope;
import com.woody.domain.node.statement.Block;
import com.woody.domain.node.statement.Statement;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class BlockStatementVisitor extends com.woody.antlr.WlangBaseVisitor<Block> {
    private final Scope scope;

    public BlockStatementVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Block visitBlock(@NotNull BlockContext ctx) {
        List<StatementContext> blockstatementsCtx = ctx.statement();
        Scope newScope = new Scope(scope);
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        List<Statement> statements = blockstatementsCtx.stream().map(smtt -> smtt.accept(statementVisitor)).collect(Collectors.toList());
        return new Block(newScope, statements);
    }
}