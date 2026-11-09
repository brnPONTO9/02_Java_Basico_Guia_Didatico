public class Exercicio48 {
    public static void main(String[] args) {
        int meta = 250, porCiclo = 37, produzido = 0, ciclos = 0;
        while (produzido < meta) {
            produzido = Math.min(produzido + porCiclo, meta); // nunca passa de 250
            ciclos++;
            System.out.println("Ciclo " + ciclos + ": " + produzido + " unidades");
        }
        System.out.println("Ciclos necessários: " + ciclos);
    }
}
