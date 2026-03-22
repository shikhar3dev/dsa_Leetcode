public class Pass1Dutch {
    public static void main(String[] args){
        int[] arr={1,2,0,0,0,1,1,2,0,1,0,1,0,2,2,2,2,2,2,2,0};
        int n=arr.length;
        int mid,low,high;
        high=n-1;
        low=0;
        mid=0;
        while(mid<=high){
            if (arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int ele:arr){
            System.out.println(ele+" ");
        }


    }
}