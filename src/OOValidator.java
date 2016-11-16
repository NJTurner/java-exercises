/**
 * Created by NicholasTurner on 11/16/16.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class OOValidator {
    //This is the class with all the validating methods
    public int getInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        System.out.println(prompt);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            return getInt(prompt);
        }
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInput = getInt(prompt);
        try{
            if(userInput < min || userInput > max) {
                throw new InputMismatchException();
            }
            return userInput;
        }catch (InputMismatchException e) {
            return getIntWithinRange(prompt, min, max);
        }
    }
}
