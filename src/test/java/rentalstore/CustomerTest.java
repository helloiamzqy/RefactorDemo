package rentalstore;
import org.junit.Assert;
import org.junit.Test;
import rentalstore.movie.*;
import rentalstore.statement.HtmlStatement;
import rentalstore.statement.RentalStatement;

import static org.junit.Assert.assertEquals;


public class CustomerTest {
    private Customer customer = new Customer("Dunn");
    @Test
    public void should_return_correct_statement_given_customer_has_no_rental() {
        customer.setStatement(new RentalStatement());
        String statement = customer.getStatementInfo();
        Assert.assertEquals("Rental Record for Dunn\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);
    }
    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_regular_movie_for_1_day() {
        customer.setStatement(new RentalStatement());
        Movie regularMovie = new RegularMovie("Titanic");
        Rental oneDayRental = new Rental(regularMovie, 1);
        customer.addRental(oneDayRental);

        String statement = customer.getStatementInfo();

        assertEquals("Rental Record for Dunn\n" +
                "\t" + regularMovie.getTitle() + "\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }
    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_1_day() {
        Movie newReleaseMovie = new NewReleaseMovie("Titanic");
        Rental oneDayRental = new Rental(newReleaseMovie, 1);
        customer.addRental(oneDayRental);
        customer.setStatement(new RentalStatement());
        String statement =customer.getStatementInfo();

        assertEquals("Rental Record for Dunn\n" +
                "\t" + newReleaseMovie.getTitle() + "\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_2_day() {
        Movie newReleaseMovie = new NewReleaseMovie("Titanic");
        Rental twoDayRental = new Rental(newReleaseMovie, 2);
        customer.addRental(twoDayRental);
        customer.setStatement(new RentalStatement());
        String statement =customer.getStatementInfo();

        assertEquals("Rental Record for Dunn\n" +
                "\t" + newReleaseMovie.getTitle() + "\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_1_day() {
        Movie childrenMovie = new ChildrenMovie("Titanic");
        Rental oneDayRental = new Rental(childrenMovie, 1);
        customer.addRental(oneDayRental);
        customer.setStatement(new RentalStatement());
        String statement = customer.getStatementInfo();

        assertEquals("Rental Record for Dunn\n" +
                "\t" + childrenMovie.getTitle() + "\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_4_day() {
        Movie childrenMovie = new ChildrenMovie("Titanic");
        Rental fourDayRental = new Rental(childrenMovie, 4);
        customer.addRental(fourDayRental);
        customer.setStatement(new RentalStatement());
        String statement = customer.getStatementInfo();

        assertEquals("Rental Record for Dunn\n" +
                "\t" + childrenMovie.getTitle() + "\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_html_statement_given_customer_has_rent_one_child_movie_for_4_day() {
        Movie childrenMovie = new ChildrenMovie("Titanic");
        Rental fourDayRental = new Rental(childrenMovie, 4);
        customer.setStatement(new HtmlStatement());
        customer.addRental(fourDayRental);

        String statement = customer.getStatementInfo();

        System.out.println(statement);

        assertEquals("<H1>Rentals for <EM>Dunn</EM></H1><P>\n" +
                "Titanic: 3.0<BR>\n" +
                "<P>You owe<EM>3.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }


}
