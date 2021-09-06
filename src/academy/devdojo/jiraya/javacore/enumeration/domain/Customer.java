package academy.devdojo.jiraya.javacore.enumeration.domain;

public class Customer {
    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer: " + this.name + " - " 
                + this.customerType + 
                "(" + this.customerType.VALUE + ") - "
                + this.paymentType; 
    }
}
