
// 2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

public class Medias {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 7;
        int d = 4;
        int e = 5;
        int f = 6;

        // Calcula as médias
        double media1 = (a + b + c) / 3.0;
        double media2 = (d + e + f) / 3.0;

        // Calcula a soma das médias
        double somaDasMedias = media1 + media2;

        // Calcula a média das médias
        double mediaDasMedias = somaDasMedias / 2.0;

        // Imprime os resultados
        System.out.println("Média 1: " + media1);
        System.out.println("Média 2: " + media2);
        System.out.println("Soma das médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
