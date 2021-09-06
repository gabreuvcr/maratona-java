package academy.devdojo.jiraya.javacore.polymorphism.domain;

import academy.devdojo.jiraya.javacore.polymorphism.repository.Repository;

public class MemoryRepository implements Repository{

    @Override
    public void save() {
        System.out.println("Saving to memory...");
    }
}
