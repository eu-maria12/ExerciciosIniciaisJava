import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        double salario;
        double salarioReajustado;
        int meses = 0;

        while (opcao != 4) {
            System.out.println("Menu de opções");
            System.out.println("1 - Novo salário");
            System.out.println("2 - Férias");
            System.out.println("3 - Décimo terceiro");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("Digite o salário: ");
                salario = input.nextDouble();
                if (salario < 3500){
                    salarioReajustado = salario * 1.15;
                } else if (salario >= 3500 && salario <= 6000) {
                    salarioReajustado =  salario * 1.10;
                }else{
                    salarioReajustado = salario * 1.05;
                }

                System.out.printf("O salário reajustado é: %.0f\n" , salarioReajustado);

            } else if (opcao == 2) {
                System.out.println("Digite o salário: ");
                salario = input.nextDouble();
                salarioReajustado = salario /3 + salario;
                System.out.printf("O valor das férias é: %.0f\n", salarioReajustado);

            } else if (opcao == 3) {
                System.out.println("Digite o salário: ");
                salario = input.nextDouble();
                System.out.println("Digite o número de meses trabalhados: ");
                meses = input.nextInt();
                salarioReajustado = salario / 12 * meses;
                System.out.printf("O décimo terceiro é: %.0f\n" , salarioReajustado);

            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}