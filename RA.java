package Questions;

import java.util.Arrays;
import java.util.Stack;

public class RA {
    public static void main(String[] args) {
        int[]arr = {1,2,3,5,6};
        twoPointers(arr);
        System.out.println(Arrays.toString(arr));
    }

    //when you have to change the position of element always remember the swap;
    //like here we are swapping first elem with last
    static void twoPointers(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
