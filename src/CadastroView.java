import java.util.Scanner;

public class CadastroView {
    public static void exibirCadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Chamar método de cadastro na classe Cadastro
        boolean cadastrado = Cadastro.cadastrarUsuario(nome, cpf, senha);

        if (cadastrado) {
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("CPF já cadastrado. Tente novamente.");
        }
    }
}