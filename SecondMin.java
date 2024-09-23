package Questions;

public class SecondMin {
    public static void main(String[] args) {
        int[]arr = {0,2,4,5};
        int ans = secondMin(arr);
        System.out.println(ans);
    }
    static int secondMin(int[]arr){
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE; // always follow this type of approch insted of taking -1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
             if(arr[i] > min && arr[i] < secondMin){
                secondMin = arr[i];
            }
        }

        return secondMin;
    }
}
