package academy.devdojo.jiraya.javacore.methods.models;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
