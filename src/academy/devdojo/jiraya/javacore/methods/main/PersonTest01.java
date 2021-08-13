package academy.devdojo.jiraya.javacore.methods.main;

import academy.devdojo.jiraya.javacore.methods.models.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jiraya");
        person.setAge(51);
        person.print();
    }
}
