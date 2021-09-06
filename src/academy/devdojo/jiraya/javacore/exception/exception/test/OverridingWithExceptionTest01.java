package academy.devdojo.jiraya.javacore.exception.exception.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import academy.devdojo.jiraya.javacore.exception.exception.domain.Employee;
import academy.devdojo.jiraya.javacore.exception.exception.domain.InvalidLoginException;
import academy.devdojo.jiraya.javacore.exception.exception.domain.Person;

public class OverridingWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            person.save();
        } catch (InvalidLoginException | IOException e) {
            e.printStackTrace();
        }
        
        try {
            employee.save();
        } catch (InvalidLoginException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
