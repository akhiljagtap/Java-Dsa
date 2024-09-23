package Questions;

public class OneTo100PN {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < 100; i++) {
            if(primeNo(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean primeNo(int n){
        if ( n < 2 && n % 2  == 0){
           return false;
        }
        if( n == 2){
            return true;
        }
//        if( n % 2  == 0){
//            return false;
//        }
        for (int i = 2; i <= n/2 ; i++) {
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
