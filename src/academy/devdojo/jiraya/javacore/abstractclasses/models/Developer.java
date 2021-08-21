package academy.devdojo.jiraya.javacore.abstractclasses.models;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + this.name + "'" +
                ", salary=" + this.salary +
                "}";
    }
}
