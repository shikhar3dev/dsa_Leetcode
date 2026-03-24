import java.util.Scanner;
public class Average3Number {
    public static  double average(double a,double b,double c){
        return(a+b+c)/3;

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number:");
        double a = sc.nextDouble();
        System.out.print("Input the second number:");
        double b = sc.nextDouble();
        System.out.print("Input the third number:");
        double c = sc.nextDouble();
        System.out.print("The average value is "+ average(a,b,c)+"\n");







    }
}
