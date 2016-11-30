package moviecategories;

/**
 * Created by NicholasTurner on 11/30/16.
 */

import java.util.List;
import java.util.ArrayList;

public class Movies {

    private String title = "";
    private String category = "";
    private List<Integer> movies = new ArrayList<>();


    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Movies(String title, String category) {
        //super();
        this.title = title;
        this.category = category;
    }

//    public int moviesInCategory(){
//        return movies.size();
//    }

    public static void add(String title, String category) {
    }
}
