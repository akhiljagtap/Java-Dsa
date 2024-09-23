package Questions;

public class noOccures {
    public static void main(String[] args) {
        int[]arr = {1,2,3,1,2,3,3,3,4,3};
        System.out.println(arr.length);
        int target = 3;
        int ans = charOccMaxTime(arr,target);
        System.out.println(ans);

    }
    static int charOccMaxTime(int[]arr,int target){
        int cnt = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == target){
                cnt++;
            }
        }
        return cnt;
    }
}
