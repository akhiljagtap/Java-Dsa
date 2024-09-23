package Questions;

public class CheckNo {
    public static void main(String[] args) {
        int n = 133453;
        // check how many times 3 occure.
        int count = 0;

        while (n > 0) {
            // int rem = n % 10;
            if (n % 10 == 3) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);

    }

}
