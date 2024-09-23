package Questions;

import java.util.Scanner;

public class fibbo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        System.out.println(fibbo2(no));



    }
    static int fibbo2(int no){
        int a = 0;
        int b = 1;
        int count = 2;
        while (no>=count){
            int temp = b;
            b = a+b;
            a= temp;
            count++;

        }
       return b;



    }
}
