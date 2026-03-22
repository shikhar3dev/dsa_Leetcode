public class OpoositeOfMergeSort {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {6, 7, 8, 9};
        int[] nums = new int[arr.length + arr1.length];
        int i=arr.length-1,j=arr1.length-1,k=arr.length + arr1.length-1;
        while(i>-1&&j>-1){

            if(arr[i]>arr1[j]){
                nums[k]=arr[i];
                i--;
                k--;
            }
            else{
                nums[k]=arr1[j];
                j--;
                k--;
            }
        }
        if(i==-1){
            while(j>-1) {
                nums[k]=arr1[j];
                k--;
                j--;
            }
        }
        if(j==-1) {
            while (i > -1) {
                nums[k] = arr[i];
                k--;
                i--;

            }
        }
            for(int ele:nums){
            System.out.println(ele+"");
        }
    }
}
