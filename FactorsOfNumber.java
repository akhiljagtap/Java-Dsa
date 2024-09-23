package Questions;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n = 28;
        factors(n);
    }
    static int factors(int n ){
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }
        return n;


    }
}
