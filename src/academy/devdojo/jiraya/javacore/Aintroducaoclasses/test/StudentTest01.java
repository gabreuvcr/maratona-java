package academy.devdojo.jiraya.javacore.Aintroducaoclasses.test;

import academy.devdojo.jiraya.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Luffy";
        student.age = 21;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
