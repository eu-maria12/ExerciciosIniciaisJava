import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class parouimpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Exercício 3 */

        System.out.println("Digite um número inteiro: ");
        int n1 = input.nextInt();

        if (n1 % 2 == 0) {
            System.out.println(n1 + " é um número par.");
        } else {
            System.out.println(n1 + " é um número ímpar.");
        }
    }
}