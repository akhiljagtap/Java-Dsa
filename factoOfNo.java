package Questions;

public class factoOfNo {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }
    static int fact(int n){
        int fact = 1; //any no multiply by 0 is zero so we are starting from 1
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
}
