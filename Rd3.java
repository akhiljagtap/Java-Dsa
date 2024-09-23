package Questions;

public class Rd3 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,3,4,6,6,7,7,7,8};
        int ans = removeDuplicate(arr);
        for (int i = 0; i <= ans ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static int removeDuplicate(int[]arr){
        int rd = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[rd] != arr[i]){
                rd++;
                arr[rd] = arr[i]; // the value at second assigned to the first
            }
        }
        return rd+1;
    }

}
