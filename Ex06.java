
// 6. Desenvolva um algoritmo em Java que receba via construtor um número inteiro e imprima o seu antecessor e seu sucessor.

public class AntecessorSucessor {
    private int numero;
    
    public AntecessorSucessor(int numero) {
        this.numero = numero;
    }
    
    public int getAntecessor() {
        return numero - 1;
    }
    
    public int getSucessor() {
        return numero + 1;
    }

    public static void main(String[] args) {
        AntecessorSucessor numero = new AntecessorSucessor(10);
        int antecessor = numero.getAntecessor();
        int sucessor = numero.getSucessor();
        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);
    }
}
