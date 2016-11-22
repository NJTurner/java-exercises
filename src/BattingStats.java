/**
 * Created by NicholasTurner on 11/21/16.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.*;

//luis code
public class BattingStats {
    public static void main(String[] args) {
        int numberAtBats;
        int[] atBats;//declaring a variable
        String anotherBatter;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the number of at-bats:");
            numberAtBats = scanner.nextInt();

            atBats = new int[numberAtBats];

            for (int i = 0; i < atBats.length; i++) {
                System.out.println("How many bases did the player earn up at bat this time?");
                atBats[i] = getBasesEarned(scanner);
            }

            double battingAverage = calculateBattingAverage(atBats);
            double sluggingAverage = calculateSluggingAverage(atBats);

            System.out.printf("Batting Average: %.3f, Slugging Average : %.3f\n",
                    battingAverage,
                    sluggingAverage
            );
            anotherBatter = getAnotherBatter(scanner);
        } while ("y".equalsIgnoreCase(anotherBatter));
    }

    private static double calculateSluggingAverage(int[] atBats) {
        double sumOfBases;
        sumOfBases = 0;
        for (int numberOfBases : atBats) {
            sumOfBases += numberOfBases;
        }
        return sumOfBases / atBats.length;
    }

    private static double calculateBattingAverage(int[] atBats) {
        double sumOfBases = 0;
        for (int numberOfBases : atBats) {
            if (numberOfBases > 0) {
                sumOfBases++;
            }
        }
        return sumOfBases / atBats.length;
    }

    private static String getAnotherBatter(Scanner scanner) {
        System.out.println("Another Batter? (y/n)");
        String anotherBatter = scanner.next();
        return anotherBatter;
    }

    private static int getBasesEarned(Scanner scanner) {
        try {
            int bases = scanner.nextInt();
            if (bases < 0 || bases > 4) {
                System.out.println("Please enter a number between 0 and 4");
                return getBasesEarned(scanner);
            }
            return bases;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
            return getBasesEarned(scanner);
        }
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
