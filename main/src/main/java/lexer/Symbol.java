package lexer;


import java.util.HashMap;

public class Symbol {
    private String name;
    private Tokens kind;
    private static HashMap<String, Symbol> symbols = new HashMap();

    private Symbol(String var1, Tokens var2) {
        this.name = var1;
        this.kind = var2;
    }

    public String toString() {
        return this.name;
    }

    public Tokens getKind() {
        return this.kind;
    }

    public static Symbol symbol(String var0, Tokens var1) {
        Symbol var2 = (Symbol)symbols.get(var0);
        if (var2 == null) {
            if (var1 == Tokens.BogusToken) {
                return null;
            }

            var2 = new Symbol(var0, var1);
            symbols.put(var0, var2);
        }

        return var2;
    }
}