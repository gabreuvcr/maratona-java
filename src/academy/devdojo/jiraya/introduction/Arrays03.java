package academy.devdojo.jiraya.introduction;

public class Arrays03 {
    public static void main(String[] args) {
        int[] numbersA = new int[3];
        int[] numbersB = {1, 2, 3, 4, 5};
        int[] numbersC = new int[] {4, 3, 2, 1};

        for (int number: numbersA) {
            System.out.print(number + " ");
        }
        for (int number: numbersB) {
            System.out.print(number + " ");
        }
        for (int number: numbersC) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
