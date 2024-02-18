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

    LPAREN, // (
    RPAREN, // )

    EOF
}
