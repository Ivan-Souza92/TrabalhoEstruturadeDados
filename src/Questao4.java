import java.util.ArrayList;
import java.util.Arrays;

public class Questao4 {

    public static void main(String[] args){

        ArrayList<Integer> vetor4 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            adicionar(vetor4, i);
        }

        System.out.println(vetor4);
    }

    public static void adicionar(ArrayList<Integer> lista, int valor){

        lista.add(valor);
    }
}
