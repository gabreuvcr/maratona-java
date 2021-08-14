package academy.devdojo.jiraya.javacore.association.main;

import java.util.Scanner;

public class KeyboardReadingTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.print("Enter your gender (M or F): ");
        char gender = input.next().charAt(0);

        System.out.println("-------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        input.close();
    }
}
