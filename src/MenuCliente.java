import java.util.Scanner;

public class MenuCliente {
    private Cliente cliente;

    public MenuCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static void exibirMenu(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== Menu de Pedidos ====");
            System.out.println("1. Criar novo pedido");
            System.out.println("2. Procurar um pedido existente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente.criarNovoPedido(cliente);
                    break;
                case 2:
                    cliente.listarPedidos();
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}