import java.util.Scanner;
public class Welcomecode {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome to the Java programming world, " + name + "!");

    }
    
}
