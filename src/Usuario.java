public class Usuario {
    private int ID;
    private String nome;
    private int cpf;
    private String senha;

    public Usuario(int ID, String nome, int cpf, String senha) {
        this.ID = ID;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Usuario() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public int getCPF() {
        return this.cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
