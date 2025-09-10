import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aprovadooureprovado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Exercício 5 */

        System.out.println(" Digite a nota do aluno (0 a 10): ");
        double nota = input.nextInt();
        if (nota >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (nota >= 4) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}