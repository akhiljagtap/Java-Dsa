package Questions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,4,7,57};
//        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverseArray(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}
