package moviecategories;

/**
 * Created by NicholasTurner on 11/30/16.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MovieOrganizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choice = "";
        String name = "";
        boolean run = true;
        ArrayList<Movies> list = new ArrayList<Movies>();

        list.add(new Movies("Star Wars", "Science Fiction"));
        list.add(new Movies("Arrival", "Science Fiction"));
        list.add(new Movies("Alien", "Science Fiction"));
        list.add(new Movies("Friday the 13th", "Horror"));
        list.add(new Movies("It Follows", "Horror"));
        list.add(new Movies("Moana", "Animated"));
        list.add(new Movies("Trolls", "Animated"));
        list.add(new Movies("Ice Age", "Animated"));
        list.add(new Movies("The Notebook", "Drama"));
        list.add(new Movies("Oldboy", "Drama"));

        System.out.println("Welcome to the Movie List Application!");
        System.out.println("There are 10 movies in this list.");

        while (run) {
            System.out.println("What category are you interested in? "
                    + "(select \"Science Fiction\", \"Horror\", \"Animated\" or \"Drama\")");
            name = input.nextLine();

            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i).getCategory().equalsIgnoreCase(name))) {
                    System.out.println(list.get(i).getTitle());
                }
            }


            System.out.println("\nWould you like to choose another category? (yes or no)");
            choice = input.nextLine();


            if (choice.equalsIgnoreCase("yes")) {
                run = true;
            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                run = false;
            }
        }
        input.close();
    }
}