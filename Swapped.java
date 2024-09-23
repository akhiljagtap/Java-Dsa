package Questions;

public class Swapped {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;
//        swap(a,b);


        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +  " " + b);
    }

}
