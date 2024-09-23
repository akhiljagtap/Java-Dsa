package Questions;

public class SecondSmallest {
    public static void main(String[] args) {
        int[]arr = {4,2,3,5,6,7,8,9};
        System.out.println(sm(arr));

    }
    static int sm(int[] arr){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

         for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }

            if (arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;

    }
}
