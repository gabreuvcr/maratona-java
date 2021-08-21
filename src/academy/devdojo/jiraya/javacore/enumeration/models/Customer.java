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
        return "Customer: " + this.name + " - " 
                + this.type + 
                "(" + this.type.VALUE + ")"; 
    }
}
