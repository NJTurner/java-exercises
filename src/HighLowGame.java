/**
 * Created by NicholasTurner on 11/16/16.
 */

import java.util.Scanner;
import java.util.Random;

public class HighLowGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(101);
        System.out.println(number);
        int guess = 0;
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if(guess > 100 || guess < 1){
                System.out.println("The number has to be between 1 and 100");
                continue;
            }
            if (guess < number) {
                System.out.println("HIGHER, Try Again");
            } else if (guess > number) {
                System.out.println("LOWER, Try Again!");
            } else {
                System.out.println("Correct, the number was " + number);
            }
        }
        scanner.close();
    }
}


