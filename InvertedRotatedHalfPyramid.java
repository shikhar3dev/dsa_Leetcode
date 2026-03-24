public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        int n = 5; // number of rows

        // outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }
}
