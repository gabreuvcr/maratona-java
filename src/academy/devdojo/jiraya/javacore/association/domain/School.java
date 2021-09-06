package academy.devdojo.jiraya.javacore.association.domain;

public class School {
    private String name;
    private Teacher[] teachers;
    
    public School(String name) {
        this.setName(name);
    }

    public School(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public void print() {
        System.out.println("School: " + this.name);
        if (this.teachers == null) return;
        System.out.print("Teachers: ");
        for (Teacher teacher: this.teachers) {
            System.out.print(teacher.getName() + "; ");
        }
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return this.teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
