/**
 * Created by NicholasTurner on 11/14/16.
 */
import java.util.Scanner;
public class table_exercise {
    public static void main(String[] args) {
        int stopNumber;
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        stopNumber = sc.nextInt();
        for (int i = 1; i <= stopNumber; i += 1) {
            System.out.println(i + " squared: " + Math.pow(i, 2) + " cubed: " + Math.pow(i, 3));
        }
    }
//zach's code
//    public static void main(String[] cheese) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int stopNumber = sc.nextInt();
//
//        System.out.println("n     | n^2   | n^3 ");
//        System.out.println("------|-------|-----");
//
//        for (int i = 1; i <= stopNumber; i += 1) {
//            System.out.printf(
//                    "%-5d | %-5.0f | %-5.0f\n",
//                    i,
//                    Math.pow(i, 2),
//                    Math.pow(i, 3)
//            );
//        }
//
//    }
}