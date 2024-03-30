
public class Questao6 {

    public static void main(String[] args) {
        int[] vetor6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = calcularSoma(vetor6);
        System.out.println(soma);
    }
    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int elemento : vetor) {
            soma += elemento;
        }
        return soma;
    }
}
