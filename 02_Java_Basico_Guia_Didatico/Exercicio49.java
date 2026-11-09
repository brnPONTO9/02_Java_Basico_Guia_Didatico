public class Exercicio49 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};
        double[] notas = {8.5, 6.0, 7.0, 4.5, 9.5};
        double soma = 0, maior = 0;
        int aprovados = 0;
        for (int i = 0; i < nomes.length; i++) {
            boolean aprovado = notas[i] >= 7;
            if (aprovado) aprovados++;
            soma += notas[i];
            maior = Math.max(maior, notas[i]);
            System.out.println(nomes[i] + ": " + notas[i] + " - " + (aprovado ? "Aprovado" : "Reprovado"));
        }
        System.out.printf("Média da turma: %.2f%nAprovados: %d%nMaior nota: %.1f%n", soma / nomes.length, aprovados, maior);
    }
}
