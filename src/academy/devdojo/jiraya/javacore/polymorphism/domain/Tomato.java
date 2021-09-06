package academy.devdojo.jiraya.javacore.polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX = 0.06;
    private String expirationDate;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tomato tax...");
        return this.value * Tomato.TAX;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
