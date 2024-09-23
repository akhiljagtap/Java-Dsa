package Questions;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 3;
        isPrime(n);
    }
    static void isPrime(int n){
        //0 and 1 are not prime no
        boolean isPrime = true;
        if( n < 2){
            isPrime = false;
        }else {
            for (int i = 2; i < n ; i++) {
                if( n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        String ans = isPrime ? "PRIME NO " : "NOT PRIME NO ";
        System.out.println(ans);
    }
}
