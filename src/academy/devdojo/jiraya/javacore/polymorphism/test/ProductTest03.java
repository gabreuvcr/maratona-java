package academy.devdojo.jiraya.javacore.polymorphism.test;

import academy.devdojo.jiraya.javacore.polymorphism.domain.Computer;
import academy.devdojo.jiraya.javacore.polymorphism.domain.Product;
import academy.devdojo.jiraya.javacore.polymorphism.domain.Tomato;
import academy.devdojo.jiraya.javacore.polymorphism.services.TaxCalculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        
        Tomato tomato = new Tomato("American", 20);
        tomato.setExpirationDate("11/12/2021");

        TaxCalculator.calculateTax(tomato);
        System.out.println("----------");
        TaxCalculator.calculateTax(product);
    }
}
