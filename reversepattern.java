 
public class reversepattern {
    public static void main(String[] args) {
        int rows = 5;

        // First pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        System.out.println(); // Separate the patterns with a blank line

        // Second pattern
        for(int i = 5; i >= 1; i--) {           // outer loop 5 to 1
            for(int j = 1; j <= i; j++) {       // inner loop 1 to i
                System.out.print("* ");          // print star in same line
            }
            System.out.println();                // new line after each row
        }
    }
}
