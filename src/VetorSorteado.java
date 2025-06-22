import java.util.Random; //biblioteca para gerar numeros aleatorios
import java.util.Arrays; //biblioteca para imprimir o vetor na tela
import java.util.Scanner; //biblioteca para importar o Scanner

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class VetorSorteado {

    public static void main(String[] args) {
        //definindo vetor com 30 elementos
        int vetor [] = new int[30];

        //definindo variavel para o sorteio dos números
        Random sortear = new Random();

        //definindo variavel do palpite do usuario
        int palpite;
        //definindo Scanner para ler a variavel palpite
        Scanner leia = new Scanner(System.in);
        //definindo variavel de contagem de vezes que o palpite foi sorteado no vetor
        int contagem = 0;
        //definindo variavel boolean caso o número não for encontrado
        boolean encontrado = false;

       //Laço para Sortear os números e coloca-los dentro do Vetor
        for(int i = 0; i<vetor.length;i++){
            vetor[i] = sortear.nextInt(15) + 1; //vetor vai receber em cada posição um número sorteado entre 1 e 15

        }

        //pedindo dados ao usuario
        System.out.println("Criei um vetor que irá armazenar um número aleatorio entre 1 e 15 em cada uma de suas posições \nInforme um número entre 1 e 15 como palpite e te informarei quantas vezes esse número aparece no vetor: ");
        palpite = leia.nextInt(); //lendo o palpite

        //Laço para encontrar o palpite dentro do vetor
        for(int i = 0; i <vetor.length;i++){
            if(vetor[i] == palpite){ //if caso o palpite for encontrado no vetor
                contagem++;
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
            }
        }

        //if fora do laço para caso o palpite não for encontrado dentro do vetor
        if(!encontrado){
            System.out.println("Seu palpite não foi encontrado dentro do vetor!");
        }

        //saida de quantas vezes o palpite foi achado no vetor
        System.out.println("Seu palpite foi encontrado " + contagem + " vezes dentro do vetor\n"+ Arrays.toString(vetor));





    }
}
