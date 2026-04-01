public class Pattern2 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {           // outer loop 0 to 4
            for(int j = 5; j < 0; j++) {       // inner loop 0 to 4
                System.out.print("* ");        // print star in same line
            }
            System.out.println();              // new line after each row
        }
    }
}
