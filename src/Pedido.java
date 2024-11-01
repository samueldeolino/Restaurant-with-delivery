import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int ID;
    private Cliente clientePedido;
    private float valor;
    private List<Item> itens;
    private List<Avaliacao> avaliacoes;
    private boolean entregaConcluida;
    private static Scanner scanner = new Scanner(System.in);
    private NotaFiscal notaFiscal;

    public Pedido(int ID, Cliente clientePedido) {
        this.ID = ID;
        this.clientePedido = clientePedido;
        this.valor = 0.0f;
        this.avaliacoes = new ArrayList<>();
        this.entregaConcluida = false;
        this.itens = new ArrayList<>();

    }

    public Pedido() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public boolean getEntregaConcluida() {
        return entregaConcluida;
    }

    public void setEntregaConcluida(boolean entregaConcluida) {
        this.entregaConcluida = entregaConcluida;
    }

    public void calcularValorPedido() {
        float total = 0.0f;
        for (Item item : itens) {
            total += item.getValor();
        }
        this.valor = total;
    }

    public void adicionarItemPedido(List<Pedido> pedidos, Cardapio cardapio, Pedido pedido) {
        if (pedidos.isEmpty()) {
            System.out.println("O cliente não possui pedidos.");
            return;
        }

        System.out.println("Pedidos do cliente:");
        pedido.getClientePedido().listarPedidos();

        System.out.print("Digite o numero do pedido em que deseja adicionar um item: ");
        int idPedido = scanner.nextInt();

        Pedido pedidoSelecionado = null;
        for (Pedido p : pedidos) {
            if (p.getID() == idPedido) {
                pedidoSelecionado = p;
                break;
            }
        }

        if (pedidoSelecionado == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }

        if (cardapio.getItensCardapio().isEmpty()) {
            System.out.println("O cardápio está vazio.");
            return;
        }

        int opcao = 1;
        while (opcao == 1) {

            cardapio.exibirCardapio();
            System.out.print("Digite o numero do item que deseja adicionar ao pedido: ");
            int idItem = scanner.nextInt();

            Item itemSelecionado = null;
            for (Item item : cardapio.getItensCardapio()) {
                if (item.getID() == idItem) {
                    itemSelecionado = item;
                    break;
                }
            }
            
            if (itemSelecionado == null) {
                System.out.println("Item não encontrado no cardápio.");
            } else {
                pedidoSelecionado.getItens().add(itemSelecionado);
                pedidoSelecionado.calcularValorPedido();
                System.out.println("Item adicionado ao pedido com sucesso.");
            }

            System.out.print("Deseja adicionar mais itens no pedido? Não(0) | Sim(1): ");
            opcao = scanner.nextInt();
        }
    }

    public boolean excluirItemPedido(Cliente cliente) {
        List<Pedido> pedidos = cliente.getPedidos();

        if (pedidos.isEmpty()) {
            System.out.println("O cliente não possui pedidos.");
            return false;
        }

        System.out.println("Pedidos do cliente:");
        cliente.listarPedidos();

        System.out.print("Digite o Numero do pedido em que deseja remover um item: ");
        int idPedido = scanner.nextInt();

        Pedido pedidoSelecionado = null;
        for (Pedido pedido : pedidos) {
            if (pedido.getID() == idPedido) {
                pedidoSelecionado = pedido;
                break;
            }
        }

        if (pedidoSelecionado == null) {
            System.out.println("Pedido não encontrado.");
            return false;
        }

        List<Item> itensPedido = pedidoSelecionado.getItens();
        if (itensPedido.isEmpty()) {
            System.out.println("O pedido selecionado não possui itens.");
            return false;
        }

        System.out.print("Digite o Numero do item a ser removido: ");
        int idItem = scanner.nextInt();

        boolean itemRemovido = false;
        for (Item item : itensPedido) {
            if (item.getID() == idItem) {
                itensPedido.remove(item);
                pedidoSelecionado.calcularValorPedido();
                itemRemovido = true;
                break;
            }
        }

        if (itemRemovido) {
            System.out.println("Item removido com sucesso.");
            cliente.listarPedidos();
            return true;
        } else {
            System.out.println("Item não encontrado no pedido.");
            cliente.listarPedidos();
            return false;
        }
    }

    public void adicionarAvaliacao(Pedido pedido) {

        List<Pedido> pedidos = pedido.getClientePedido().getPedidos();
        if (pedido.getClientePedido().getPedidos().isEmpty()) {
            System.out.println("Não existem pedidos criado ");
        }
        System.out.println("Pedidos do cliente:");
        for (Pedido pedidoBusca : clientePedido.getPedidos()) {
            pedido.getClientePedido().listarPedidos();
        }

        System.out.print("Digite o numero do pedido selecionado: ");
        int numeroPedido = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Quantas estrelas voce da para o pedido ? (0 a 5) ");
        int numeroEstrelas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Qual o seu comentario sobre o pedido: ");
        String comentario = scanner.nextLine();

        Avaliacao avaliacao = new Avaliacao(comentario,pedido.getClientePedido().getNome(),numeroEstrelas,pedido);
        avaliacoes.add(avaliacao);

        Pedido pedidoSelecionado = null;
        for (Pedido pedidoBusca : pedidos) {
            if (pedidoBusca.getID() == numeroPedido) {
                pedidoSelecionado = pedidoBusca;
                break;
            }
        }
        if (pedidoSelecionado == null) {
            System.out.println("Pedido não encontrado.");
            return;
        }
        AvaliacaoView avaliacaoView = new AvaliacaoView();
        avaliacaoView.exibirDetalhesAvaliacao(avaliacao);
        
    }

    public void concluirEntrega(Pedido pedidos) {

        pedidos.getClientePedido().listarPedidos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Numero do pedido a ser entregue: ");
        int idPedido = scanner.nextInt();

        boolean pedidoEncontrado = false;
        for (Pedido pedido : pedidos.getClientePedido().getPedidos()) {
            if (pedido.getID() == idPedido) {
                pedidoEncontrado = true;
                if (pedido.getEntregaConcluida()) {
                    System.out.println("O pedido já foi entregue anteriormente.");
                } else {
                    System.out.println("Confirmar a entrega do pedido? Sim(1) | Não(0): ");
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        pedido.setEntregaConcluida(true);
                        System.out.println("Entrega do pedido confirmada.");
                    } else {
                        System.out.println("Entrega do pedido não confirmada.");
                    }
                }
                break;
            }
        }

        if (!pedidoEncontrado) {
            System.out.println("Pedido não encontrado.");
        }
    }

    public void  listarItensPedido(){
        if (itens.isEmpty()) {
            System.out.println("O pedido não possui itens.");
        }
        System.out.println("Itens do pedido:");
        for (Item item : itens) {
            System.out.println("Numero: " + item.getID() + " | Nome: " + item.getNome()+" | Valor: "+item.getValor());
        }

    }

}


