package academy.devdojo.jiraya.javacore.polymorphism.models;

import academy.devdojo.jiraya.javacore.polymorphism.repository.Repository;

public class FileRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Saving to a file...");
    }
}
