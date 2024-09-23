package Questions;

public class MaxOfTwo {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int  c = 50;
        System.out.println(maxOf2(a,b,c));

    }
    static int maxOf2(int a,int b,int c){
        int max = a;
        if(a > b && a > c){
            max = a;
        }else if(b > c){
            max = b;
        }else {
            max = c;
        }
        return max;

    }
}
