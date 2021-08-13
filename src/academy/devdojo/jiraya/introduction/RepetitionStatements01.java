package academy.devdojo.jiraya.introduction;

public class RepetitionStatements01 {
    public static void main(String[] args) {
        
        int count = 5;
        while (count < 8) {
            System.out.println("while: " + count);
            count++;
        }

        do {
            System.out.println("do while: " + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 5; i++) {
            System.out.println("for: " + i);
        }
    }
}
