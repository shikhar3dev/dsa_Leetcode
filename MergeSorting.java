public class MergeSorting {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {6, 7, 8, 9};
        int[] nums = new int[arr.length + arr1.length];
        int i=0,j=0,k=0;
        while(i<arr.length&&j<arr1.length){

            if(arr[i]<=arr1[j]){
                nums[k]=arr[i];
                i++;
                k++;
            }
            else{
                nums[k]=arr1[j];
                j++;
                k++;
            }
        }
        if(i==arr.length){
            while(j<arr1.length) {
                nums[k]=arr1[j];
                k++;
                j++;
            }
              }
        if(j==arr1.length){
            while(i<arr.length){
                nums[k]=arr[i];
                k++;
                i++;

            }
        }



        //  int index = 0;

        // copy first array
        //for (int i = 0; i < arr.length; i++) {
        //  nums[index] = arr[i];
        //index++;
        //  }

        // copy second array
        //for (int j = 0; j < arr1.length; j++) {
        //  nums[index] = arr1[j];
        //index++;
        //}

        // print merged array
         for (int ele : nums) {
         System.out.print(ele + " ");
        //  }
        //  }
//}

    }}}