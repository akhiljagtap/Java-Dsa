package Questions;

public class fabbo {
    public static void main(String[] args) {
        System.out.println(fibbo(7));
        System.out.println(fibbo(7));

    }
    static int fibbo(int n){
        //base condition
        if( n == 0){
            return 0;
        }
        if( n == 1){
            return 1;
        }
        return fibbo(n-1) + fibbo(n-2);
    }
}
