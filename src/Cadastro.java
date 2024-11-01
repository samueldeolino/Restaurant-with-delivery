import java.util.ArrayList;
import java.util.List;

public class Cadastro {
   private static List<Usuario> usuariosCadastrados;

    static {
        usuariosCadastrados = new ArrayList<>();
    }

    public static boolean cadastrarUsuario(String nome, int cpf, String senha) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getCpf() == cpf) {
                return false; // CPF já cadastrado
            }
        }

        Usuario novoUsuario = new Usuario(usuariosCadastrados.size() + 1, nome, cpf, senha);
        usuariosCadastrados.add(novoUsuario);
        return true;
    }
    public List<Usuario> getUsuario(){
        return usuariosCadastrados;
    }
}