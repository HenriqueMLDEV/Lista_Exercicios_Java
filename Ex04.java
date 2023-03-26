/* 4. Escrever um algoritmo que receba via construtor:
*- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/

public class ValorTotalComIPI {
    private double ipi;
    private int codigo1;
    private double valor1;
    private int quantidade1;
    private int codigo2;
    private double valor2;
    private int quantidade2;
    
    public ValorTotalComIPI(double ipi, int codigo1, double valor1, int quantidade1, int codigo2, double valor2, int quantidade2) {
        this.ipi = ipi;
        this.codigo1 = codigo1;
        this.valor1 = valor1;
        this.quantidade1 = quantidade1;
        this.codigo2 = codigo2;
        this.valor2 = valor2;
        this.quantidade2 = quantidade2;
    }
    
    public double calcularValorTotal() {
        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);
        return valorTotal;
    }

    public static void main(String[] args) {
        ValorTotalComIPI venda = new ValorTotalComIPI(10.0, 1, 100.00, 2, 2, 50.00, 3);
        double valorTotal = venda.calcularValorTotal();
        System.out.println("Valor total a ser pago: R$" + valorTotal);
    }
}
