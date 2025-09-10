import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class categoriadonadador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Exercício 7*/

        System.out.println("Digite a idade do nadador: ");
        int idade = input.nextInt();

        if (idade <= 12){
            System.out.println("Categoria: Infantil.");
        }else if (idade <= 17){
            System.out.println("Categoria: Juvenil.");
        }else{
            System.out.println("Categoria: Adulto");
        }

    }
}