package circles;

/**
 * Created by NicholasTurner on 11/30/16.
 */
public class Circle {
    private final double PI = Math.PI;
    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

//    public String calculateFormattedCircumference(){
//
//    }

    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

//    public String calculateFormattedArea(){
//
//    }

//    private String formatNumber(double x){
//
//    }
//
//    public static int calculateObjectCount(){
//
//    }
}
