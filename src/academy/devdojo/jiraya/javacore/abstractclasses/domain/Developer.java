package academy.devdojo.jiraya.javacore.abstractclasses.domain;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary * 1.05;        
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + this.name + "'" +
                ", salary=" + this.salary +
                "}";
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this);
    }
}
