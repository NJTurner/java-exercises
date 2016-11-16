/**
 * Created by NicholasTurner on 11/16/16.
 */
public class MyValidator {
    public static void main(String[] args) {
        OOValidator validator = new OOValidator();
        int min = 1;
        int max = 100;
        String prompt = "Enter a number between " + min + " and " + max;
        int userInteger;

        userInteger = validator.getIntWithinRange(prompt, min, max);

        System.out.println("The user entered " + userInteger);
    }
}

