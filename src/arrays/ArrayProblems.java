package arrays;

public class ArrayProblems {
    public static void main(String[] args) {

        //sum of array elements
        int[] arr = {3,53,45,2,64,23,1,5,565};

//        int sum = 0;
//        for(int i : arr) {
//            sum += i;
//        }
//        System.out.println(sum);

//        int smallest = arr[0];
        int smallest = Integer.MAX_VALUE; // always use this
        for(int i : arr) {
            smallest = Math.min(i, smallest);
        }
        System.out.println("Smallest Number is :" + smallest);
    }
}
