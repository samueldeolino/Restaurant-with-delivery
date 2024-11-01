import java.util.Scanner;
import java.util.List;

public class CardapioView {
    public static void exibirCardapio(Pedido pedido) {
        Cardapio cardapio = new Cardapio();
        Scanner scanner = new Scanner(System.in);
        // Adicionar itens ao cardápio
        Item item1 = new Item(1, "Hambúrguer", 15.99f);
        Item item2 = new Item(2, "Pizza", 20.99f);
        Item item3 = new Item(3, "Refrigerante", 5.99f);
        Item item4 = new Item(4, "Lasanha", 25.99f);
        Item item5 = new Item(5, "Feijoada", 30.50f);
        Item item6 = new Item(6, "Pizza", 20.99f);
        Item item7 = new Item(7, "Sushi", 35.99f);
        Item item8 = new Item(8, "Hambúrguer", 15.99f);
        Item item9 = new Item(9, "Salada Caesar", 18.50f);
        Item item10 = new Item(10, "Frango Grelhado", 22.99f);

        cardapio.addItemCardapio(item1);
        cardapio.addItemCardapio(item2);
        cardapio.addItemCardapio(item3);
        cardapio.addItemCardapio(item4);
        cardapio.addItemCardapio(item5);
        cardapio.addItemCardapio(item6);
        cardapio.addItemCardapio(item7);
        cardapio.addItemCardapio(item8);
        cardapio.addItemCardapio(item9);
        cardapio.addItemCardapio(item10);

        pedido.adicionarItemPedido(pedido.getClientePedido().getPedidos(),cardapio,pedido);
    }
}
