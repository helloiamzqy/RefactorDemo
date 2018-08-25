package rentalstore.movie;

import rentalstore.movie.Movie;

public class LiteraryMovie extends Movie {
    public LiteraryMovie(String title) {
        super(title);
    }

    public double getAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount+=6;
        return thisAmount;
    }

    @Override
    public double getFrequentRenterPoints(int dayRented) {
        double frequentRenterPoints = 1.5;
        return frequentRenterPoints;
    }
}
