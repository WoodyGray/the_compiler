package com.woody.bytecodegeneration;

import com.woody.domain.ClassDeclaration;
import com.woody.domain.CompilationUnit;

/**
 * Created by kuba on 01.04.16.
 */
public class BytecodeGenerator {
    public byte[] generate(CompilationUnit compilationUnit) {
        ClassDeclaration classDeclaration = compilationUnit.getClassDeclaration();
        ClassGenerator classGenerator = new ClassGenerator();
        return classGenerator.generate(classDeclaration).toByteArray();
    }
}
