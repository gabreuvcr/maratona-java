package academy.devdojo.jiraya.javacore.introducaometodos.domain;

public class Printer {
    
    public void print(Student student) {
        System.out.println("-----");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
