import java.util.Scanner; //importando biblioteca para Scanner

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class MatrizMaiorQueDez {
    public static void main(String[] args) {
        //declarando Scanner
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4]; // Declarando matriz 4x4
        int contador = 0; // contador para números maiores que dez

        //Laço para pedir os números da matriz e guarda-los dentro do vetor
        for (int i = 0; i < 4; i++) { // linha
            for (int j = 0; j < 4; j++) { // coluna
                //pedindo ao usuario dados para colocar na matriz
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se o valor é maior que 10
                if (matriz[i][j] > 10) {
                    contador++; // Incrementa o contador
                }
            }
        }

        //Exibe o resultado
        System.out.println("\nQuantidade de valores maiores que 10: " + contador);

        scanner.close(); //Fecha o scanner
    }
}