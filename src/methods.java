/**
 * Created by NicholasTurner on 11/14/16.
 */
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
    System.out.println(2 + " plus " + 2 + " is " + add(2,2));
    System.out.println(1.3 + " plus " + 2.5 + " is " + add(1.3,2.5));
        recurToTen(1);
    }

    private static void countToTen() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static int recurToTen(int n){
        if(n <=10){
            System.out.println(n);
            return recurToTen(n + 1);
        } else{
            System.out.println("done");
            return n;
        }
    }
    //recurToTen(1)
        //recurToTen(2)
            //recurToTen(3)
                //recurToTen(4)

    private static int add (int a, int b){
        return a + b;
    }

    private static double add(double a, double b) {
        return a + b;
    }
}
