package rentalstore;

import java.util.Enumeration;

public abstract class Statement {
    public String getStatement(Customer customer){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = customer.getRentals().elements();
        String result = getHeaderString(customer.getName());
        while(rentals.hasMoreElements()){
            double thisAmount =0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = each.getAmount();

            //add frequent renter points
            //add bonus for a two day new release rental
            frequentRenterPoints += each.getFrequentRenterPoints();

            //show figures for this rental
            result += getCenterString(thisAmount, each.getMovie().getTitle());
            totalAmount += thisAmount;
        }

        //add footer lines
        result += getFooterString(totalAmount, frequentRenterPoints);
        return result;
    }

    protected abstract String getCenterString(double thisAmount, String title);

    protected abstract String getHeaderString(String name);

    protected abstract String getFooterString(double totalAmount, int frequentRenterPoints);
}
