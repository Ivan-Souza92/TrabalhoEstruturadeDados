import java.util.ArrayList;
import java.util.Random;

public class Questao5 {

    public static void main(String[] args) {
        ArrayList<Integer> vetor4 = new ArrayList<>();

        adicionar(vetor4, 1000);

        System.out.println("Tamanho do vetor: "+ vetor4.size());

        for (int i = 0; i < vetor4.size(); i++) {
            System.out.println(vetor4.get(i));
        }
    }

    public static void adicionar(ArrayList<Integer> lista, int quantidade) {
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(random.nextInt(1000));
        }
    }
}
