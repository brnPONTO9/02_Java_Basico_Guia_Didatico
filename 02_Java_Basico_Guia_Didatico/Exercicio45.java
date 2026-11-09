public class Exercicio45 {
    public static void main(String[] args) {
        double totalCompra = 250;
        boolean assinante = false;
        double distanciaKm = 12;
        double frete = (totalCompra >= 300 || assinante) ? 0 : 15 + 0.80 * distanciaKm;
        System.out.println(frete == 0 ? "Frete grátis" : String.format("Frete: R$ %.2f", frete));
    }
}
