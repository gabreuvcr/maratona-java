package academy.devdojo.jiraya.javacore.polymorphism.services;

import academy.devdojo.jiraya.javacore.polymorphism.models.Computer;
import academy.devdojo.jiraya.javacore.polymorphism.models.Tomato;

public class TaxCalculator {
    public static void calculateComputerTax(Computer computer) {
        System.out.println("Computer tax report");
        double tax = computer.calculateTax();
        System.out.println("Computer " + computer.getName());
        System.out.println("Value: " + computer.getValue());
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (computer.getValue() + tax));
    }

    public static void calculateTomatoTax(Tomato tomato) {
        System.out.println("Tomato tax report");
        double tax = tomato.calculateTax();
        System.out.println("Tomato " + tomato.getName());
        System.out.println("Value: " + tomato.getValue());
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (tomato.getValue() + tax));
    }
}
