public class Exercicio33 {
    public static void main(String[] args) {
        int impacto = 8;
        String nivel;
        if (impacto >= 9) nivel = "crítico";
        else if (impacto >= 7) nivel = "alto";
        else if (impacto >= 4) nivel = "médio";
        else nivel = "baixo";
        System.out.println("Impacto " + impacto + " => " + nivel);
    }
}
