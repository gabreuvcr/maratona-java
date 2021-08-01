package academy.devdojo.jiraya.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000D;
        float salarioFloat = 2500F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";
        
        System.out.println("A idade é (overflow): " + idade);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi meu nome é " + nome);
    }
}
