package academy.devdojo.jiraya.javacore.polymorphism.main;

import academy.devdojo.jiraya.javacore.polymorphism.models.Computer;
import academy.devdojo.jiraya.javacore.polymorphism.models.Product;
import academy.devdojo.jiraya.javacore.polymorphism.models.Tomato;

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
