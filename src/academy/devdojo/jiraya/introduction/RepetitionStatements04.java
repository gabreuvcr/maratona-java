package academy.devdojo.jiraya.introduction;

public class RepetitionStatements04 {
    public static void main(String[] args) {
        float carValue = 54000;
        
        for (int i = 1; i < carValue; i++) {
            float installmentValue = carValue / i;
            if (installmentValue < 1000) break;
            System.out.println("Installment " + i + ": " + "$" + installmentValue);
        }
    }
}
