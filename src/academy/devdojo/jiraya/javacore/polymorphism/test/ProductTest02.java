package academy.devdojo.jiraya.javacore.polymorphism.test;

import academy.devdojo.jiraya.javacore.polymorphism.domain.Computer;
import academy.devdojo.jiraya.javacore.polymorphism.domain.Product;
import academy.devdojo.jiraya.javacore.polymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("Ryzen 9", 3000);
        System.out.println(product1.getName());
        System.out.println(product1.getValue());
        System.out.println(product1.calculateTax());

        System.out.println("---------");
        
        Product product2 = new Tomato("American", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculateTax());
    }
}
