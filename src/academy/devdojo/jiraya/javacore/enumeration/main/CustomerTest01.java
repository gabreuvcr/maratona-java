package academy.devdojo.jiraya.javacore.enumeration.main;

import academy.devdojo.jiraya.javacore.enumeration.models.Customer;
import academy.devdojo.jiraya.javacore.enumeration.models.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Sasuke", CustomerType.PESSOA_FISICA);
        Customer customer2 = new Customer("Kakashi", CustomerType.PESSOA_JURIDICA);

        System.out.println(customer1);
        System.out.println(customer2);

    }
}
