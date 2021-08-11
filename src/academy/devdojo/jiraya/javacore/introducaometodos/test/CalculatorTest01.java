package academy.devdojo.jiraya.javacore.introducaometodos.test;

import academy.devdojo.jiraya.javacore.introducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculador = new Calculator();

        System.out.println(calculador.sumTwoNumbers(2, 1));
        System.out.println(calculador.subtractTwoNumbers(23, 10));
        System.out.println(calculador.multiplyTwoNumbers(23, 12));
        System.out.println(calculador.divideTwoNumbers(10, 20));
        System.out.println(calculador.divideTwoNumbers(23, 0));

        int[] numbers = new int[] {1, 2, 3, 4, 5};
        System.out.println(calculador.sumArray(numbers));
        System.out.println(calculador.sumVarArgs(1, 2, 3, 4, 5, 6, 7));
    }
}
