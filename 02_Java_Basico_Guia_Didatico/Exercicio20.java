public class Exercicio20 {
    public static void main(String[] args) {
        boolean ativo = true;
        boolean bloqueado = false;
        boolean podeEntrar = ativo && !bloqueado;
        System.out.println("Pode entrar? " + podeEntrar);
    }
}
