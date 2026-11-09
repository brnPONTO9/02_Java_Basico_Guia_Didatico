public class Exercicio37 {
    public static void main(String[] args) {
        double[] vendas = {120.50, 80.00, 210.30, 95.20};
        double total = 0;
        for (int i = 0; i < vendas.length; i++) total += vendas[i];
        System.out.printf("Total vendido: R$ %.2f%n", total);
    }
}
