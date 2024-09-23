package Questions;

import java.util.Scanner;

public class CelciousToFera {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in c:");
        float c = in.nextFloat();

        // convert to Fahrenheit:
        float F = c * (9f / 5) + 32;

        System.out.println(c + " " + "Temp in Fahrenheit is " + F);

    }

}
