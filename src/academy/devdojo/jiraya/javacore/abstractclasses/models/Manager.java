package academy.devdojo.jiraya.javacore.abstractclasses.models;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }    

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + this.name + "'" +
                ", salary=" + this.salary +
                "}";
    }
}
