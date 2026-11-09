public class Exercicio36 {
    public static void main(String[] args) {
        int tentativa = 0;
        boolean sucesso;
        do {
            tentativa++;
            sucesso = tentativa == 3; // sucesso na terceira tentativa
            System.out.println("Tentativa " + tentativa + ": " + (sucesso ? "sucesso" : "falha"));
        } while (!sucesso && tentativa < 4);
    }
}
