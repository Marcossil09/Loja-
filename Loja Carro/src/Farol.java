public class Farol extends Peca {
    private String tipo;

    public Farol(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}