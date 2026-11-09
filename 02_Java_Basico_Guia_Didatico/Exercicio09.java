public class Exercicio09 {
    public static void main(String[] args) {
        double d = 9.8;
        int i = (int) d;
        System.out.println(d + " -> " + i);
        // O cast para int descarta (trunca) a parte decimal; não arredonda. 9.8 vira 9.
    }
}
