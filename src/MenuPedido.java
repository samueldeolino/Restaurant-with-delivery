import java.util.Scanner;

public class MenuPedido {
    private Pedido pedido;

    public MenuPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public static void exibirMenu(Pedido pedido) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        NotaFiscal notaFiscal = null;
        
        do {
            System.out.println("==== Menu do Pedido ====");
            System.out.println("1. Adicionar item ao pedido");
            System.out.println("2. Remover item do pedido");
            System.out.println("3. Adicionar avaliação do pedido");
            System.out.println("4. Confirmar entrega do pedido");
            System.out.println("5. Gerar nota fiscal do pedido");
            System.out.println("6. Listar pedidos");
            System.out.println("0. Voltar");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    CardapioView.exibirCardapio(pedido);
                    break;
                case 2:
                    pedido.excluirItemPedido(pedido.getClientePedido());
                    break;
                case 3:
                    pedido.adicionarAvaliacao(pedido);
                    break;
                case 4:
                    pedido.concluirEntrega(pedido);
                    break;
                case 5:
                    notaFiscal = new NotaFiscal();
                    NotaFiscal notaGerada = notaFiscal.gerarNotaFiscal(pedido.getClientePedido());
                    if (notaGerada != null) {
                        NotaFiscalView.mostrarDetalhesNotaFiscal(notaGerada);
                    } else {
                        System.out.println("Não foi possível gerar a nota fiscal.");
                    }
                    break;
                case 6:
                    pedido.getClientePedido().listarPedidos();
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

}
