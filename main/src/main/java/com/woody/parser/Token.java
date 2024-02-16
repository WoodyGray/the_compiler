package com.woody.parser;

public final class Token {
    private String text;
    private TokenType type;

    public Token() {
    }

    public Token(String text, TokenType type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public TokenType getType() {
        return type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + text;
    }
}
