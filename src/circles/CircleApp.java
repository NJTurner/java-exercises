package circles;

/**
 * Created by NicholasTurner on 11/30/16.
 */

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        double circumference;
        double area;


        System.out.println("Please enter the radius of your circle: ");
        double radius = input.nextDouble();
        input.close();


        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The circumference of the circle is: " + circle.calculateCircumference());
        System.out.println("The area of the circle is: " + circle.calculateArea());
    }
}
