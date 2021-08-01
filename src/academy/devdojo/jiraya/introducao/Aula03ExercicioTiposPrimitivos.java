package academy.devdojo.jiraya.introducao;

import java.util.Scanner;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Endereço: ");
        sc.nextLine();
        String endereco = sc.nextLine();
        System.out.print("Salario: ");
        float salario = sc.nextFloat();
        System.out.print("Data (dd/mm/yyyy): ");
        String data = sc.next();

        String result = "Eu " + nome + ", morando no endereço " + endereco + ", ";
        result += "confirmo que recebi o salário de " + salario + ", na data " + data;

        System.out.println(result);
        sc.close();
    }
}
