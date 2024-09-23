package Questions;

import java.util.Arrays;

public class bs {
    public static void main(String[] args) {
        int[]arr = {111,112,113};
        bs(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bs(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <  arr.length; j++) {
                if(arr[j-1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
