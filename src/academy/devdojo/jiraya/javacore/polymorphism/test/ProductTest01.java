package academy.devdojo.jiraya.javacore.polymorphism.test;

import academy.devdojo.jiraya.javacore.polymorphism.domain.Computer;
import academy.devdojo.jiraya.javacore.polymorphism.domain.Television;
import academy.devdojo.jiraya.javacore.polymorphism.domain.Tomato;
import academy.devdojo.jiraya.javacore.polymorphism.services.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Cereja Tomato", 10);
        Television television = new Television("Samsung 50\"", 5000);

        TaxCalculator.calculateTax(computer);
        System.out.println("---------------");
        TaxCalculator.calculateTax(tomato);
        System.out.println("---------------");
        TaxCalculator.calculateTax(television);
    }
}
