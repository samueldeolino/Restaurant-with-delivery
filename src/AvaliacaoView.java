class AvaliacaoView {
    public void exibirDetalhesAvaliacao(Avaliacao avaliacao) {
        System.out.println("============== Detalhes da Avaliação ==============");
        System.out.println("Numero: " + avaliacao.getID());
        System.out.println("Comentário: " + avaliacao.getComentario());
        System.out.println("Autor: " + avaliacao.getAutor());
        System.out.println("Número de Estrelas: " + avaliacao.getNumEstrelas());
    }
}