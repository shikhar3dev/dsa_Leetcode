import java.util.Scanner;

public class EvenorOdd {

    // Method to check if a number is even
    public static boolean isEven(int a) {
        return (a % 2) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        sc.close();
    }
}