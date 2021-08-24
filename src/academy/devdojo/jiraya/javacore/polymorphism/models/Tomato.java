package academy.devdojo.jiraya.javacore.polymorphism.models;

public class Tomato extends Product {
    public static final double TAX = 0.06;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tomato tax...");
        return this.value * Tomato.TAX;
    }
}
