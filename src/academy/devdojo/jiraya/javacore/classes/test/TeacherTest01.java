package academy.devdojo.jiraya.javacore.classes.test;

import academy.devdojo.jiraya.javacore.classes.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Kami";
        teacher.age = 140;
        teacher.gender = 'M';

        System.out.print(teacher.name + " ");
        System.out.print(teacher.age + " ");
        System.out.println(teacher.gender);
    }
}
