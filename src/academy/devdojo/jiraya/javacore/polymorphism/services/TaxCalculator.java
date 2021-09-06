package academy.devdojo.jiraya.javacore.polymorphism.services;

import academy.devdojo.jiraya.javacore.polymorphism.domain.Product;
import academy.devdojo.jiraya.javacore.polymorphism.domain.Tomato;

public class TaxCalculator {

    public static void calculateTax(Product product) {
        System.out.println("Tax report");
        double tax = product.calculateTax();
        System.out.println("Product " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (product.getValue() + tax));
        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println("Expiration date: " + tomato.getExpirationDate());
        }
    }
}
