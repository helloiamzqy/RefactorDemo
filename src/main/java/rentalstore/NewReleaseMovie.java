package rentalstore;

public class NewReleaseMovie extends Movie{
    public NewReleaseMovie(String title) {
        super(title);
    }

    double getAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount+= dayRented*3;
        return thisAmount;
    }
}
