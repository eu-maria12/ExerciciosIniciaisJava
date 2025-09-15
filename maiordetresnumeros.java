import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class maiordetresnumeros {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1= input.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2= input.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3= input.nextInt();

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        System.out.println("O maior número é: " + maior);

    }
}