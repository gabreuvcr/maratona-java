package academy.devdojo.jiraya.javacore.association.main;

import academy.devdojo.jiraya.javacore.association.models.School;
import academy.devdojo.jiraya.javacore.association.models.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {        
        Teacher teacher1 = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Kakashi");
    
        Teacher[] teachers = new Teacher[] {teacher1, teacher2};
    
        School school = new School("Konoha", teachers);
    
        school.print();
    }
}
