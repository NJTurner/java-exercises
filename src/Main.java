/**
 * Created by NicholasTurner on 11/11/16.
 */
import java.util.Scanner;
public class Main {
    /*public static void main(String[] args) {
        String message = sayHello();
        System.out.println(message);
    }*/

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static String sayHello() {
        return "Howdy";
    }

    //Syntax Exercise
    /*public static void main(String[] args) {
        byte b = 10;
        short s = 32760;
        int i = 2000000;
        long l = 90000000;
        float f = 2;
        double d = 23.33;
        char c = 4;
        boolean boo = true;
        char noInt = (char)i;
        //int class = 3;
        //int drum;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(boo);
        System.out.println(noInt);
        //System.out.println(drum);
    }*/
    // Console I/O Exercise
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter an integer: ");
        //userInput = sc.nextLine();
        //System.out.println("You entered: " + userInput);

//        System.out.print("Enter a sentence: ");
//        userInput = sc.next();
//        System.out.println(userInput);

        System.out.print("Enter three words: ");
        userInput = sc.next();
        System.out.println(userInput);

            }
    }

