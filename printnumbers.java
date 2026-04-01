public class printnumbers {
public   static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {           // outer loop 1 to 5
            for(int j = 1; j <= i; j++) {       // inner loop 1 to i
                System.out.print(j + " ");      // print number in same line
            }
            System.out.println();                // new line after each row
        }
    }
}