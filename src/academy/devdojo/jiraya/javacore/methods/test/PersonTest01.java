package academy.devdojo.jiraya.javacore.methods.test;

import academy.devdojo.jiraya.javacore.methods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jiraya");
        person.setAge(51);
        person.print();
    }
}
