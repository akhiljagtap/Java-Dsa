package Questions;

public class PrimeNoInRange {
    public static void main(String[] args) {
        int n = 13;
//        for (int i = 2; i <= n ; i++) {
//            if(primeInRange(i)){
//                System.out.println(i + " ");
//            }
//        }
        System.out.println(primeInRange(n));

    }
    static boolean primeInRange(int n ){
        if( n <2){
            return false;
        }
        if( n == 2){
            return true;
        }
        if( n % 2 == 0){
            return false;
        }

        for (int i = 3; i <= n/2 ; i+=2) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
