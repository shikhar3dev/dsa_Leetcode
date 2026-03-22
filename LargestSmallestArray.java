public class LargestSmallestArray {

    public static int getLargest(int Numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < Numbers.length; i++) {

            if (largest < Numbers[i]) {
                largest = Numbers[i];
            }

            if (smallest > Numbers[i]) {
                smallest = Numbers[i];
            }
        }

        System.out.println("Smallest value is: " + smallest);

        return largest;
    }

    public static void main(String[] args) {

        int[] Numbers = {2, 3, 4, 5, 6, 8};

        System.out.println("Largest Number is: " + getLargest(Numbers));
    }
}