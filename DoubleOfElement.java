public class DoubleOfElement {
    public static void main(String[] args) {
        int[] arr={1,3,5,89,8,2,6};
        int x=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]+arr[j]==x){
                System.out.println(arr[i]+" "+arr[j]);
                System.out.println("Found at index: "+i+" and "+(j));
            }
        }
                
    }
    
}
