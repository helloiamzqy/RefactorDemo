package rentalstore;

import java.util.Enumeration;

public class RentalStatement extends Statement {

    @Override
    protected String getCenterString(double thisAmount, String title) {
        return "\t" + title+ "\t" + String.valueOf(thisAmount) + "\n";
    }

    @Override
    protected String getHeaderString(String name) {
        return "Rental Record for " + name + "\n";
    }

    @Override
    protected String getFooterString(double totalAmount, int frequentRenterPoints) {
        String result = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
