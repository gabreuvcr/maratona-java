package academy.devdojo.jiraya.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 20;
        int num2 = 10;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println((double) num1 / num2);
        System.out.println(num1 * num2);
        System.out.println(num1 + num2 + "value" + num1 + num2);

        // %
        int num3 = 1332;
        int resto = num3 % 2;
        if (resto == 0) System.out.println(num3 + " is even");
        else System.out.println(num3 + " is odd");

        // < > <= >= == !=

        int num4 = 10;
        int num5 = 20;
        boolean isNum4GreaterThanNum5 = num4 > num5;
        boolean isNum4EqualToNum5 = num4 == num5;
        boolean isNum4LessThanNum5 = num4 < num5;
        System.out.println("isNum4GreaterThanNum5: " + isNum4GreaterThanNum5);
        System.out.println("isNum4EqualToNum5: " + isNum4EqualToNum5);
        System.out.println("isNum4LessThanNum5: " + isNum4LessThanNum5);

        // && || !

        int age = 29;
        float salary = 3500F;
        boolean isInTheLawGreaterThan30 = age >= 30  && salary >= 4612;
        boolean isInTheLawLessThan30 = age < 30 && salary >= 3381;
        System.out.println("isInTheLawGreaterThan30: " + isInTheLawGreaterThan30);
        System.out.println("isInTheLawLessThan30: " + isInTheLawLessThan30);

        double totalCheckingAccount = 200;
        double totalSavingsAccount = 10000;

        float valuePlaystation5 = 5000F;
        boolean isPlaystation5Buyable = (totalCheckingAccount >= valuePlaystation5) ||
                                        (totalSavingsAccount) >= valuePlaystation5;
        System.out.println("isPlaystation5Buyable: " + isPlaystation5Buyable);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++;
        System.out.println(contador++);
        System.out.println(++contador);
    }
}
