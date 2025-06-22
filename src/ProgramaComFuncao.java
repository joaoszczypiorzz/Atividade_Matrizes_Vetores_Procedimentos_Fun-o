import java.util.Scanner; // Importando Scanner para ler dados do teclado

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class ProgramaComFuncao {

    //Aqui está a função Somador, ela recebe dois valores inteiros como parâmetro
    //e retorna a soma desses dois valores
    public static int Somador(int a, int b) {
        int resultado = a + b; // Soma os dois números recebidos
        return resultado; // Retorna o valor da soma
    }

    public static void main(String[] args) { //começa a rodar de fato o codigo ( o main fuciona como nosso campo de futebol )
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário

        //Pedindo que o usuário digite o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt(); // Lê o primeiro número

        //pedindo o segundo valor
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt(); // Lê o segundo número

        //Chama a função Somador, passando os dois valores lidos como argumentos
        int resultadoSoma = Somador(valor1, valor2);

        // Exibe o resultado retornado pela função
        System.out.println("A soma dos dois valores é: " + resultadoSoma);

        scanner.close(); //Fechando Scanner, pois é sempre bom fechar
    }
}