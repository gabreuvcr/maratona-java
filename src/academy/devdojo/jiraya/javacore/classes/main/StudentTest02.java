package academy.devdojo.jiraya.javacore.classes.main;

import academy.devdojo.jiraya.javacore.classes.models.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student();
        
        studentA.name = "Sanji";
        studentA.age = 21;
        studentA.gender = 'M';

        studentB.name = "Zoro";
        studentB.age =  21;
        studentB.gender = 'M';

        System.out.println(studentA.name);
        System.out.println(studentA.age);
        System.out.println(studentA.gender);

        System.out.println(studentB.name);
        System.out.println(studentB.age);
        System.out.println(studentB.gender);
    }
}
