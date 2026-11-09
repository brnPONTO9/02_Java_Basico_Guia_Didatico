public class Exercicio35 {
    public static void main(String[] args) {
        int pendentes = 8;
        int numero = 1;
        while (pendentes > 0) {
            System.out.println("Processando pedido " + numero++);
            pendentes--;
            System.out.println("Pendentes: " + pendentes);
        }
    }
}
