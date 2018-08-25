package rentalstore;

import org.junit.Assert;
import org.junit.Test;


public class CustomerTest {
    private Customer customer = new Customer("Dunn");
    @Test
    public void should_return_correct_statement_given_customer_has_no_rental() {
        customer.setStatement(new RentalStatement());
        String statement = customer.getStatementInfo();
        Assert.assertEquals("Rental Record for Dunn\nAmount owed is0.0\nYou earned0 frequent renter points", statement);
    }
}
