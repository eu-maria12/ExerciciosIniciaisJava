import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class maiordedoisnumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Exercício 4 */

        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais");
        }
    }
}