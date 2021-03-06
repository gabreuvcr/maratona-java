package academy.devdojo.jiraya.javacore.inheritance.test;

import academy.devdojo.jiraya.javacore.inheritance.domain.Address;
import academy.devdojo.jiraya.javacore.inheritance.domain.Employee;
import academy.devdojo.jiraya.javacore.inheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("W 55th St");
        address.setCep("012345-679");

        Person person = new Person("Katsuki", "123.456.789-12");
        person.setAddress(address);

        person.print();
        System.out.println();

        Employee employee = new Employee("Midoriya", "987.654.321-21", 2536.52);
        employee.setAddress(address);
        employee.print();
        employee.paymentReport();

    }
}
