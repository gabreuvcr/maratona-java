package academy.devdojo.jiraya.javacore.methods.models;

public class Calculator {
    
    public double sumTwoNumbers(double num1, double num2) {
        return num1 + num2;
    } 

    public double subtractTwoNumbers(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplyTwoNumbers(double num1, double num2) {
        return num1 * num2;
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: can't divide by zero");
        }
        return num1 / num2;
    }

    public int sumArray(int[] numbers) {
        int sum = 0;

        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }

    public int sumVarArgs(int ...numbers) {
        int sum = 0;

        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }
}
