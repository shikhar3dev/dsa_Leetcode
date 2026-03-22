import java.util.Scanner;
public class INPUToutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n =sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<35){
                System.out.println(i);
            }
            System.out.println(arr[i]);
        }
    }}
    