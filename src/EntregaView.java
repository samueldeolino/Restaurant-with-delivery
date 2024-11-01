import java.util.List;

class EntregaView {
    public void mostrarDetalhesEntrega(Entrega entrega) {
        System.out.println("Detalhes da Entrega:");
        System.out.println("ID: " + entrega.getID());
        System.out.println("Endereço: " + entrega.getEndereco());
        System.out.println("Valor: " + entrega.getValor());
        System.out.println("Status: " + entrega.getStatus());
        System.out.println("--------------------------------");
    }

    public void mostrarListaEntregas(List<Entrega> entregas) {
        System.out.println("Lista de Entregas:");
        for (Entrega entrega : entregas) {
            System.out.println("ID: " + entrega.getID());
            System.out.println("Endereço: " + entrega.getEndereco());
            System.out.println("Valor: " + entrega.getValor());
            System.out.println("Status: " + entrega.getStatus());
            System.out.println("--------------------------------");
        }
    }
}
