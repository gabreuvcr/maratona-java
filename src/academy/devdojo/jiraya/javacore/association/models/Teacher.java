package academy.devdojo.jiraya.javacore.association.models;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("-------");
        System.out.println("Teacher: " + this.name);
        if (this.seminars == null) return;

        System.out.println("## Registered Seminars ##");
        for (Seminar seminar: this.seminars) {
            System.out.print(seminar.getTitle() + " - ");
            System.out.println(seminar.getLocal().getAddress());
            if (seminar.getStudents() == null || seminar.getStudents().length == 0) 
                continue;

            System.out.println("** Students **");
            for (Student student: seminar.getStudents()) {
                System.out.println(student.getName() + ", " + student.getAge());
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return this.seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
