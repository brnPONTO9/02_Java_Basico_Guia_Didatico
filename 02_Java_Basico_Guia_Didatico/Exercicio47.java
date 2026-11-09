public class Exercicio47 {
    public static void main(String[] args) {
        int ocupados = 0;
        for (int fileira = 1; fileira <= 5; fileira++) {
            for (int assento = 1; assento <= 4; assento++) {
                boolean ocupado = (fileira + assento) % 2 == 0;
                if (ocupado) ocupados++;
                System.out.print("F" + fileira + "A" + assento + ":" + (ocupado ? "OCUPADO" : "LIVRE") + "  ");
            }
            System.out.println();
        }
        System.out.println("Assentos ocupados: " + ocupados);
    }
}
