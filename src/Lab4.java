/**
 * Created by NicholasTurner on 11/15/16.
 */
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args){

        calculateFactorial();

    }

    public static void calculateFactorial(){
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        System.out.println("Welcome to the Factorial Calculator!");
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Enter an integer that’s greater than 0 but less than 10: ");
            Integer input = sc.nextInt();
            Long fact = 1L;

            if(input <= 0 || input > 10  ){
                System.out.println("The input is not valid");
                break;
            }

            String output = "1";

            for (int i=1;i<=input;i++){
                fact = fact * i;
                if(i != 1) {
                    output += " x " + i;
                }
                System.out.println(i+"! = "+output+" = "+fact);

            }

            System.out.println("The factorial of "+input+" is "+fact);
            System.out.println("Do you wish to continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }

    }
}