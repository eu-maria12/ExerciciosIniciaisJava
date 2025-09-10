import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Exercício 7 */

        System.out.println("Digite o lado A: ");
        int a = input.nextInt();

        System.out.println("Digite o lado B: ");
        int b = input.nextInt();

        System.out.println("Digite o lado C: ");
        int c = input.nextInt();

        if (a < b + c && b < a + c && c < a + b){ ;

        System.out.println("Os lados formam um triangulo válido.");
    }else{
            System.out.println("Os lados não formam um triângulo.");
        }

    }
}