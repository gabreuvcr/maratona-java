package academy.devdojo.jiraya.javacore.abstractclasses.main;

import academy.devdojo.jiraya.javacore.abstractclasses.models.Developer;
import academy.devdojo.jiraya.javacore.abstractclasses.models.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Zoro", 12000);

        manager.print();
        developer.print();
    }
}
