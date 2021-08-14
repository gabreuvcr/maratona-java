package academy.devdojo.jiraya.javacore.association.models;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminar) {
        this.name = name;
        this.age = age;
        this.seminar = seminar;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Seminar getSeminar() {
        return this.seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
