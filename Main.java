import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Exercício 1 - Peça ao usuário para digitar um número real (que pode ter casas decimais) e calcule o seu dobro. Mostre o resultado.

        System.out.print("Digite um número real: ");
        double numero = entrada.nextDouble();
        double dobro = numero * 2;
        System.out.print("O dobro é: " + dobro + "\n");

        /*Exercício 2 - Peça ao usuário para digitar três números inteiros. Em seguida, calcule e mostre:
         A soma dos três números
       A média aritmética entre eles */

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = entrada.nextInt();

        int soma = n1 + n2 + n3;
        double media = soma / 3.0; // 3.0 para garantir divisão real

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media + "\n");

        /* Exercício 3 - Peça ao usuário para digitar sua idade em anos e depois converta essa idade para meses (1 ano = 12 meses). Mostre o resultado. */

        System.out.print("Digite sua idade em anos: ");
        int idadeAnos = entrada.nextInt();
        int idadeMeses = idadeAnos * 12;
        System.out.print("Sua idade em meses é: " + idadeMeses + "\n");

        // Exercício 4 - Peça ao usuário o valor de um produto e mostre o preço com 10% de desconto.

        System.out.print("Digite o valor do produto: ");
        double valor = entrada.nextDouble();
        double desconto = valor * 0.10;
        double precoFinal = valor - desconto;
        System.out.print("Preço com 10% de desconto: " + precoFinal + "\n");

        // Exercício 5 - Peça ao usuário sua altura (em metros) e seu peso (em kg). Calcule o IMC (peso / altura²) e mostre o valor calculado.

        System.out.print("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite seu peso em kg: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.print("Seu IMC é: " + imc + "\n");

        /* Exercício 6 - Peça ao usuário dois números reais. Mostre na tela:
        A soma
        A diferença
        O produto
        O quociente (divisão do primeiro pelo segundo)
         */

        System.out.print("Digite o primeiro número real: ");
        double pN = entrada.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double sN = entrada.nextDouble();

        System.out.print("Soma: " + ( pN + sN + "\n"));
        System.out.print("Diferença: " + (pN - sN + "\n"));
        System.out.print("Produto: " + (pN * sN + "\n"));

        if (sN != 0) {
            System.out.print("Quociente: " + (pN / sN));
        }
        else {
            System.out.print("Não é possível dividir por zero.");
        }

    }
}



