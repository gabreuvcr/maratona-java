package academy.devdojo.jiraya.javacore.polymorphism.main;

import academy.devdojo.jiraya.javacore.polymorphism.models.Computer;
import academy.devdojo.jiraya.javacore.polymorphism.models.Tomato;
import academy.devdojo.jiraya.javacore.polymorphism.services.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Cereja Tomato", 10);

        TaxCalculator.calculateComputerTax(computer);
        System.out.println("---------------");
        TaxCalculator.calculateTomatoTax(tomato);
    }
}
