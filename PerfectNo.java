package Questions;

public class PerfectNo {
    public static void main(String[] args) {
        int n = 6;
        perfect(n);
    }
    static void perfect(int n ){
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0){
                sum +=i ;
            }
        }
        if (sum == n){
            System.out.println( n +" is perfect no ");
        }else {
            System.out.println( n + " is not perfect no ");
        }
    }
}
