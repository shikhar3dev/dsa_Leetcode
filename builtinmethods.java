public class builtinmethods {
    public static void main(String[] args) {
        int[] arr={30,10,40,23,89,34};
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i+" : "+arr[i]);
        }
        java.util.Arrays.sort(arr);
        System.out.println("After sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i+" : "+arr[i]);
        }

    }
    
}
