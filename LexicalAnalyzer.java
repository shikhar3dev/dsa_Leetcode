import java.util.*;

class LexicalAnalyzer {

    static String[] keywords = {
            "int", "float", "double", "if", "else",
            "while", "for", "return"
    };

    static boolean isKeyword(String token) {
        for (String k : keywords) {
            if (k.equals(token))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input, " +-*/=();{}", true);

        while (st.hasMoreTokens()) {
            String token = st.nextToken().trim();

            if (token.isEmpty())
                continue;

            if (isKeyword(token)) {
                System.out.println(token + " : Keyword");
            }
            else if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                System.out.println(token + " : Identifier");
            }
            else if (token.matches("[0-9]+")) {
                System.out.println(token + " : Number");
            }
            else {
                System.out.println(token + " : Operator/Symbol");
            }
        }
        sc.close();
    }
}
