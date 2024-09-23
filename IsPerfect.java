package Questions;

public class IsPerfect {
    public static void main(String[] args) {
        int n = 6;
        isPerfect(n);

    }
    static void isPerfect(int n){
        if( n <= 1){
            System.out.println("not perfect no ");;
        }
        //1 and less than 1 are never be a perfect no
        int sum = 1;
        for (int i = 2; i <= n/2 ; i++) {
            if( n % i == 0){
               sum +=i;
            }
        }
       if (sum == n){
           System.out.println("perfect no ");
       }
    }
}
