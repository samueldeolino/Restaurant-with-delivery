import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginView {
    public static void exibirLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LOGIN ===");
        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Chamar método de autenticação na classe Login
        Cliente autenticado = Login.autenticar(cpf, senha);

        if (autenticado != null) {
            System.out.println("Login realizado com sucesso!");
            MenuPrincipal.exibirMenuPrincipal(autenticado);
        } else {
            System.out.println("CPF ou senha incorretos. Tente novamente.");
        }
    }
}