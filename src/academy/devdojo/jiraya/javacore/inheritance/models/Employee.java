package academy.devdojo.jiraya.javacore.inheritance.models;

// 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
// 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filha
// 2 - Alocado espaco em memória pro objeto da superclasse
// 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado
// 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
// 5 - Construtor é executado da superclasse
// 6 - Alocado espaco em memória pro objeto da subclasse
// 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado
// 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
// 9 - Construtor é executado da subclasse

public class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, String cpf, double salary) {
        super(name, cpf);
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.salary);
    }

    public void paymentReport() {
        System.out.println("I, " + this.name + ", received the salary of " + this.salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
