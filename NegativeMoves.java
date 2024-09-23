package Questions;
import java.util.Arrays;

public class NegativeMoves {
    public static void main(String[] args) {
        int[]arr = {4,5,6,-6,-8,-9,12,15};
        negativeMoves(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void negativeMoves(int[]arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > 0 && arr[j] < 0){
                int temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }if(arr[j] > 0) {
                j++;
            }
        }
    }
}
