package academy.devdojo.jiraya.javacore.polymorphism.test;

import academy.devdojo.jiraya.javacore.polymorphism.domain.DatabaseRepository;
import academy.devdojo.jiraya.javacore.polymorphism.repository.Repository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepository();
        repository.save();
    }
}
