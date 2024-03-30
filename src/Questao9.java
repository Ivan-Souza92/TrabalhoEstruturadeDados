
public class Questao9 {

    public static void main(String[] args){

        int [] vetor9 = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        int menorNumero = VerificaOMenorNum(vetor9);

        System.out.println("O menor número do vetor: " + menorNumero);

    }

    public static int VerificaOMenorNum(int [] vetor){

        //int menorNumero = 99999;
        int menorNumero = Integer.MAX_VALUE;
        for (int i=0; i< vetor.length; i++){

            if(menorNumero > vetor[i]){
                menorNumero = vetor[i];
            }
        }

        return menorNumero;
    }
}
