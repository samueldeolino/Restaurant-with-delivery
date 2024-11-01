import java.util.List;

class PedidoView {
    public static void mostrarDetalhesPedido(Pedido pedido) {
        System.out.println("Detalhes do Pedido:");
        System.out.println("ID: " + pedido.getID());
        System.out.println("Cliente: " + pedido.getClientePedido().getNome());
        System.out.println("Itens do Pedido:");
        for (Item item : pedido.getItens()) {
            System.out.println("   - Nome: " + item.getNome());
            System.out.println("     Valor: " + item.getValor());
        }
        System.out.println("Status: " + pedido.getEntregaConcluida());
        System.out.println("Total: " + pedido.getValor());
        System.out.println("--------------------------------");
    }

    public void mostrarListaPedidos(List<Pedido> pedidos) {
        System.out.println("Lista de Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("ID: " + pedido.getID());
            System.out.println("Cliente: " + pedido.getClientePedido().getNome());
            System.out.println("Status: " + pedido.getEntregaConcluida());
            System.out.println("--------------------------------");
        }
    }
}

