/**
 * Created by NicholasTurner on 11/21/16.
 */
import java.util.Scanner;
public class BattingStats {
    public static void main(String[] args) {
        double battingAverage;
        double sluggingPercentage;
        double atBats;
        double basesEarned;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the number of at bats?");
        atBats = input.nextDouble();
        System.out.println("What is the number of bases earned by the batter?");
        basesEarned = input.nextDouble();

        System.out.println("Another Batter?");
    }
}
