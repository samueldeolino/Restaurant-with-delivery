public class Entrega {
    private int ID;
    private String endereco;
    private float valor;
    private int status;

    public Entrega(int ID, String endereco, float valor) {
        this.ID = ID;
        this.endereco = endereco;
        this.valor = valor;
        this.status = 0;
    }

    public Entrega() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
