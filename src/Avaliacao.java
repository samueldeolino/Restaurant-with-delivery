class Avaliacao {
    private int ID;
    private String comentario;
    private String autor;
    private int numEstrelas;
    private Pedido pedido;

    public Avaliacao(String comentario, String autor, int numEstrelas, Pedido pedido) {
        this.comentario = comentario;
        this.autor = autor;
        this.numEstrelas = numEstrelas;
        this.pedido = pedido;
    }

    public Avaliacao() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEstrelas() {
        return numEstrelas;
    }

    public void setNumEstrelas(int numEstrelas) {
        this.numEstrelas = numEstrelas;
    }

    
}
