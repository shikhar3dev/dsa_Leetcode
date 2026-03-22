import java.util.Arrays;

public class DistinctArray {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        int n = arr.length;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Find minimum difference
        for(int i = 0; i < n - 1; i++){
            minDiff = Math.min(minDiff, arr[i+1] - arr[i]);
        }

        // Print all pairs with minimum difference
        for(int i = 0; i < n - 1; i++){
            if(arr[i+1] - arr[i] == minDiff){
                System.out.println("[" + arr[i] + "," + arr[i+1] + "]");
            }
        }
    }
}
//import java.util.*;
//
//class Solution {
//    public List<List<Integer>> minimumAbsDifference(int[] arr) {
//
//        Arrays.sort(arr);
//        int n = arr.length;
//
//        int minDiff = Integer.MAX_VALUE;
//
//        // Step 1: Find minimum difference
//        for(int i = 0; i < n - 1; i++){
//            minDiff = Math.min(minDiff, arr[i+1] - arr[i]);
//        }
//
//        // Step 2: Store result
//        List<List<Integer>> result = new ArrayList<>();
//
//        for(int i = 0; i < n - 1; i++){
//            if(arr[i+1] - arr[i] == minDiff){
//                result.add(Arrays.asList(arr[i], arr[i+1]));
//            }
//        }
//
//        return result;
//    }
//}