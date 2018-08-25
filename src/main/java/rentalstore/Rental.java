package rentalstore;

import rentalstore.movie.Movie;
import rentalstore.movie.NewReleaseMovie;

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

    public double getFrequentRenterPoints() {
      return movie.getFrequentRenterPoints(dayRented);
    }
    public double getAmount(){
        return movie.getAmount(dayRented);
    }

}
