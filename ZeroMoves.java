package Questions;

import java.util.Arrays;

public class ZeroMoves {
    public static void main(String[] args) {
        int[]arr = {1,0,2,3,4,0,0,5};
        movesZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void movesZero(int[]arr){
        int j = 0;
        for (int i = 1; i <  arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }if (arr[j] != 0){
                j++;
            }
        }
    }
}
