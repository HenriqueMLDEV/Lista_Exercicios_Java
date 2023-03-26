//3. Informar um saldo e imprimir o saldo com reajuste de 1%.

public class SaldoComReajuste {
    public static void main(String[] args) {
        double saldo = 1000.00;
      // 1% de reajuste
        double reajuste = saldo * 0.01; 

        double saldoComReajuste = saldo + reajuste;
        // Imprimir os Saldos
        System.out.println("Saldo anterior: R$" + saldo);
        System.out.println("Saldo com reajuste de 1%: R$" + saldoComReajuste);
    }
}
