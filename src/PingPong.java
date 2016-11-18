/**
 * Created by NicholasTurner on 11/16/16.
 */

import java.util.Scanner;

public class PingPong {
    private static final int LEFT = 0;
    private static final int RIGHT = 1;
    private static final int MAX_SCORE = 7;

    public static void main(String[] args) {
        int playerScore = 0;
        int cpuScore = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("User turn");
            if (isGuessCorrect(playerSide(input), cpuSide())) {
                playerScore++;
            }
            showScores(playerScore, cpuScore);

            System.out.println("CPU turn");
            if (isGuessCorrect(cpuSide(), playerGuess(input))) {
                cpuScore++;
            }
            showScores(playerScore, cpuScore);

        } while (isGameOver(playerScore, cpuScore));

        if (isWinner(playerScore)) {
            System.out.println("Player won!!!");
        } else {
            System.out.println("CPU won!!!");
        }
    }

    private static boolean isWinner(int score) {
        return score == MAX_SCORE;
    }

    private static boolean isGameOver(int playerScore, int cpuScore) {
        return playerScore < MAX_SCORE && cpuScore < MAX_SCORE;
    }

    private static boolean isGuessCorrect(long target, long guess) {
        return guess == target;
    }

    private static void showScores(int playerScore, int cpuScore) {
        System.out.printf(
                "Player score is %d, CPU score is %d%n",
                playerScore,
                cpuScore
        );
    }

    private static long playerGuess(Scanner input) {
        System.out.println(
                "What side of the table the ball is going to? (left or right)"
        );
        return sideToNumber(input.next());
    }

    private static long playerSide(Scanner input) {
        System.out.println(
                "What side of the table you would like to swing? (left or right)"
        );
        return sideToNumber(input.next());
    }

    private static long sideToNumber(String side) {
        return (long) ("left".equalsIgnoreCase(side) ? LEFT : RIGHT);
    }
    private static long cpuSide() {
        return Math.round(Math.random());
    }
}

