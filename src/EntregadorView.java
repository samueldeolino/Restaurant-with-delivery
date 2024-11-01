import java.util.List;

class EntregadorView {
    public void mostrarDetalhesEntregador(Entregador entregador) {
        System.out.println("Detalhes do Entregador:");
        System.out.println("ID: " + entregador.getID());
        System.out.println("Nome: " + entregador.getNome());
        System.out.println("CPF: " + entregador.getCPF());
        System.out.println("--------------------------------");
    }

    public void mostrarListaPedidos(List<Pedido> pedidos) {
        System.out.println("Lista de Pedidos do Entregador:");
        for (Pedido pedido : pedidos) {
            System.out.println("ID: " + pedido.getID());
            System.out.println("Cliente: " + pedido.getClientePedido().getNome());
            System.out.println("Valor: " + pedido.getValor());
            System.out.println("Status: " + pedido.getEntregaConcluida());
            System.out.println("--------------------------------");
        }
    }
}
