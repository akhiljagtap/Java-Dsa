package Questions;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        runningSum(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void runningSum(int[]arr){
        for (int i = 1; i < arr.length ; i++) {
            arr[i] += arr[i-1];
        }
//        return arr;
    }
}
