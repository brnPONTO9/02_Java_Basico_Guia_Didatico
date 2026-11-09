public class Exercicio50 {
    public static void main(String[] args) {
        String cliente = "Marcos";
        String status = "PAGO";
        int quantidade = 3, estoque = 10;
        double precoUnitario = 150.00;
        boolean pagamentoConfirmado = true;

        double total = quantidade * precoUnitario;
        if (total >= 400) total *= 0.90; // desconto VIP de 10%

        if (!pagamentoConfirmado) {
            System.out.println("Pagamento não confirmado.");
        } else if (estoque < quantidade) {
            System.out.println("Estoque insuficiente.");
        } else {
            System.out.printf("Pedido de %s - total: R$ %.2f%n", cliente, total);
            String proxima = switch (status) {
                case "NOVO" -> "Aguardar pagamento";
                case "PAGO" -> "Separar o pedido";
                case "ENVIADO" -> "Acompanhar entrega";
                case "CANCELADO" -> "Estornar valor";
                default -> "Status desconhecido";
            };
            System.out.println("Próxima ação: " + proxima);
        }
    }
}
