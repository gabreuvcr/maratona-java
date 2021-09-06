package academy.devdojo.jiraya.javacore.abstractclasses.test;

import academy.devdojo.jiraya.javacore.abstractclasses.domain.Developer;
import academy.devdojo.jiraya.javacore.abstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Zoro", 12000);

        manager.print();
        developer.print();
    }
}
