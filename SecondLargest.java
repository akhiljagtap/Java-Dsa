package Questions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {6,5,3,5,4,2};
        System.out.println(secondSmallest(arr));

    }

    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    static int secondSmallest(int[]arr){
        int smallest = arr[0];
        int sSmallest = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest && arr[i]<sSmallest){
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
}

