package game;


import validation.Validator;

public class RoshamboApp {
    public static void main(String[] args) {
        Validator.getString("Enter your Name: ");
//        Validator.getIntWithinRange( "Who do you want to play with: 1) Computer Player, 2) Human-Controlled Player, 3) Rock Only Player", 1, 3);
//        //this might be part of generateRoshambo in HumanPlayer
//
//        System.out.println("Choose one: ");
//        System.out.println("1) Rock");
//        System.out.println("2) Paper");
//        System.out.println("3) Scissors");
//
//        //Determine the winner
        int playerSelection;

        String message = "Who do you want to play with? " +
                "\n 1) Computer Player" +
                "\n 2) Human Player" +
                "\n 3) Rock Player";

        playerSelection = Validator.getInt(message);

        // instantiate the appropriate player object
        Player opponent;
        if (playerSelection == 1) {
            opponent = new ComputerPlayer();
        } else if (playerSelection == 2) {
            opponent = new HumanPlayer();
        } else {
            opponent = new RockPlayer();
        }

        String opponentChoice = opponent.generateRoshambo();

        // create a new player object to represent the human player playing the game
        Player player = new HumanPlayer();
        String playerChoice = player.generateRoshambo();

        // Still need to add all the different comparissons
        // probably want to move them onto the enum Roshambo
        // and make a compareChoice() method on Roshambo
        // to hide or to encapsulate all this detail
        if (playerChoice.equals(opponentChoice)) {
            System.out.println("Tie!");
        } else if (playerChoice.equals("ROCK") && opponentChoice.equals("PAPER")) {
            opponent.gamesWon++;
            player.gamesLost++;
            System.out.println("You lose!");
        } else if (playerChoice.equals("ROCK") && opponentChoice.equals("SCISSOR")) {
            opponent.gamesLost++;
            player.gamesWon++;
            System.out.println("Smashy smashy, you win!");
        }

        opponent.numberOfGamesPlayed++;
        player.numberOfGamesPlayed++;
    }
}

