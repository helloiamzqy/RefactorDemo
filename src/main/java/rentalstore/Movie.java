package rentalstore;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    double getAmount(int dayRented) {
        double thisAmount = 0;
        switch (getPriceCode()){
            case REGULAR:
                thisAmount += 2;
                if(dayRented > 2){
                    thisAmount+=(dayRented - 2) * 1.5;
                 }
                break;
            case NEW_RELEASE:
                thisAmount+= dayRented*3;
                break;
            case CHILDRENS:
                    thisAmount+=1.5;
                    if(dayRented > 3){
                        thisAmount += (dayRented -3)*1.5;
                    }
                    break;
        }
        return thisAmount;
    }
}
