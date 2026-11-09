public class Exercicio32 {
    public static void main(String[] args) {
        boolean pagamentoAprovado = true;
        int estoque = 10, quantidade = 4;
        boolean enderecoValido = true;
        boolean podeEnviar = pagamentoAprovado && estoque >= quantidade && enderecoValido;
        System.out.println(podeEnviar ? "Pedido liberado para envio" : "Pedido bloqueado");
    }
}
