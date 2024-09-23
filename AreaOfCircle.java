package Questions;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radious = 5.0;
        System.out.println(areaOfCircle(radious));


    }
    static double areaOfCircle(double r){
        double area = Math.PI * r * r;
        return area;
    }
}
