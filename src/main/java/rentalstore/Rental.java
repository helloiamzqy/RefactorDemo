package rentalstore;

public class Rental {
    Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    int getFrequentRenterPoints() {
        int frequentRenterPoints = 1 ;
        if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1){
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
    public double getAmount(){
        return movie.getAmount(dayRented);
    }
}
