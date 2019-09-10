import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Parser {

    public static TokenType print = new TokenType("'print'");
    public static TokenType semikolon = new TokenType("';'");
    public static TokenType typeInt = new TokenType("'int'");
    public static TokenType bezeichner = new TokenType("<Bezeichner>");
    public static TokenType gleich = new TokenType("'='");
    public static TokenType zahl = new TokenType("<Zahl>");
    public static TokenType klammerAuf = new TokenType("'('");
    public static TokenType klammerZu = new TokenType("')'");
    public static TokenType plus = new TokenType("'+'");
    public static TokenType mult = new TokenType("'*'");
    public static TokenType endOfFile = new TokenType("<Eingabe-Ende>");
    private Lexer lexer;
    private String input = "";
    private List<TokenType> expected = new ArrayList<>();

    public Parser() {
        // Eingabe in String lesen:
        Scanner s = new Scanner(System.in).useDelimiter("\\A");
        if (s.hasNext()) {
            input = s.next();
        }
        lexer = new Lexer(input);
    }

    public void accept(TokenType t) {
        Token token = lexer.nextToken();
        if (token.tokenType != t) {
            expected.add(t);
            String expectedStr = expected.stream()
                    .map(TokenType::toString)
                    .sorted()
                    .collect(Collectors.joining(" oder "));
            syntaxError(token, "Terminal-Symbol " + token + " gefunden, aber " + expectedStr + " erwartet.");
        }
        expected.clear();
    }

    public boolean nextIs(TokenType t) {
        expected.add(t);
        Token token = lexer.lookahead();
        return token.tokenType == t;
    }

    public void ende() {
        Token token = lexer.lookahead();
        if (token.tokenType != endOfFile) {
            syntaxError(token, "Ende der Eingabe erwartet, aber " + token + " gefunden.");
        } else {
            System.out.println("Eingabe akzeptiert.");
        }
    }

    private void syntaxError(Token token, String message) {
        String[] lines = input.split("\\r?\\n");
        if (token.line >= 1 && token.line <= lines.length) {
            // Zeile mit Fehler ausgeben:
            System.out.println(lines[token.line - 1]);
            // Fehler "unterstreichen":
            for (int i = 0; i < token.column; i++) {
                System.out.print(" ");
            }
            int len = token.text == null ? 1 : token.text.length();
            for (int i = 0; i < len; i++) {
                System.out.print("^");
            }
            System.out.println();
        }
        System.out.println("Fehler in Zeile " + token.line + ":" + token.column + ":");
        System.out.println(message);
        System.exit(0);
    }

    public static class TokenType {
        private String name;

        private TokenType(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    public static class Token {
        private final TokenType tokenType;
        private final String text;
        private final int line;
        private final int column;

        public Token(TokenType tokenType, String text, int line, int column) {
            this.tokenType = tokenType;
            this.text = text;
            this.line = line;
            this.column = column;
        }

        public Token(TokenType tokenType, int line, int column) {
            this.tokenType = tokenType;
            this.text = null;
            this.line = line;
            this.column = column;
        }

        @Override
        public String toString() {
            if (tokenType == bezeichner || tokenType == zahl) {
                return tokenType + " ('" + text + "')";
            } else {
                return tokenType.toString();
            }
        }
    }

    public static class Lexer {

        private String input;
        private int pos = 0;
        private int line = 1;
        private int column = 0;
        private int tokenStart = -1;
        private Token lookahead = null;

        public Lexer(String input) {
            this.input = input;
        }

        public Token lookahead() {
            if (lookahead == null) {
                lookahead = nextToken();
            }
            return lookahead;
        }

        public Token nextToken() {
            if (lookahead != null) {
                Token res = lookahead;
                lookahead = null;
                return res;
            }
            while (true) {
                if (pos >= input.length()) {
                    return token(endOfFile);
                }
                char c = nextChar();

                if (c == '+') {
                    return token(plus);
                } else if (c == '*') {
                    return token(mult);
                } else if (c == '=') {
                    return token(gleich);
                } else if (c == ';') {
                    return token(semikolon);
                } else if (c == '(') {
                    return token(klammerAuf);
                } else if (c == ')') {
                    return token(klammerZu);
                } else if (Character.isWhitespace(c)) {
                    // skip whitespace
                } else if (c == '/') {
                    char c2 = nextChar();
                    if (c2 == '/') {
                        // read until beginning of line
                        while (true) {
                            char c3 = nextChar();
                            if (c3 == '\n' || c3 == 0) {
                                break;
                            }
                        }
                    }
                } else if (Character.isJavaIdentifierStart(c)) {
                    startToken();
                    while (true) {
                        if (!Character.isJavaIdentifierPart(lookaheadChar())) {
                            break;
                        }
                        nextChar();
                    }
                    return token(bezeichner);
                } else if ('0' <= c && c <= '9') {
                    startToken();
                    while (true) {
                        if (lookaheadChar() < '0' || lookaheadChar() > '9') {
                            break;
                        }
                        nextChar();
                    }
                    return token(zahl);
                } else {
                    error("Unrecognized character: '" + c + "'");
                }
            }
        }

        private void startToken() {
            tokenStart = pos - 1;
        }

        private void error(String message) {
            System.out.println("Fehler in Zeile " + line + ":" + column + ":");
            System.out.println(message);
            System.exit(0);
        }

        private char lookaheadChar() {
            if (pos >= input.length()) {
                return 0;
            }
            return input.charAt(pos);
        }

        private char nextChar() {
            if (pos >= input.length()) {
                return 0;
            }
            char c = input.charAt(pos);
            // update line and column number
            if (c == '\n') {
                line++;
                column = 0;
            } else {
                column++;
            }
            pos++;
            return c;
        }

        private Token token(TokenType tokenClass) {
            String info = null;
            int col = column;
            if (tokenStart >= 0) {
                info = input.substring(tokenStart, pos);
                col -= pos - tokenStart;
                tokenStart = -1;
            } else {
                col--;
            }
            if (tokenClass == bezeichner) {
                if (info.equals("int")) {
                    tokenClass = typeInt;
                } else if (info.equals("print")) {
                    tokenClass = print;
                }
            }
            return new Token(tokenClass, info, line, col);
        }

    }

}