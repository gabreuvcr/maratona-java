package academy.devdojo.jiraya.introduction;

import java.util.Scanner;

public class ConditionalStatements06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();

        switch (day) {
            case 1: 
            case 7:
                System.out.println("Weekend");
                break;
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6:
                System.out.println("Workday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        sc.close();
    }
}
