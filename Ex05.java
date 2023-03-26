/*5. Crie um algoritmo que receba via construtor o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$1320,00) */


public class SalarioMinimo {
    private double salarioMinimo;
    private double salarioUsuario;
    
    public SalarioMinimo(double salarioMinimo, double salarioUsuario) {
        this.salarioMinimo = salarioMinimo;
        this.salarioUsuario = salarioUsuario;
    }
    
    public double calcularQuantidadeSalariosMinimos() {
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        return quantidadeSalariosMinimos;
    }

    public static void main(String[] args) {
        SalarioMinimo salario = new SalarioMinimo(1320.00, 2640.00);
        double quantidadeSalariosMinimos = salario.calcularQuantidadeSalariosMinimos();
        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
