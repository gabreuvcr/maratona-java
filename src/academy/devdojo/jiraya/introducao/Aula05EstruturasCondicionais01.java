package academy.devdojo.jiraya.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAllowedToBuyAlcoholicBeverage = idade >= 18;

        if (isAllowedToBuyAlcoholicBeverage) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }

        boolean c = false;
        if (c = true) {
            System.out.println("Nunca faça isso: " + c);
        }
    }
}
