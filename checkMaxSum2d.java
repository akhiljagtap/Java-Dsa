package Questions;

public class checkMaxSum2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,24,2},
                {1,44,2},
                {1,2,2}
        };

        System.out.println(checkSum(arr));

    }

    static int checkSum(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum+=arr[row][col];



            }
            if(sum>ans){
                ans = sum;

            }

        }
        return  ans;
    }

}
