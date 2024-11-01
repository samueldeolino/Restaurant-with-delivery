import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NotaFiscal {
    private static int nextID = 1; // Variável estática para controlar o autoincremento do ID
    private int ID;
    private String horario;
    private Pedido pedido;

    public NotaFiscal(String horario,Pedido pedido) {
        this.ID = nextID++; // Atribui o próximo ID disponível e incrementa o próximo ID
        this.horario = horario;
        this.pedido = pedido;
    }
    public NotaFiscal() {
       
    }


    public int getID() {
        return ID;
    }

    public String getHorario() {
        return horario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public NotaFiscal gerarNotaFiscal(Cliente cliente) {
        List<Pedido> pedidos = cliente.getPedidos();
        if (pedidos == null) {
            System.out.println("Não existem pedidos criados.");
            return null;
        }

        System.out.println("Pedidos existentes:");
        cliente.listarPedidos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do pedido para gerar a nota fiscal: ");
        int numeroPedido = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Pedido pedidoSelecionado = null;
        for (Pedido pedido : cliente.getPedidos()) {
            if(pedido.getID() == numeroPedido){
                pedidoSelecionado = pedido;
            }
        }
        if (pedidoSelecionado == null) {
            System.out.println("Pedido não encontrado.");
            return null;
        }

        if (!pedidoSelecionado.getEntregaConcluida()) {
            System.out.println("O pedido selecionado ainda não foi entregue. Não é possível gerar a nota fiscal.");
            return null;
        }

        NotaFiscal notaFiscal = new NotaFiscal("00:00", pedidoSelecionado);
        return notaFiscal;
    }

}
