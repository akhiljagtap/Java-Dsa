package Questions;

public class sumAll {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        System.out.println(sumAll(arr));

    }
    static int sumAll(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
