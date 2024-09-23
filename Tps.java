package Questions;

import java.util.Arrays;

public class Tps {
    public static void main(String[] args) {
        int[]arr = {4,3,2,11,1};
        tps(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void tps(int[]arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
