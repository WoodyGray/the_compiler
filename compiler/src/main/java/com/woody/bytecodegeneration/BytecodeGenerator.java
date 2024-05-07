package com.woody.bytecodegeneration;

import com.woody.domain.ClassDeclaration;
import com.woody.domain.CompilationUnit;


public class BytecodeGenerator {
    public byte[] generate(CompilationUnit compilationUnit) {
        ClassDeclaration classDeclaration = compilationUnit.getClassDeclaration();
        ClassGenerator classGenerator = new ClassGenerator();
        return classGenerator.generate(classDeclaration).toByteArray();
    }
}
