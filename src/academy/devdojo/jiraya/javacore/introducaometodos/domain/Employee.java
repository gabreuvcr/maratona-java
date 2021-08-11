package academy.devdojo.jiraya.javacore.introducaometodos.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

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
    }

    public void meanSalaries() {
        if (salaries == null) {
            return;
        }
        
        double sumSalaries = 0;

        for (double salary: this.salaries) {
            sumSalaries += salary;
        }

        double meanSalaries = sumSalaries / this.salaries.length;

        System.out.println("Mean of the salaries: " + meanSalaries);
    }
}
