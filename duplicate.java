package Questions;

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int[]arr = {1};
        System.out.println(countDup(arr));

    }
    static int countDup(int[]arr){
        if(arr.length ==0 ){
            return -1;
        }
        int unique = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                unique++;
            }
        }
        return unique;
    }
}
