package academy.devdojo.jiraya.javacore.exception.exception.models;

import java.io.IOException;

public class Person {

    public void save() throws InvalidLoginException, IOException {
        System.out.println("Saving person...");
    }
}
