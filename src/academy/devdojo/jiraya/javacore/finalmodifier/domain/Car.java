package academy.devdojo.jiraya.javacore.finalmodifier.domain;

public class Car {
    private String name;
    public static final double LIMIT_SPEED = 250;
    public final Customer CUSTOMER = new Customer();

    public Car(String name) {
        this.name = name;
    }

    public final void print() {
        System.out.println("Name: " + this.name);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
