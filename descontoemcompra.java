import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class descontoemcompra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Exercício 6 */

   System.out.print("Digite o valor da compra: R$ ");
        double valor = input.nextDouble();

        if (valor >= 100){
           valor = valor * 0.9; // aplica 10% de desconto

   System.out.println("Você ganhou 10% de desconto!");
        }

   System.out.println("Valor final da compra: R$ " + valor);
    }
}