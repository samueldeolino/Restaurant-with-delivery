import java.util.ArrayList;
import java.util.List;

class Item {
    private int ID;
    private String nome;
    private float valor;
    private List<Avaliacao> avaliacoes;

    public Item(int ID, String nome, float valor) {
        this.ID = ID;
        this.nome = nome;
        this.valor = valor;
        this.avaliacoes = new ArrayList<>();
    }

    public Item() {
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
