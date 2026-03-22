public class AddElements {
    public static void main(String[] args){
        int sum=0;
        int[][] arr={{1,2,3},{4,5,6}};
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];;
            }
        }
        System.out.println(sum);

    }

}
