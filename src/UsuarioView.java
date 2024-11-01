class UsuarioView {
    public void exibirDetalhesUsuario(Usuario usuario) {
        System.out.println("Detalhes do Usuário:");
        System.out.println("ID: " + usuario.getID());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
    }
}