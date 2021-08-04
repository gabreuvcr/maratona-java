package academy.devdojo.jiraya.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // condition ? true : false
        double salary = 6000;
        String donationMessage = "I will donate 500 to DevDojo";
        String noDonationMessage = "I still don't have conditions, but I will have";

        String resultMessage = salary > 5000 ? donationMessage : noDonationMessage;

        System.out.println(resultMessage);
    }
}
