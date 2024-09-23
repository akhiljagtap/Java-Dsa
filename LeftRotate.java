package Questions;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,9};
        int n = 8;
        LeftRotat(arr,n);


    }
    static void LeftRotat(int[]arr,int n){
        int temp = arr[0];
        for (int i = 1; i <n ; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}