import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cliente extends Usuario {
    private Scanner scanner;
    private String endereco;
    private String telefone;
    private List<Avaliacao> avaliacoes;
    private List<Pedido> pedidos;

    public Cliente(int ID, String nome, int cpf, String senha) {
        super(ID, nome, cpf, senha);
        this.endereco = "";
        this.telefone = "";
        this.avaliacoes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public Cliente(int ID, String nome, int cpf, String endereco, String telefone, String senha) {
        super(ID, nome, cpf, senha);
        this.endereco = endereco;
        this.telefone = telefone;
        this.avaliacoes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }


    public void avaliarPedido(Avaliacao avaliacao, Pedido pedido) {
        pedido.adicionarAvaliacao(pedido);
        avaliacoes.add(avaliacao);
    }

    public List<Avaliacao> listarAvaliacoes() {
        return avaliacoes;
    }

    public void criarNovoPedido(Cliente cliente) {
        int numeroPedido = 1; // Valor padrão para o primeiro pedido

        // Verifica se já existem pedidos
        if (!pedidos.isEmpty()) {
            // Percorre a lista de pedidos para encontrar o maior número de pedido
            for (Pedido pedido : pedidos) {
                if (pedido.getID() >= numeroPedido) {
                    numeroPedido = pedido.getID() + 1;
                }
    }
        }

        if(cliente.getEndereco().isEmpty()){
            System.out.print("Digite o endereço do cliente: ");
            String enderecoCliente = scanner.nextLine();
            cliente.setEndereco(enderecoCliente);
        }
        if(cliente.getTelefone().isEmpty()){
            System.out.print("Digite o telefone do cliente: ");
            String telefoneCliente = scanner.nextLine();
            cliente.setTelefone(telefoneCliente);
        }
        

        Pedido pedido = new Pedido(numeroPedido, cliente);
        pedidos.add(pedido); // Adiciona o pedido à lista de pedidos do cliente

        MenuPedido.exibirMenu(pedido);

        System.out.println("Pedido criado com sucesso!");
        System.out.println("Número do pedido: " + pedido.getID());

    }
    public void listarPedidos(){
        if(!pedidos.isEmpty()){
            for(Pedido pedido : pedidos){
                System.out.println(String.format("=========== PEDIDO %d ===========", pedido.getID()));
                System.out.println(String.format("\nNumero do Pedido: %d",pedido.getID()));
                System.out.println(String.format("Cliente do Pedido: %s",pedido.getClientePedido().getNome()));
                System.out.println(String.format("Valor Total do Pedido: %.2f",pedido.getValor()));
                System.out.println(String.format("Entrega concluída: %b",pedido.getEntregaConcluida()));
                if(!pedido.getItens().isEmpty()){
                    System.out.println("\n=== ITENS DO PEDIDO ===");
                    for (Item item : pedido.getItens()) {
                        System.out.println(String.format("Numero do Item: %d",item.getID()));
                        System.out.println(String.format("Nome do Item: %s",item.getNome()));
                        System.out.println(String.format("Valor do Item: %.2f",item.getValor()));
                        System.out.println("------------------");
                    }
                }else{
                    System.out.println("O pedido se encontra vazio");
                };
                System.out.println("============================\n");
                
            }
        }else{
                System.out.println("O cliente não tem pedidos realizado");
            }
    }
}
