import java.util.List;

class ItemView {
    public void mostrarDetalhesItem(Item item) {
        System.out.println("Detalhes do Item:");
        System.out.println("ID: " + item.getID());
        System.out.println("Nome: " + item.getNome());
        System.out.println("Valor: " + item.getValor());
        System.out.println("--------------------------------");
    }

    public void mostrarListaItens(List<Item> itens) {
        System.out.println("Lista de Itens:");
        for (Item item : itens) {
            System.out.println("ID: " + item.getID());
            System.out.println("Nome: " + item.getNome());
            System.out.println("Valor: " + item.getValor());
            System.out.println("--------------------------------");
        }
    }
}
