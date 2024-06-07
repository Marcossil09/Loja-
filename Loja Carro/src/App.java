public class App {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // Add some parts to the inventory
        loja.adicionarPeca(new Pneu("Pneu 1", 100.0, 15));
        loja.adicionarPeca(new Bateria("Bateria 1", 200.0, 12));
        loja.adicionarPeca(new Farol("Farol 1", 150.0, "Dianteiro"));

        // Display the menu
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar peça");
            System.out.println("2 - Exibir peças");
            System.out.println("3 - Calcular preço total");
            System.out.println("4 - Sair");

            int opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    // Add a new part to the inventory
                    System.out.println("Digite o nome da peça:");
                    String nome = System.console().readLine();
                    System.out.println("Digite o preço da peça:");
                    double preco = Double.parseDouble(System.console().readLine());
                    System.out.println("Digite o tipo da peça (pneu, bateria ou farol):");
                    String tipo = System.console().readLine();

                    if (tipo.equalsIgnoreCase("pneu")) {
                        System.out.println("Digite o tamanho do pneu:");
                        int tamanho = Integer.parseInt(System.console().readLine());
                        loja.adicionarPeca(new Pneu(nome, preco, tamanho));
                    } else if (tipo.equalsIgnoreCase("bateria")) {
                        System.out.println("Digite a voltagem da bateria:");
                        int voltagem = Integer.parseInt(System.console().readLine());
                        loja.adicionarPeca(new Bateria(nome, preco, voltagem));
                    } else if (tipo.equalsIgnoreCase("farol")) {
                        System.out.println("Digite a posição do farol (dianteiro ou traseiro):");
                        String posicao = System.console().readLine();
                        loja.adicionarPeca(new Farol(nome, preco, posicao));
                    }
                    break;
                case 2:
                    loja.exibirPecas();
                    break;
                case 3:
                    System.out.println("Preço total: " + loja.calcularPrecoTotal());
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}