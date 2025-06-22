import java.util.Scanner; //importando biblioteca para o Scanner
import java.util.Arrays; //importando biblioteca Arrays

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class VetorMedias {
    public static void main(String[] args) {
        //declarando vetor
        int vetor [] = new int[10];

        //declarando Scanner
        Scanner leia = new Scanner(System.in);

        //Declarando variavel para a soma dos números dentro do vetor
        int somaVetor = 0;

        //variavel para conategem de alunos acima da média
        int contagem = 0;

        //laço para pedir 10 notas de 10 alunos diferentes e guarda-las no vetor
        for(int i = 0; i < vetor.length; i++){
            //pedindo dados ao usuário
            System.out.println("Informe a nota do aluno " + (i+1) + ":");
            vetor [i] = leia.nextInt(); //indicando para onde eu quero que o Scanner guarde as informações que o usuario digitar
            somaVetor += vetor[i]; //adicionando os números dentro do vetor na soma para calculo da média posteriormente

        }
        //calculando a média das notas
        double media = (double) somaVetor / vetor.length;

        //imprimindo as médias na tela
        System.out.println("A média dos alunos foi: " + media);

        //variavel para a maior nota usando a biblioteca Arrays
        int maiorNota = Arrays.stream(vetor).max().orElse(Integer.MIN_VALUE);

        //imprimindo maior nota na tela
        System.out.println("A maior nota foi: " + maiorNota);

        //laço para ver quantos alundo estão acima da média
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] >= media){
                System.out.println("O aluno " + (i+1) + " está acima da média" );
                contagem++;
            }
            if(vetor[i] == maiorNota){
                System.out.println("O aluno " + (i+1) + " teve a maior nota");
            }
        }
        //imprimindo na tela quantos alunos ficaram acima da média
        System.out.println("A quantidade de alunos acima da média foi:" + contagem);


    }
}
