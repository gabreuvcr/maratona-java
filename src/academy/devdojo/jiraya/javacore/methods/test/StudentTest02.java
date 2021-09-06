package academy.devdojo.jiraya.javacore.methods.test;

import academy.devdojo.jiraya.javacore.methods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        
        student1.name = "Midoriya";
        student1.age = 15;
        student1.gender = 'M';

        student2.name = "Sakura";
        student2.age = 16;
        student2.gender = 'F';

        student1.print();
        student2.print();
    }
}
