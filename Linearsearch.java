public class Linearsearch {
    static void main(String[] args) {

        int[] arr={1,2,4,6,7,9};
        int key=2;
        int index =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index = i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
