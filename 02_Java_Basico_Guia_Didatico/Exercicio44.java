public class Exercicio44 {
    public static void main(String[] args) {
        String[] vendedores = {"Ana", "Bruno", "Carla", "Diego"};
        double[] vendas = {12500, 8900, 10000, 15200};
        double meta = 10000, total = 0, maior = 0;
        for (int i = 0; i < vendedores.length; i++) {
            if (vendas[i] >= meta) System.out.println(vendedores[i] + " atingiu a meta (R$ " + vendas[i] + ")");
            total += vendas[i];
            maior = Math.max(maior, vendas[i]);
        }
        System.out.printf("Total da equipe: R$ %.2f%nMaior venda: R$ %.2f%n", total, maior);
    }
}
