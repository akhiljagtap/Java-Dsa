package Questions;

public class CaluculateNoOfDigits {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(CalculateNoOfDigits(n));

    }
    static int CalculateNoOfDigits(int n){
        int sum = 0;
        if( n == 0){
            return 1; //zero has one digit
        }
        while (n != 0){
            int digits = n % 10;
            sum += digits;
            n /=10;
        }
        return sum;
    }
}
