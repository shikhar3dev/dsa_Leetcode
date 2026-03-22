public class DutchFlag {
  public  static void main() {
      int[] arr={1,0,0,1,0,0,1,0,1,0,2,2,0,2,0,2,1,2};
      int n=arr.length;
      int NoZeroes=0;
      int NoOnes=0;
      for(int i=0;i<n;i++){
          if(arr[i]==0){
              NoZeroes++;
          } else if (arr[i]==1) {
              NoOnes++;
          }
      }
      for(int i=0;i<NoZeroes;i++){
          arr[i]=0;
      }
      for(int i=NoZeroes;i<NoOnes+NoZeroes;i++){
          arr[i]=1;
      }
      for(int i=NoOnes+NoZeroes;i<n;i++){
          arr[i]=2;
      }
      for(int ele:arr){
          System.out.println(ele+" ");
      }

    }
}
