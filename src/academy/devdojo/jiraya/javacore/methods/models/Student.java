package academy.devdojo.jiraya.javacore.methods.models;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void print() {
        System.out.println("-----");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

    @Override
    public String toString() {
        String result = this.name + " - ";
        result += String.valueOf(this.age) + " - ";
        result += String.valueOf(this.gender);
        return result; 
    }
}
