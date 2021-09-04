package academy.devdojo.jiraya.javacore.strings.main;

public class StringTest01 {
    public static void main(String[] args) {
        String name1 = "Luffy"; //String constant pool
        String name2 = "Luffy";
        System.out.println(name1 == name2);

        name1 = name1.concat(" D Monkey");
        System.out.println(name1 == name2);

        String name3 = new String("Luffy"); //Heap
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
