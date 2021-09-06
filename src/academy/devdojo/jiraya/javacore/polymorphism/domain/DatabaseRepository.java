package academy.devdojo.jiraya.javacore.polymorphism.domain;

import academy.devdojo.jiraya.javacore.polymorphism.repository.Repository;

public class DatabaseRepository implements Repository {
    
    @Override
    public void save() {
        System.out.println("Saving to a database...");
    }
}
