package academy.devdojo.jiraya.javacore.exception.exception.models;

import java.io.FileNotFoundException;

public class Employee extends Person {

    @Override
    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving employee...");
    }
}
