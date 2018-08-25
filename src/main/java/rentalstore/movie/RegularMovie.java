package rentalstore.movie;

public class RegularMovie extends Movie{
    public RegularMovie(String title) {
        super(title);
    }

    public double getAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount += 2;
        if(dayRented > 2){
            thisAmount += (dayRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
