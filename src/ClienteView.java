import java.util.List;

class ClienteView {
    public void mostrarDetalhesCliente(Cliente cliente) {
        System.out.println("Detalhes do Cliente:");
        System.out.println("ID: " + cliente.getID());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("--------------------------------");
    }

    public void mostrarListaAvaliacoes(List<Avaliacao> avaliacoes) {
        System.out.println("Lista de Avaliações:");
        for (Avaliacao avaliacao : avaliacoes) {
            System.out.println("ID: " + avaliacao.getID());
            System.out.println("Autor: " + avaliacao.getAutor());
            System.out.println("Comentário: " + avaliacao.getComentario());
            System.out.println("Número de Estrelas: " + avaliacao.getNumEstrelas());
            System.out.println("--------------------------------");
        }
    }
}

