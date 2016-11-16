/**
 * Created by NicholasTurner on 11/16/16.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class HighLowGame {
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int number = random.nextInt(101);
//        System.out.println(number);
//        int guess = 0;
//        while (guess != number) {
//            System.out.print("Enter your guess: ");
//            guess = scanner.nextInt();
//            if (guess > 100 || guess < 1) {
//                System.out.println("The number has to be between 1 and 100");
//                continue;
//            }
//            if (guess < number) {
//                System.out.println("HIGHER, Try Again!");
//            } else if (guess > number) {
//                System.out.println("LOWER, Try Again!");
//            } else {
//                System.out.println("Correct, the number was " + number);
//            }
//        }
//        scanner.close();
//    }
    //RyanCode
    public static void main(String[] args) {
        //Wishful thinking == pretend the methods are there already
        //rand = getRandomInt();
        //userGuess = getUserGuess();
        //validateInput();
        //compareAndShowOutput(userGuess, rand);
        Scanner sc = new Scanner(System.in);
        String userWantsToContinue;

        do {
            playHighLowGame();
            System.out.println("Do you want to play again? y/n");
            userWantsToContinue = sc.next();
        } while (userWantsToContinue.equalsIgnoreCase("y") || userWantsToContinue.equalsIgnoreCase("n"));
        System.out.println("Thank you for playing");
        sc.close();
    }

    public static void playHighLowGame(){
        int random;
        int userGuess;


        random = getRandomInt();
        do {
            userGuess = getUserGuess();
            if (random > userGuess) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        } while (random != userGuess);
        System.out.println("Good Guess!");
    }

    public static int getRandomInt(){
        return (int) Math.ceil(Math.random() * 100);
    }

    public static int getUserGuess(){
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 100:");
        try{
            userInput = sc.nextInt();
            if(userInput < 1 || userInput > 100){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Guess must be an integer");
            return getUserGuess();
        }
        return userInput;
    }
}


