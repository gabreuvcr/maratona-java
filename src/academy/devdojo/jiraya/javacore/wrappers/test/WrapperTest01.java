package academy.devdojo.jiraya.javacore.wrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 2;
        int intP = 4;
        long longP = 8L;
        float floatP = 4F;
        double doubleP = 8D;
        char charP = '2';
        boolean booleanP = false;

        System.out.println("Primitive");
        System.out.println(byteP);
        System.out.println(shortP);
        System.out.println(intP);
        System.out.println(longP);
        System.out.println(floatP);
        System.out.println(doubleP);
        System.out.println(charP);
        System.out.println(booleanP);

        //autoboxing - boxing
        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 4;
        Long longW = 8L;
        Float floatW = 4F;
        Double doubleW = 8D;
        Character charW = '2';
        Boolean booleanW = false;

        System.out.println("Wrappers");
        System.out.println(byteW);
        System.out.println(shortW);
        System.out.println(intW);
        System.out.println(longW);
        System.out.println(floatW);
        System.out.println(doubleW);
        System.out.println(charW);
        System.out.println(booleanW);

        //unboxing
        int i = intW;
        Integer intW2 = Integer.parseInt("1");
        boolean booleanW2 = Boolean.parseBoolean("true");

        System.out.println("Teste unboxing: " + i);
        System.out.println("Teste Integer.parseInt('1'): " + intW2);
        System.out.println("Teste Boolean.parseBoolean('true'): " + booleanW2);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
