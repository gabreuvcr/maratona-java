package academy.devdojo.jiraya.javacore.polymorphism.main;

import academy.devdojo.jiraya.javacore.polymorphism.models.DatabaseRepository;
import academy.devdojo.jiraya.javacore.polymorphism.models.FileRepository;
import academy.devdojo.jiraya.javacore.polymorphism.repository.Repository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepository();
        repository.save();
    }
}
