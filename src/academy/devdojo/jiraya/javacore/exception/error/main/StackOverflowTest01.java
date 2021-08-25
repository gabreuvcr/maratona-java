package academy.devdojo.jiraya.javacore.exception.error.main;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        recursion();
    }
}
