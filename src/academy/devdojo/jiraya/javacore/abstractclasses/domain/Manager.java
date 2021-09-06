package academy.devdojo.jiraya.javacore.abstractclasses.domain;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }    

    @Override
    public void calculateBonus() {
        this.salary = this.salary * 1.2;
    }

    @Override
    public String toString() {
        return "Manager{" +
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
