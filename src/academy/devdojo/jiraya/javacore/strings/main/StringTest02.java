package academy.devdojo.jiraya.javacore.strings.main;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Luffy";
        String numbers = "012345";

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        
        System.out.println(numbers.length());
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(3, numbers.length()));
        System.out.println(numbers.substring(3));

        System.out.println("  Luffy ".trim());

    }
}