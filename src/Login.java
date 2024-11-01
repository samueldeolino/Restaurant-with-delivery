import java.util.ArrayList;
import java.util.List;
public class Login {
    private static List<Usuario> usuariosValidos;


    static {
        Cadastro cadastro = new Cadastro();
        usuariosValidos = cadastro.getUsuario();
    }
    

    public static Cliente autenticar(int cpf, String senha) {
            for (Usuario usuario : usuariosValidos) {
                if (usuario.getCpf() == cpf && usuario.getSenha().equals(senha)) {
                    if (usuario instanceof Usuario) {
                        int idUsuario = 1;
                        if(usuariosValidos != null){
                            for(Usuario usuario2 : usuariosValidos){
                                if(usuario2.getID() >= idUsuario){
                                    idUsuario = usuario2.getID() + 1;
                                }
                            }
                        }
                        Cliente cliente = new Cliente(idUsuario,usuario.getNome(), usuario.getCPF(), usuario.getSenha());
                        return cliente;
                    } else {
                        return null;
                    }
                }
            }
            return null;
        }
}