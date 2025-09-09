import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso;
        double altura;
        double imc;

        System.out.print("Digite o seu peso em kg: ");
        peso = input.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso!");
        } else if (imc < 24.99) {
            System.out.println("Você está com o peso normal!");
        } else if (imc < 29.99) {
            System.out.println("Você está com sobrepeso!");
        } else {
            System.out.println("Você está obeso(a)!");
        }
        System.out.printf("Seu IMC é: %.1f", imc );
    }
}