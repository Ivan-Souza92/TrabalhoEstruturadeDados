
public class Questao8 {

    public static void main(String[] args){

        int [] vetor8 = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        int maiorNumero = VerificaOMaiorNum(vetor8);

        System.out.println("O maior número do vetor: " + maiorNumero);

    }

    public static int VerificaOMaiorNum(int [] vetor){

        int maiorNumero = 0;
        for(int i=0; i< vetor.length; i++){

            if(maiorNumero < vetor[i]){
                maiorNumero = vetor[i];
            }
        }

        return maiorNumero;
    }
}
