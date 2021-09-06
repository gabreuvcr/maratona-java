package academy.devdojo.jiraya.javacore.methods.test;

import academy.devdojo.jiraya.javacore.methods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("John");
        employee.setAge(23);
        employee.setSalaries(new double[] {1100.00, 1350.00, 2300.00, 5000.00});

        employee.print();

    }
}
