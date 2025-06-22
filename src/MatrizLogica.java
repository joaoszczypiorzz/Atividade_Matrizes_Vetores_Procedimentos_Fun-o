public class MatrizLogica {
    //Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
    public static void main(String[] args) {
        int[][] matriz = new int[4][4]; //Declarando a matriz

        //Laço para preencher a matriz de acordo com as condições
        for (int i = 0; i < 4; i++) { // Percorre as linhas
            for (int j = 0; j < 4; j++) { // Percorre as colunas

                //Condição: se i < j
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                }
                //Condição: se i == j
                else if (i == j) {
                    matriz[i][j] = 3 * i * i - 1;
                }
                //Condição: se i > j
                else {
                    matriz[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        //Exibindo a matriz resultante
        System.out.println("Matriz A[i][j]:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%6d", matriz[i][j]); //Formatando para saida de dados alinhada
            }
            System.out.println(); //Pula linha após cada linha da matriz
        }
    }
}