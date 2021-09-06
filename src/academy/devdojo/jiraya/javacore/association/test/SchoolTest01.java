package academy.devdojo.jiraya.javacore.association.test;

import academy.devdojo.jiraya.javacore.association.domain.School;
import academy.devdojo.jiraya.javacore.association.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {        
        Teacher teacher1 = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Kakashi");
    
        Teacher[] teachers = new Teacher[] {teacher1, teacher2};
    
        School school = new School("Konoha", teachers);
    
        school.print();
    }
}
