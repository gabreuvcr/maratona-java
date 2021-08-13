package academy.devdojo.jiraya.introduction;

public class RepetitionStatements05 {
    public static void main(String[] args) {
        float carValue = 54000;

        for (int i = (int) carValue; i > 0; i--) {
            float installmentValue = carValue / i;
            if (installmentValue < 1000) continue;
            System.out.println("Installment " + i + ": " + "$" + installmentValue);
        }
    }
}
