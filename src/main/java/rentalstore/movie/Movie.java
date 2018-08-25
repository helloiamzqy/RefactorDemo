package rentalstore.movie;

public abstract class Movie {
//    public static final int CHILDRENS = 2;
//    public static final int REGULAR = 0;
//    public static final int NEW_RELEASE = 1;

    private String title;


    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getAmount(int dayRented);

    public double getFrequentRenterPoints( int dayRented) {
        double frequentRenterPoints = 1 ;
        return frequentRenterPoints;
    }
}
