package academy.devdojo.jiraya.introduction;

import java.util.Scanner;

public class ConditionalStatements04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salary = sc.nextFloat();
        float taxesToPay = 0;

        if (salary >= 68508) {
            taxesToPay = salary * 0.495F;
        } else if (salary >= 34713) {
            taxesToPay = salary * 0.3735F;
        } else {
            taxesToPay = salary * 0.097F;
        }

        System.out.println("Taxes to pay: €" + taxesToPay);
        sc.close();
    }
}
