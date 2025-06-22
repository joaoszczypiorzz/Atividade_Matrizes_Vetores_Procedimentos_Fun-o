import java.util.Arrays; //biblioteca para imprimir o vetor na tela

public class Vetor3 {

    //Aluno João Vitor Szczypior Tavares; Matricula: 25104160
    public static void main(String[] args) {
        //declarando vetor
        int vetor [] = new int[15];

        //declarando os termos para a formula de fibonacci
        int termo1 = 0;
        int termo2 = 1;
        int proximotermo = 0;

        //Laço para incluir 15 termos da sequência de fibonacci no vetor
        for(int i = 0; i < 15;i++){
            vetor [i] = proximotermo;
            proximotermo=termo1 + termo2;
            termo1=termo2;
            termo2 = proximotermo;


        }
        //Saída de dados
        System.out.println("Vetor com 15 números da sequência de Fibonacci:\n" + Arrays.toString(vetor));

    }
}