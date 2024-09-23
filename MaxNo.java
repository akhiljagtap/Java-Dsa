package Questions;

import java.util.Scanner;

public class MaxNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the nos");
        int no1 = in.nextInt();
        int no2 = in.nextInt();
        int no3 = in.nextInt();

        // APPROCH 1

        // if (no1 > no2 && no1 > no3) {
        // System.out.println(no1 + "is gretter");
        // } else if (no2 > no3) {
        // System.out.println(no2 + "is gretter");

        // } else {
        // System.out.println(no3 + " is gretter.");
        // }

        // APPROICH 2

        // int max = no1;
        // if (no2 > max) {
        // max = no2;
        // } else if (no3 > max) {
        // max = no3;
        // }
        // System.out.println("max no is" + max);
        
        // APPROCH -3

        // int max = Math.max(no1, Math.max(no2, no3));
        // System.out.println(max + "is max");
    }

}
