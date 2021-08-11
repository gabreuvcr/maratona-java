package academy.devdojo.jiraya.javacore.introducaometodos.test;

import academy.devdojo.jiraya.javacore.introducaometodos.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "John";
        employee.age = 23;
        employee.salaries = new double[] {1100.00, 1350.00, 2300.00, 5000.00};

        employee.print();

        employee.meanSalaries();
    }
}
