import java.util.Scanner;

public class VOTING {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Your Age");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Eligible For Voting");
        }
        else{
            System.out.println("Not Eligble for Voting");
        }
    }
    
}
