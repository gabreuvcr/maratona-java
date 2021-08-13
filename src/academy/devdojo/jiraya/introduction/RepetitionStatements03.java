package academy.devdojo.jiraya.introduction;

public class RepetitionStatements03 {
    public static void main(String[] args) {
        int maxValue = 50;

        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {
                break;
            }
            
            System.out.print(i + " ");
        }
    }   
}
