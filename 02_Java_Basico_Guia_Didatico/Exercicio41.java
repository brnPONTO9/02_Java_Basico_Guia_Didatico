public class Exercicio41 {
    public static void main(String[] args) {
        String[] nomes = {"Teclado", "Mouse", "Monitor"};
        int[] qtd = {2, 3, 1};
        double[] preco = {150.00, 80.00, 600.00};
        double total = 0;
        for (int i = 0; i < nomes.length; i++) {
            double subtotal = qtd[i] * preco[i];
            total += subtotal;
            System.out.printf("%s: %d x %.2f = %.2f%n", nomes[i], qtd[i], preco[i], subtotal);
        }
        if (total >= 500) {
            double desconto = total * 0.10;
            System.out.printf("Desconto de 10%%: -%.2f%n", desconto);
            total -= desconto;
        }
        System.out.printf("Total do carrinho: R$ %.2f%n", total);
    }
}
