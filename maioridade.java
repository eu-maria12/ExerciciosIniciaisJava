import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Exercício 2*/

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade <=0) {
            System.out.println("Valor inválido!");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
