import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class numeropositivoounegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Exercicio 1 */
        System.out.println("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numero >= 0) {
            System.out.println("O número digitado é positivo.");
        } else {
            System.out.println("O número digitado é negativo.");
        }
        }
    }
