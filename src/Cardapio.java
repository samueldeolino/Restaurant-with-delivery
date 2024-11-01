import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Item> itensCardapio;

    public Cardapio() {
        this.itensCardapio = new ArrayList<>();
    }

    public void addItemCardapio(Item item) {
        itensCardapio.add(item);
    }

    public List<Item> getItensCardapio() {
        return itensCardapio;
    }

    public void exibirCardapio() {
        System.out.println("=== Cardápio ===");
        if (itensCardapio.isEmpty()) {
            System.out.println("O cardápio está vazio.");
        } else {
            for (Item item : itensCardapio) {
                System.out.println("ID: " + item.getID());
                System.out.println("Nome: " + item.getNome());
                System.out.println("Valor: " + item.getValor());
                System.out.println("------------------");
            }
        }
    }
}

