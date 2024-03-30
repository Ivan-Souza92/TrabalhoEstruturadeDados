
public class Questao7 {
    public static void main(String[] args){

        int [] vetor7  = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        float aux = media(vetor7);

        System.out.println("A media do vetor é: " + aux);

    }

    public static float media(int[] vetor) {
        int soma = 0;
        float media = 0;
        for (int elemento : vetor) {
            soma += elemento;
        }
        media = (float) soma / vetor.length;
        return media;
    }
}
