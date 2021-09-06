package academy.devdojo.jiraya.javacore.enumeration.test;

import academy.devdojo.jiraya.javacore.enumeration.domain.Customer;
import academy.devdojo.jiraya.javacore.enumeration.domain.CustomerType;
import academy.devdojo.jiraya.javacore.enumeration.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Sasuke", CustomerType.PESSOA_FISICA, PaymentType.CREDITO);
        Customer customer2 = new Customer("Kakashi", CustomerType.PESSOA_JURIDICA, PaymentType.DEBITO);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBITO.calculateDiscount(100));
        System.out.println(PaymentType.CREDITO.calculateDiscount(100));
        System.out.println(CustomerType.customerTypePerValue(1));
        System.out.println(CustomerType.customerTypePerValue(2));
    }
}
