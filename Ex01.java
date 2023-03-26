
//1. Faça um algoritmo que receba via constutor a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
//Obs.: Leve em consideração o ano com 365 dias e o mês com 30
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)


public class IdadeEmDias {
    private int anos;
    private int meses;
    private int dias;

    public IdadeEmDias(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int calcularIdadeEmDias() {
        int totalDias = (this.anos * 365) + (this.meses * 30) + this.dias;
        return totalDias;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        IdadeEmDias idade = new IdadeEmDias(3, 2, 15);
        int idadeEmDias = idade.calcularIdadeEmDias();
        System.out.println(idadeEmDias); // Imprime: 1170
    }
}
