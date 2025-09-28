import java.util.Scanner;

public class financiamentobancario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua renda mensal: ");
        double renda = input.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double pretacao = input.nextDouble();

        if (pretacao > renda * 0.30) {
            System.out.println("Financiamento negado por alta prestação");
        } else if (pretacao > 3000 && renda < 10000) {
            System.out.println("Financiamento negado por baixa renda.");
        } else {
            System.out.println("Financiamento aprovado.");
        }
    }
}
