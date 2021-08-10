package academy.devdojo.jiraya.javacore.introducaometodos.test;

import academy.devdojo.jiraya.javacore.introducaometodos.domain.Printer;
import academy.devdojo.jiraya.javacore.introducaometodos.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Printer printer = new Printer();
        
        student1.name = "Midoriya";
        student1.age = 15;
        student1.gender = 'M';

        student2.name = "Sakura";
        student2.age = 16;
        student2.gender = 'F';

        printer.print(student1);
        printer.print(student2);


    }
}
