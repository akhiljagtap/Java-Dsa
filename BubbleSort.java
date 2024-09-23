package Questions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {22, 21, 19, 13, 12, 11, 6, 3, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }



    static void bubble(int[] arr){
        int i = 0;
        int j = 1;
        for (i = 0 ; i<arr.length; i++){
            for (j =1; j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
