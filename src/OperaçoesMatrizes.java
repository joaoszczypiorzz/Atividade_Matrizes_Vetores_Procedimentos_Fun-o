import java.util.Scanner; //importando biblioteca para o Scanner

public class OperaçoesMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //declarando scanner para ler dados do teclado

        //Criando duas matrizes 2x2 de números reais (double)
        double[][] matriz1 = new double[2][2];
        double[][] matriz2 = new double[2][2];

        //Mensagem para o usuário saber que ele vai preencher a primeira matriz
        System.out.println("Digite os valores da primeira matriz (2x2):");

        //Laço para ler os elementos da primeira matriz
        for (int i = 0; i < 2; i++) { // linhas
            for (int j = 0; j < 2; j++) { // colunas
                System.out.print("matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextDouble(); // lê e armazena o valor
            }
        }

        //Agora vamos ler a segunda matriz
        System.out.println("\nDigite os valores da segunda matriz (2x2):");

        for (int i = 0; i < 2; i++) { // mesmas linhas e colunas
            for (int j = 0; j < 2; j++) {
                System.out.print("matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextDouble(); // lê e armazena o valor
            }
        }

        //Menu de opções para o usuário escolher o que quer fazer
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Somar as duas matrizes");
        System.out.println("2 - Subtrair a primeira matriz da segunda");
        System.out.println("3 - Adicionar uma constante a todas as duas matrizes");
        System.out.println("4 - Imprimir as duas matrizes");

        System.out.print("Digite a opção: ");
        int opcao = scanner.nextInt(); // lê a escolha do usuário

        //Usando a estrutura de repetição escolha caso para as opções que o usuario tem
        switch (opcao) {
            case 1:
                //Soma das matrizes
                System.out.println("\nResultado da soma das matrizes:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        double soma = matriz1[i][j] + matriz2[i][j]; // soma os elementos
                        System.out.print(soma + "\t"); // imprime com tabulação
                    }
                    System.out.println(); // quebra de linha
                }
                break;

            case 2:
                //Subtração: segunda - primeira
                System.out.println("\nResultado da subtração (matriz2 - matriz1):");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        double subtracao = matriz2[i][j] - matriz1[i][j];
                        System.out.print(subtracao + "\t");
                    }
                    System.out.println();
                }
                break;

            case 3:
                //Adicionar constante a ambas as matrizes
                System.out.print("\nDigite a constante que deseja adicionar: ");
                double constante = scanner.nextDouble(); // lê a constante

                System.out.println("\nMatriz 1 após adição:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        matriz1[i][j] += constante; // soma a constante
                        System.out.print(matriz1[i][j] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("\nMatriz 2 após adição:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        matriz2[i][j] += constante;
                        System.out.print(matriz2[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            case 4:
                //Imprimir as duas matrizes na tela
                System.out.println("\nMatriz 1:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matriz1[i][j] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("\nMatriz 2:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matriz2[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            default:
                //Caso o usuário digite uma opção inválida
                System.out.println("Opção inválida.");
        }

        scanner.close(); //Fechando Scanner
    }
}