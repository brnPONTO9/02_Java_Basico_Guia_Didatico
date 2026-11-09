public class Exercicio42 {
    public static void main(String[] args) {
        double salarioBase = 3500, horasExtras = 8, valorHoraExtra = 35;
        double bruto = salarioBase + horasExtras * valorHoraExtra;
        double desconto = bruto >= 4000 ? bruto * 0.08 : bruto * 0.05;
        System.out.printf("Bruto: %.2f%nDesconto: %.2f%nLíquido: %.2f%n", bruto, desconto, bruto - desconto);
    }
}
