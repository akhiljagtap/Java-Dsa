package Questions;

public class HCF {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(hcf(n));

    }
    static int hcf(int n){
        if( n <= 1){
            return n;
        }
        int divisors = 0;
        for (int i = 2; i <= n/2 ; i++) {
            if( n % i == 0){
               divisors = i;
               break;
            }
        }
        return divisors;
    }
}
