package com.woody.parser;

public enum TokenType {

    STAR,
    SLASH,
    PLUS,
    MINUS,
    EQ,

    NUMBER,
    HEX_NUMBER,
    WORD, // pi, e
    TEXT,

    //keyword
    PRINT,

    LPAREN, // (
    RPAREN, // )

    EOF
}
