import java.util.Scanner;

public class sistemadelogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o usuário: ");
        String usuario = input.nextLine();

        System.out.println("Digite a senha: ");
        String senha = input.nextLine();

        if (usuario.equals("admin")) {
            if (senha.equals("1234")) {
                System.out.println("Bem-vindo, administrador!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (usuario.equals("aluno")) {
            if (senha.equals("0000")) {
                System.out.println("Bem-vindo, aluno! Você pode consultar suas notas.");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (usuario.equals("professor")) {
            if (senha.equals("4321")) {
                System.out.println("Bem-vindo, professor! Você pode lançar notas.");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
                System.out.println("Usuário não encontrado!");
        }
    }
}