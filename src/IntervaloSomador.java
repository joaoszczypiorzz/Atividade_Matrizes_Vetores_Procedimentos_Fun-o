import java.util.Scanner; //importando biblioteca para o Scanner

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class IntervaloSomador {
    public static void main(String[] args) {
        //declarando Scanner para entrada de dados
        Scanner leia = new Scanner(System.in);

        //variáveis para armazenar os valores de início e fim do intervalo
        int inicio, fim;

        //pedindo ao usuário para digitar o primeiro valor (início do intervalo)
        System.out.println("Digite o primeiro número do intervalo:");
        inicio = leia.nextInt(); //armazenando o valor digitado

        //pedindo ao usuário para digitar o segundo valor (fim do intervalo)
        System.out.println("Digite o segundo número do intervalo:");
        fim = leia.nextInt(); //armazenando o valor digitado

        //chamando a função SuperSomador e guardando o retorno na variável resultado
        int resultado = SuperSomador(inicio, fim);

        //imprimindo o resultado final na tela
        System.out.println("A soma dos números no intervalo de " + inicio + " até " + fim + " é: " + resultado);
    }

    //Função SuperSomador que recebe dois valores inteiros
    //e retorna a soma de todos os números entre esses dois valores (inclusive eles mesmos)
    public static int SuperSomador(int a, int b) {
        //criando variável para armazenar a soma
        int soma = 0;

        //verificando qual valor é menor para evitar erro no laço (aceita a ordem invertida também)
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);

        //laço que vai do menor até o maior número, somando todos eles
        for(int i = menor; i <= maior; i++){
            soma += i; //acumulando os valores
        }

        //retornando a soma final para o programa principal
        return soma;
    }
}
