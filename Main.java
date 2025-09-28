import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.print("Digite o consumo em km/h: ");
    int consumo = input.nextInt();

    double valorConta;

    // Definindo o preço por faixa
        if (consumo <= 100) {
            valorConta = consumo * 0.50;
        } else if (consumo <= 200) {
            valorConta = consumo * 0.70;
        } else {
            valorConta = consumo * 0.90;
        }

        // Regras adicionais

        if (consumo > 500) {
            System.out.println("Consumo elevado: considere economizar energia");
        }

        if (valorConta > 200) {
            valorConta = valorConta * 0.90; // aplica 10% de desconto
        }

        if (valorConta < 30) {
            System.out.println("Valor nãp será cobrado neste mês. Será somado à próxima conta.");
        } else {
            System.out.println("Valor da conta: R$ " + valorConta);
        }


    }
}