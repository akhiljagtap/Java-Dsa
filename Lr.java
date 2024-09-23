package Questions;

import java.util.Arrays;

public class Lr {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,};
        leftRotate(arr,7);
        System.out.println(Arrays.toString(arr));

    }
    static void leftRotate(int[]arr,int n){
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
