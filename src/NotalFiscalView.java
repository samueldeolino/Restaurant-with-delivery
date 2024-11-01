import java.util.List;

class NotaFiscalView {
    public static void mostrarDetalhesNotaFiscal(NotaFiscal notaFiscal) {
        System.out.println("\n=== NOTA FISCAL ===");
        System.out.println("Detalhes da Nota Fiscal:");
        System.out.println("ID: " + notaFiscal.getID());
        System.out.println("Horário: " + notaFiscal.getHorario());
        System.out.println("Pedido na Nota Fiscal:");
        System.out.println(" - Numero: " + notaFiscal.getPedido().getID());
        System.out.println("   Nome do cliente: " + notaFiscal.getPedido().getClientePedido().getNome());
        System.out.println("   Cpf do cliente: " + notaFiscal.getPedido().getClientePedido().getCPF());
        System.out.println("   Valor do pedido: " + notaFiscal.getPedido().getValor());
        if(!notaFiscal.getPedido().getItens().isEmpty()){
                    System.out.println("\n=== ITENS DO PEDIDO ===");
                    for (Item item : notaFiscal.getPedido().getItens()) {
                        System.out.println(String.format("Numero do Item: %d",item.getID()));
                        System.out.println(String.format("Nome do Item: %s",item.getNome()));
                        System.out.println(String.format("Valor do Item: %.2f",item.getValor()));
                        System.out.println("------------------");
                    }
                }else{
                    System.out.println("O pedido se encontra vazio");
                };
        System.out.println("============================");
    }
    
}
