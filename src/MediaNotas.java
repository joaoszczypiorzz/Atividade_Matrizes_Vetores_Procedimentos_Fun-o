import java.util.Scanner; //importando biblioteca para o Scanner

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class MediaNotas {
    public static void main(String[] args) {
        //declarando o Scanner para entrada de dados
        Scanner leia = new Scanner(System.in);

        //declarando vetor para armazenar as 4 notas do aluno
        double[] notas = new double[4];

        //laço para solicitar as 4 notas do aluno
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = leia.nextDouble(); //lendo e armazenando nota na posição do vetor
        }

        //chamando a função Media e armazenando o resultado em uma variável
        double mediaFinal = Media(notas);

        //imprimindo o resultado da média na tela
        System.out.println("A média final do aluno é: " + mediaFinal);
    }

    //Função que calcula a média das 4 notas e retorna o resultado
    public static double Media(double[] notasAluno) {
        //declarando variável para a soma
        double soma = 0;

        //laço para somar todas as notas
        for(int i = 0; i < notasAluno.length; i++) {
            soma += notasAluno[i]; //adicionando cada nota na soma
        }

        //calculando a média e retornando para o programa principal
        return soma / notasAluno.length;
    }
}
