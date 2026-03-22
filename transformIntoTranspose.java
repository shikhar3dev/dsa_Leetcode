public class transformIntoTranspose {
    public static void print(int[][] arr){
        int m = arr.length,n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
    }
}
