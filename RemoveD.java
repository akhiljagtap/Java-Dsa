package Questions;

public class RemoveD {
    public static void main(String[] args) {
        int[]arr = {1 ,2, 2, 3};
        int ans = removeD(arr);
        System.out.println(ans);

    }
    static int removeD(int[]arr){
        int count =  1 ; //because 1st element is always be unique.
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
//                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
