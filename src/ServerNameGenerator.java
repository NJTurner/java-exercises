/**
 * Created by NicholasTurner on 11/21/16.
 */
import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"Green", "Fat", "Tall", "Skinny", "Short", "Cool", "Hot", "Red", "Long", "Thin"};
        String[] nouns = {"House", "Car", "Egg", "Lady", "Man", "Boy", "Girl", "Lake", "River", "Ball"};

        int a = (int) (Math.random() * adjectives.length);
        int n = (int) (Math.random() * nouns.length);
        System.out.println("Your server name is " + adjectives[a] + " " + nouns[n]);
    }
}
