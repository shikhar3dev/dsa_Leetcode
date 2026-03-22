public class reversearry {
    public static void main(String[] args) {

        int[] arr = {1,4,5,6,3,2};
        int n = arr.length;

        // Print original array
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // Reverse array
        int i = 0, j = n - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print reversed array
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
