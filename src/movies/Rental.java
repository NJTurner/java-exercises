package movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NicholasTurner on 11/30/16.
 */
public class Rental {
    //Many movies
//    private List<Movie>movies  = new ArrayList<>();
//    private List<Integer> days = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();

//    public void addMovie(Movie movie, int days){
//        movies.add(movie);
//        this.days.add(days);
//    }

    public void addRent(double price) {
        prices.add(price);
    }

    public int moviesRentedCount() {
        return prices.size();
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }
}
