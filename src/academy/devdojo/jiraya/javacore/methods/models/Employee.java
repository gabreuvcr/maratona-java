package academy.devdojo.jiraya.javacore.methods.models;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double mean;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double[] getSalaries() {
        return this.salaries;
    }

    public double getMean(){
        return this.mean;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        if (salaries == null) {
            System.out.println("Salary: None");
            return;
        }
        
        System.out.print("Salaries: ");
        for (double salary: this.salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
        
        this.printMeanSalaries();
    }

    public void printMeanSalaries() {
        if (salaries == null) {
            return;
        }
        
        double sumSalaries = 0;

        for (double salary: this.salaries) {
            sumSalaries += salary;
        }

        this.mean = sumSalaries / this.salaries.length;

        System.out.println("Mean of the salaries: " + this.mean);
    }
}
