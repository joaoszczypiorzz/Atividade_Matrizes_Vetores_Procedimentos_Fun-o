import java.util.Scanner; //importando biblioteca para o Scanner

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class AlunosNotas {
    public static void main(String[] args) {
        //declarando Scanner
        Scanner scanner = new Scanner(System.in);

        // Criei uma matriz de 5 linhas (alunos) e 4 colunas (dados por aluno)
        // Coluna 0 = matrícula, Coluna 1 = média das provas
        // Coluna 2 = média dos trabalhos, Coluna 3 = nota final (calculada)
        int[][] alunos = new int[5][4];

        // Nesta parte, eu faço a leitura dos dados para cada aluno
        // Preencho as 3 primeiras colunas manualmente (entrada do usuário)
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1));

            System.out.print("Digite o número de matrícula: ");
            alunos[i][0] = scanner.nextInt(); // coluna 0: matrícula

            System.out.print("Digite a média das provas: ");
            alunos[i][1] = scanner.nextInt(); // coluna 1: média das provas

            System.out.print("Digite a média dos trabalhos: ");
            alunos[i][2] = scanner.nextInt(); // coluna 2: média dos trabalhos

            // A nota final é a soma da média das provas com a média dos trabalhos
            alunos[i][3] = alunos[i][1] + alunos[i][2]; // coluna 3: nota final

            System.out.println(); // só pra deixar o visual mais limpo
        }

        // Agora vou procurar o aluno com a maior nota final
        // Começo assumindo que o primeiro aluno tem a maior nota
        int maiorNota = alunos[0][3];
        int matriculaMaiorNota = alunos[0][0];

        // Percorro os outros alunos comparando as notas finais
        for (int i = 1; i < 5; i++) {
            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3]; // atualizo a maior nota
                matriculaMaiorNota = alunos[i][0]; // guardo a matrícula correspondente
            }
        }

        // Agora vou calcular a média aritmética das notas finais
        int somaNotasFinais = 0;
        for (int i = 0; i < 5; i++) {
            somaNotasFinais += alunos[i][3];
        }

        //calculando média final
        double mediaFinal = (double) somaNotasFinais / 5;

        // Exibindo os resultados
        System.out.println("Matrícula do aluno com a maior nota final: " + matriculaMaiorNota);
        System.out.println("Média das notas finais da turma: " + String.format("%.2f", mediaFinal));

        scanner.close(); // sempre bom fechar o Scanner no final
    }
}