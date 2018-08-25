package rentalstore;

public class HtmlStatement extends Statement {
    @Override
    protected String getCenterString(double thisAmount, String title) {
        String conter =title + ": " + String.valueOf(thisAmount) + "<BR>\n";
        return conter;
    }

    @Override
    protected String getHeaderString(String name) {
        String header = "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
        return header;
    }

    @Override
    protected String getFooterString(double totalAmount, int frequentRenterPoints) {
        String fooder= "<P>You owe<EM>" + String.valueOf(totalAmount) + "</EM><P>\n";
        fooder += "On this rental you earned <EM>" + String.valueOf(frequentRenterPoints) +
                "</EM> frequent renter points<P>";
        return fooder;
    }
}
