package Questions;

public class isLeepYear {
    public static void main(String[] args) {
        isLeep(2024);

    }
    static void isLeep(int yr){
        if(yr % 4 == 0 && yr % 100 != 0){
            System.out.println(yr + " is leep year ");
        }else {
            System.out.println(yr + " is not leep year ");
        }
    }
}
