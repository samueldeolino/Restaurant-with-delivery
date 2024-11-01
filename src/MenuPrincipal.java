import java.util.Scanner;
public class MenuPrincipal {
    private static Scanner scanner = new Scanner(System.in);
    private static Pedido pedido;
    public static void exibirMenuPrincipal(Cliente cliente) {
        boolean sair = false;
        while (!sair) {
            System.out.println(String.format("Bem vindo: %s", cliente.getNome()));
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Pedidos");
            System.out.println("2. Verificar dados do cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    MenuCliente.exibirMenu(cliente);
                    break;
                case 2:
                    System.out.println(String.format("Nome do cliente: %s\nCpf do cliente %d\nEndereço do cliente: %s\nTelefone do cliente: %s\n",cliente.getNome(),cliente.getCPF(),cliente.getEndereco(),cliente.getTelefone()));
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Encerrando o sistema. Até mais!");
    }

}
