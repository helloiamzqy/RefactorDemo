package rentalstore.movie;

public class NewReleaseMovie extends Movie{
    public NewReleaseMovie(String title) {
        super(title);
    }

    public double getAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount+= dayRented*3;
        return thisAmount;
    }

    @Override
    public double getFrequentRenterPoints(int dayRented) {
        if(dayRented> 1){
           return 2;
        }
        return 1;
    }
}
