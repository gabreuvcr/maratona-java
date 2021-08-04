package academy.devdojo.jiraya.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        System.out.print("Enter the day of week 1-7: ");
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();
        System.out.print("Enter your gender M/F: ");
        char gender = sc.next().toUpperCase().charAt(0);
        
        switch (day) {
            case 1: 
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        switch (gender) {
            case 'M':
                System.out.println("Masculine");
                break;
            case 'F':
                System.out.println("Feminine");
                break;
            default:
                System.out.println("Not specified");
                break;
        }

        sc.close();
    }
}
