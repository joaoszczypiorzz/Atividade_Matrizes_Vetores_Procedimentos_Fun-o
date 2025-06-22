import java.util.Arrays;
import java.util.Random;


//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class VetorOrdemCrescente {
    public static void main(String[] args) {
        //definindo a variavel para o sorteio dos números aleatorios
        Random sorteio = new Random();


        //definindo vetor
        int vetor [] = new int[20];


        //laço para sortear os números em cada posição do vetor
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = sorteio.nextInt(99) + 0; //Vetor vai receber em cada uma de suas posições um número aleatorio entre 0 e 99


        }
        //saida de dados ao usuario de como ficou os números dentro do vetor
        System.out.println("Números aleatorios gerados pelo computador dentro do vetor:\n" + Arrays.toString(vetor));


        //Usando essa função da biblioteca Arrays, pois ela arruma automaticamente os números dentro do vetor em ordem crescente
        Arrays.sort(vetor);


        //saida de dados do vetor em ordem crescente
        System.out.println("Vetor em ordem crescente ( do menor para o maior número )\n" + Arrays.toString(vetor));




    }
}
