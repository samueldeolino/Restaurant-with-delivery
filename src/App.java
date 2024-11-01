import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("=== MENU ===");
            System.out.println("1. Login");
            System.out.println("2. Cadastro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    LoginView.exibirLogin();
                    break;
                case 2:
                    CadastroView.exibirCadastro();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Encerrando o programa. Até mais!");
    }

}
