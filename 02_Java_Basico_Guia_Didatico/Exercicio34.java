public class Exercicio34 {
    public static void main(String[] args) {
        String[] status = {"NOVO", "PAGO", "ENVIADO", "CANCELADO"};
        for (String s : status) {
            String acao = switch (s) {
                case "NOVO" -> "Aguardar pagamento";
                case "PAGO" -> "Separar e embalar";
                case "ENVIADO" -> "Acompanhar entrega";
                case "CANCELADO" -> "Estornar valores";
                default -> "Status desconhecido";
            };
            System.out.println(s + ": " + acao);
        }
    }
}
