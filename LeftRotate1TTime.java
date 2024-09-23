package Questions;

import java.util.Arrays;

public class LeftRotate1TTime {
    public static void main(String[] args) {
        int[]arr = {1,2,3,5,6,7};
        leftRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void leftRotate(int[]arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
