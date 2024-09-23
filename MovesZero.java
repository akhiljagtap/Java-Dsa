package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
        int[]arr = {0,1,0,3,12};
        movesZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void movesZero(int[]arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0){
                int temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }if(arr[j] != 0){
                j++;
            }
        }
    }
}