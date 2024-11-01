import java.util.ArrayList;
import java.util.List;

class Entregador extends Usuario {
    private List<Pedido> pedidos;

    public Entregador(int ID, String nome, int cpf, String senha) {
        super(ID, nome, cpf, senha);
        this.pedidos = new ArrayList<>();
    }

    public Entregador(int ID, String nome, int cpf, List<Pedido> pedidos, String senha) {
        super(ID, nome, cpf, senha);
        this.pedidos = pedidos;
    }

    public Entregador(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void confirmarEntrega(Pedido pedido) {
        pedido.concluirEntrega(pedido);
        pedidos.remove(pedido);
    }
}
