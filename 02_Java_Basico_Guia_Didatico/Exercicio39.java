public class Exercicio39 {
    public static void main(String[] args) {
        double[] notas = {5.5, 7.0, 8.5, 6.0, 9.0};
        int aprovados = 0;
        for (double nota : notas) {
            if (nota >= 7) aprovados++;
        }
        System.out.println("Aprovados: " + aprovados);
    }
}
