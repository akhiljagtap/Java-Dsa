package Questions;

import java.util.Scanner;

public class primeNo2 {
    public static void main(String[] args) {
        System.out.println("enter the no: ");
        Scanner in = new Scanner(System.in);
        int  no = in.nextInt();

        System.out.println(isPrime(no));
    }
    static boolean isPrime(int no){
        if(no<2){
            return  false;
        }
        for (int i = 2; i <=Math.sqrt(no) ; i++) {
            if(no%i==0){
                return  false;
            }

        }
        return true;


    }

}
