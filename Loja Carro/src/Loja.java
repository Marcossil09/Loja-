import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Peca> pecas;

    public Loja() {
        this.pecas = new ArrayList<>();
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public void exibirPecas() {
        for (Peca peca : pecas) {
            System.out.println(peca.getNome() + " - " + peca.getPreco());
        }
    }

    public double calcularPrecoTotal() {
        double total = 0;
        for (Peca peca : pecas) {
            total += peca.getPreco();
        }
        return total;
    }
}