public class Exercicio43 {
    public static void main(String[] args) {
        String[] produtos = {"Caneta", "Caderno", "Mochila", "Lápis", "Borracha"};
        int[] estoques = {3, 12, 7, 0, 9};
        int repor = 0;
        for (int i = 0; i < produtos.length; i++) {
            String situacao;
            if (estoques[i] < 5) { situacao = "REPOR"; repor++; }
            else if (estoques[i] < 10) situacao = "ATENÇÃO";
            else situacao = "OK";
            System.out.println(produtos[i] + " (" + estoques[i] + "): " + situacao);
        }
        System.out.println("Produtos para repor: " + repor);
    }
}
