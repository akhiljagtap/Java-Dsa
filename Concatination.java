package Questions;

import java.util.Arrays;

public class Concatination {
    public static void main(String[] args) {
        int[]nusm = {1,2,3};
        int[] ans = concatinate(nusm);
        System.out.println(Arrays.toString(ans));

    }
    static int[] concatinate(int[]arr){
        int[]ans = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i+arr.length] = arr[i];
        }
        return ans;

    }
}
