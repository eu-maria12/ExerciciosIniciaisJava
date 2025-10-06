import java.util.Scanner;

public class atvdDowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
                idade = input.nextInt();

        while (idade < 18) {
            System.out.println("Você tem " + idade + " anos e não pode entrar.");
            idade++;
        }
        System.out.println("Agora você tem " + idade + " e pode entrar");
    }
}