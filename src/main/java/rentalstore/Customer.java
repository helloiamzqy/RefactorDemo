package rentalstore;

import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();
    Statement statement;

    public void setName(String name) {
        this.name = name;
    }

    public Vector getRentals() {
        return rentals;
    }

    public void setRentals(Vector rentals) {
        this.rentals = rentals;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String getStatementInfo(){
        return statement.getStatement(this);
    }
}
