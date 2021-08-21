package academy.devdojo.jiraya.javacore.enumeration.models;

public class Customer {
    private String name;
    private CustomerType type;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer: " + this.name + " - " + this.type; 
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getType() {
        return this.type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
