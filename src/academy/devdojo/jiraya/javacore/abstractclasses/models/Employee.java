package academy.devdojo.jiraya.javacore.abstractclasses.models;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonus();
    }

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculateBonus();
}
