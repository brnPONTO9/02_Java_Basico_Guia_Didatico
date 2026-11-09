public class Exercicio46 {
    static boolean podeAcessar(boolean ativo, boolean senhaValida, boolean bloqueado, boolean admin) {
        boolean usuarioComum = ativo && senhaValida && !bloqueado;
        boolean administrador = admin && !bloqueado;
        return usuarioComum || administrador;
    }
    public static void main(String[] args) {
        // cenário 1: usuário comum ativo, senha válida, não bloqueado
        System.out.println("Cenário 1: " + podeAcessar(true, true, false, false)); // true
        // cenário 2: administrador bloqueado
        System.out.println("Cenário 2: " + podeAcessar(false, false, true, true)); // false
        // cenário extra: administrador sem ser usuário comum, não bloqueado
        System.out.println("Cenário 3: " + podeAcessar(false, false, false, true)); // true
    }
}
