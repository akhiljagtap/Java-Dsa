package Questions;

public class Sm {
    public static void main(String[] args) {
        int[]arr = {1,2,3,6};
        System.out.println(secondMax(arr));

    }
    static int secondMax(int[] arr){
        int max = arr[0];
        int secondMax = -1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] >secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
