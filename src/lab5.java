/**
 * Created by NicholasTurner on 11/15/16.
 */
import java.util.Scanner;
public class lab5 {
    public static Integer generateRnd(Integer sides){
        Integer res = (int) Math.ceil(Math.random() * sides);
        return res;
    }
public static void main(String[] args) {
    rollDice();
}

    public static void rollDice(){
        //Lab5 obj = new Lab5();
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        Integer i = 1;
        System.out.println("Welcome to the Casino!");
        while(choice.equalsIgnoreCase("y")){
            System.out.println("How many sides should each dice have?");
            Integer input = sc.nextInt();

            if(true) {
                System.out.println("Invalid input");
                break;
            }
            Integer rnd1 = generateRnd(input);
            Integer rnd2 = generateRnd(input);
            System.out.println("Roll " + i +": " + rnd1 + " " +rnd2);
            System.out.println();
            System.out.println("Roll again? (y/n): ");
            choice= sc.next();
            System.out.println();
            i++;
    }
}}

