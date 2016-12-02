package moviecategories;

class Movies {

    private String title = "";
    private String category = "";


    String getTitle() {
        return title;
    }

    String getCategory() {
        return category;
    }

    Movies(String title, String category) {
        //super();
        this.title = title;
        this.category = category;
    }

//    public int moviesInCategory(){
//        return movies.size();
//    }

}
