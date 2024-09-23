package Questions;

public class prime {
    public static void main(String[] args) {
        prime(2);

    }
    static void prime(int n){
        boolean isPrime = true;
        if(n < 2){
            isPrime = false; // 0 and 1 are not a prime no  && -ve are also not prime.
        }else {
            for (int i = 2; i < n; i++) {
                if( n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        String result  = isPrime ? "Prime" : "Not a prime";
        System.out.println(result);


    }
}
