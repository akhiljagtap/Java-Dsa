package Questions;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

    }
    static int factorial(int n ){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return  fact;
    }
}
