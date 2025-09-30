import java.util.Scanner;

public class loginAtt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String usuario;
        String senha;
        boolean acertou = false;

        while (acertou == false) {
            System.out.println("Informe o nome de usuário:");
            usuario = input.nextLine();
            System.out.println("Informe a senha:");
            senha = input.nextLine();

            if (usuario.equals("admin") && senha.equals("1234")) {
                System.out.println("Bem-vindo,administrador!");
                acertou = true;
            } else if (usuario.equals("aluno") && senha.equals("0000")) {
                System.out.println("Bem-vindo, aluno! Você pode consultar suas notas.");
                acertou = true;
            } else if (usuario.equals("professor") && senha.equals("4321")) {
                System.out.println("Bem-vindo, professor! Você pode lançar suas notas!");
                acertou = true;
            } else {
                System.out.println("Usuário e/ou senha incorretos!");
                acertou = false;
            }
        }



    }
}