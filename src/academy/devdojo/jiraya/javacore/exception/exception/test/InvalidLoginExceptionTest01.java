package academy.devdojo.jiraya.javacore.exception.exception.test;

import java.util.Scanner;

import academy.devdojo.jiraya.javacore.exception.exception.domain.InvalidLoginException;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws InvalidLoginException {
        String usernameDataBase = "goku";
        String passwordDataBase = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String usernameTyped = sc.nextLine().trim();
        System.out.print("Password: ");
        String passwordTyped = sc.nextLine().trim();
        sc.close();

        if (!usernameDataBase.equals(usernameTyped) || !passwordDataBase.equals(passwordTyped)) {
            throw new InvalidLoginException("Invalid username or password");
        }

        System.out.println("User " + usernameTyped + " sucessfully logged in");
    }
}
