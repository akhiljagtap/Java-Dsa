package Questions;

import java.util.Arrays;

public class LeetCodeString {
    public static void main(String[] args) {
        String name = " ";
        System.out.println(isPalindrome(name));
    }
    static boolean isPalindrome(String str){
        char[] ch = str.toCharArray();
         int start = 0;
         int end = ch.length -1;
         while (start <= end){
             if( isLowercase(ch[start]) != isLowercase(ch[end])){
                 return false;
             }else {
                 char temp = ch[start];
                 ch[start] = ch[end];
                 ch[end] = temp;
                 start++;
                 end--;
             }
         }
         return true;
    }

    static char isLowercase(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return ch;
        }else {
            char temp = (char)( ch - 'A' + 'a');
            return temp;
        }
    }
}
