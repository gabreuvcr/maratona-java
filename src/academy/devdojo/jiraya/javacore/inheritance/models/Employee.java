package academy.devdojo.jiraya.javacore.inheritance.models;

public class Employee extends Person {
    private double salary;

    @Override
    public void print() {
        super.print();
        System.out.println(this.salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
