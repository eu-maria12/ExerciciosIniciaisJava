import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class maioridade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Exercício 2*/

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}