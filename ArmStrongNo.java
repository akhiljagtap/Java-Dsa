package Questions;

import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args) {
        System.out.println("enter the no: ");
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        System.out.println(isArmStrong(no));

    }
    static boolean isArmStrong(int no){
        int sum = 0;
        int orignalNo = no;
        String str =  String.valueOf(no);
        int n = str.length();

        while (no>0){

            int rem = no % 10;
            no = no/10;
            sum += Math.pow(rem,n);


        }
        if(orignalNo == sum){
            return  true;
        }
        return false;






    }

}
