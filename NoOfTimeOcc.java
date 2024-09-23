package Questions;

public class NoOfTimeOcc {
    public static void main(String[] args) {
        int n = 1222222245;
        int target = 2;
        System.out.println(count2Reps(n,target));
    }
    static int count2Reps(int n,int target){
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if(target == digit){
                count++;
            }
            n = n /10;
        }
        return count;
    }

}
