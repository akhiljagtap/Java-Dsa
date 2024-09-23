package Questions;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {1,2,4,56};
        int ans = secondMax(arr);
        System.out.println(ans);
    }
    static int secondMax(int[]arr){
        int max = arr[0];
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < max && arr[i] > secondMax){
                arr[i] = secondMax;
            }
        }
        return secondMax;
    }
}
