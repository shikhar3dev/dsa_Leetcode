public class MatriceAdd {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr1 = {{7, 8, 9}, {4, 5, 6}};

        int[][] arr2 = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        // Printing result matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
