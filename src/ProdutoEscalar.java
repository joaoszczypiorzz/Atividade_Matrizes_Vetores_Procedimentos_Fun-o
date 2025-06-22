import java.util.Scanner; //importando biblioteca Scanner para entrada de dados

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class ProdutoEscalar {
    public static void main(String[] args) {
        //criando Scanner para entrada de dados
        Scanner leia = new Scanner(System.in);

        //pedindo ao usuário quantas posições terão os vetores
        System.out.println("Informe o tamanho dos vetores:");
        int M = leia.nextInt();

        //declarando os dois vetores com M posições
        int vetorA[] = new int[M];
        int vetorB[] = new int[M];

        //preenchendo o primeiro vetor com dados do usuário
        for (int i = 0; i < M; i++) {
            System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A:");
            vetorA[i] = leia.nextInt();
        }

        //preenchendo o segundo vetor com dados do usuário
        for (int i = 0; i < M; i++) {
            System.out.println("Digite o valor da posição " + (i + 1) + " do vetor B:");
            vetorB[i] = leia.nextInt();
        }

        //chamando a função que calcula o produto escalar entre os dois vetores
        int resultado = produtoEscalar(vetorA, vetorB);

        //exibindo o resultado na tela
        System.out.println("O produto escalar entre os vetores é: " + resultado);
    }

    //Função que calcula o produto escalar entre dois vetores inteiros
    public static int produtoEscalar(int[] vetor1, int[] vetor2) {
        int soma = 0; //variável que vai guardar a soma dos produtos

        //percorrendo todos os elementos dos vetores ao mesmo tempo
        for (int i = 0; i < vetor1.length; i++) {
            soma += vetor1[i] * vetor2[i]; //multiplicando os valores das mesmas posições e somando
        }

        //retornando a soma total (produto escalar)
        return soma;
    }
}