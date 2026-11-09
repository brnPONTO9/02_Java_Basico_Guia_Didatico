public class Exercicio17 {
    public static void main(String[] args) {
        double subtotal = 500.00;
        double desconto = subtotal * 0.15;
        double total = subtotal - desconto;
        System.out.printf("Subtotal: R$ %.2f%nDesconto: R$ %.2f%nTotal: R$ %.2f%n", subtotal, desconto, total);
    }
}
