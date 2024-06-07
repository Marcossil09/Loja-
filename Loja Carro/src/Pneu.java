public class Pneu extends Peca {
    private int tamanho;

    public Pneu(String nome, double preco, int tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}