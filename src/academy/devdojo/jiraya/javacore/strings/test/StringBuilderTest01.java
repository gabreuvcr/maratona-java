package academy.devdojo.jiraya.javacore.strings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Luffy";
        name.concat(" - One Piece");
        name.substring(0, 3);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Luffy D Monkey");
        sb.append(" - One Piece");
        sb.substring(0, 2);
        sb.delete(0, 3);
        sb.reverse();
        System.out.println(sb);

    }
}
