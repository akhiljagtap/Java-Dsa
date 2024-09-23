package Questions;

public class arms {
    public static void main(String[] args) {
        int n = 1634;
        isArms(n);
    }
    static void isArms(int n){
        int orignalNo = n;
        int sum = 0;
        String no = String.valueOf(n);
        int length = no.length();
        while (n > 0){
            int digit = n % 10;
            n = n /10;
            sum += Math.pow(digit,length);

        }
        if (orignalNo == sum){
            System.out.println("armsStrong");
        }else {
            System.out.println("not armsstrong");
        }
    }

}
