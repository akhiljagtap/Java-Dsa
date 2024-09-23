package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6};
        System.out.println(Arrays.toString(resize(nums,10)));


    }
    static int[] resize(int[]arr,int capacity){
        int[] temp = new int[capacity]; //initializing the new temp array.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i]; //coping the value store at the ith index of arr to temp arr.
        }
        return temp; //finally returning that new array.
    }
}
