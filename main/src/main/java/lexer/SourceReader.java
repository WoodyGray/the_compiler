//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceReader {
    private BufferedReader source;
    private int lineno = 0;
    private int position;
    private boolean isPriorEndLine = true;
    private String nextLine;
    private boolean possibleFloat = false;

    public static void main(String[] var0) {
        SourceReader var1 = null;

        try {
            var1 = new SourceReader("t");

            while(true) {
                char var2 = var1.read();
                System.out.println("Char: " + var2 + " Line: " + var1.lineno + "position: " + var1.position);
            }
        } catch (Exception var3) {
            if (var1 != null) {
                var1.close();
            }

        }
    }

    public SourceReader(String var1) throws IOException {
        try {
            System.out.println("Source file: " + var1);
            System.out.println("user.dir: " + System.getProperty("user.dir"));
            System.out.println("User's current working directory: " + System.getProperty("user.dir"));
            String var2 = System.getProperty("file.separator");
//            this.source = new BufferedReader(new FileReader("src" + var2 + "lexer" + var2 + var1));
            this.source = new BufferedReader(new FileReader(var1));
        } catch (Exception var3) {
            System.out.println(var3);
        }

    }

    void close() {
        try {
            this.source.close();
        } catch (Exception var2) {
        }

    }

    public char read() throws IOException {
        if (this.isPriorEndLine) {
            ++this.lineno;
            this.position = -1;
            this.nextLine = this.source.readLine();
            this.possibleFloat = false;
            if (this.nextLine != null) {
                System.out.println("\nREADLINE:   " + this.nextLine);
            }

            this.isPriorEndLine = false;
        }

        if (this.nextLine == null) {
            throw new IOException();
        } else if (this.nextLine.length() == 0) {
            this.isPriorEndLine = true;
            return ' ';
        } else {
            ++this.position;
            if (this.position >= this.nextLine.length()) {
                this.isPriorEndLine = true;
                return ' ';
            } else {
                if (this.nextLine.charAt(this.position) == '.' && this.position < this.nextLine.length() && Character.isDigit(this.nextLine.charAt(this.position + 1))) {
                    this.possibleFloat = true;
                }

                return this.nextLine.charAt(this.position);
            }
        }
    }

    public int getPosition() {
        return this.position;
    }

    public boolean mightBeFloat() {
        return this.possibleFloat;
    }

    public int getLineno() {
        return this.lineno;
    }
}
