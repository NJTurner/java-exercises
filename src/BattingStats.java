/**
 * Created by NicholasTurner on 11/21/16.
 */

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

//procedural
//as a series of steps towards a goal (output)

//00 code
//has layers
//* Input
//* Output
//* Logic for the batters

//cohesion

//luis code
public class BattingStats {
    public static void main(String[] args) {
        int numberAtBats;
        PlayerConsole console = new PlayerConsole(new Scanner(System.in), System.out);
        do {
            numberAtBats = console.getNumberAtBats();
            Player player = new Player(new int[numberAtBats]);

            console.getAtBatsInformation(player, numberAtBats);

            console.showPlayerSummary(
                    player.battingAverage(),
                    player.sluggingAverage()
            );

        } while ("y".equalsIgnoreCase(console.getAnotherBatter()));
    }

    //my code
//    public static void main(String[] args) {
//        double battingAverage;
//        double sluggingPercentage;
//        int bats;
//        int basesEarned;
//        String[] players;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the number of times at bat:");
//        bats = input.nextInt();
//        int atBats[] = new int[bats];
//        System.out.println("What is the number of bases earned by the batter?  0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run");
//
//        for (int i = 0; i < atBats.length; i++) {
//            atBats[i] = input.nextInt();
//        }
//        printArray(atBats);
//
//        basesEarned = IntStream.of(atBats).sum();
//        battingAverage = //hits/at bats;
//                sluggingPercentage = ((double) basesEarned) / ((double) bats);
//        System.out.println("Batting average: " + battingAverage);
//        System.out.println("Slugging percentage: " + sluggingPercentage);
//        System.out.println("Another Batter? (y/n): ");
//    }
//
//    public static void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
}
