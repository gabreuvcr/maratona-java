package academy.devdojo.jiraya.javacore.association.main;

import academy.devdojo.jiraya.javacore.association.models.Local;
import academy.devdojo.jiraya.javacore.association.models.Seminar;
import academy.devdojo.jiraya.javacore.association.models.Student;
import academy.devdojo.jiraya.javacore.association.models.Teacher;

public class AssociationTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Student naruto = new Student("Naruto", 14);
        Student sakura = new Student("Sakura", 13);
        Student sasuke = new Student("Sasuke", 14);
        Teacher kakashi = new Teacher("Kakashi", "Chidori");
        
        Student[] students = new Student[] {naruto, sakura, sasuke};
        
        Seminar seminar = new Seminar("How to work in a team", students, local);

        Seminar[] seminars = new Seminar[] {seminar};

        kakashi.setSeminars(seminars);

        kakashi.print();
    }
}
