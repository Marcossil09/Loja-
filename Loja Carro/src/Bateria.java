public class Bateria extends Peca {
    private int voltagem;

    public Bateria(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }
}
