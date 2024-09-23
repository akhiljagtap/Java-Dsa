package Questions;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countDigits(n));

    }
    static int countDigits(int n ){
        int count = 0;
        while ( n > 0 ){
            int digit = n % 10;
            count++;
            n = n /10;
        }
        return count;
    }
}
