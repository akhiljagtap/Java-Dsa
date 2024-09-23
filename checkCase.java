package Questions;

import java.util.Scanner;

public class checkCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        String str = in.next();
        checkCase(str);
        System.out.println(str);
    }

    static void checkCase(String str){
        char ch = str.charAt(0);
        if(ch >= 'A' & ch <= 'Z'){
            System.out.println("Uppercase");
        }else if (ch >= 'a' & ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("illigle args");
        }
    }
}
