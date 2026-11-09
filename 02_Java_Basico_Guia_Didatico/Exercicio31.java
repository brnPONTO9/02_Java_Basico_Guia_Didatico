public class Exercicio31 {
    public static void main(String[] args) {
        int totalPontos = 37, atividades = 6;
        double media = (double) totalPontos / atividades;
        System.out.printf("Média: %.2f (sem casting seria %d)%n", media, totalPontos / atividades);
    }
}
