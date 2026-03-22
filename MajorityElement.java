public class MajorityElement {
    static void main(String[] args) {
        class Solution {
            public int majorityElement(int[] nums) {
                int n=nums.length;
                for(int i=0;i<n;i++){
                    int Count=0;
                    for(int j=0;j<n;j++){
                        if(nums[i]==nums[j]){
                            Count++;
                        }

                    }
                    if(Count>n/2){
                        return nums[i];

                    }



                }
                return -1;
            }

        }
}}
