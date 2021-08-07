package academy.devdojo.jiraya.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // numbers (int, float, double, byte, short) 0
        // char '\u0000' ' '
        // boolean false
        // references (String, etc) null

        String[] names = new String[3];
        names[0] = "Mary";
        names[1] = "John";
        names[2] = "Anne";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
