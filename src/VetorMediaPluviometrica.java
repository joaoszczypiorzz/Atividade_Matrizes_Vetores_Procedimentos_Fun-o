import java.util.Scanner; //importando biblioteca para Scanner

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class VetorMediaPluviometrica {
    public static void main(String[] args) {
        //declarando Scanner
        Scanner scanner = new Scanner(System.in);

        double[] chuva = new double[31]; // Vetor para armazenar os índices pluviométricos
        double soma1 = 0, soma2 = 0;
        int diaMaisChuva = 0, diaMenosChuva = 0;

        // Leitura dos índices pluviométricos
        for (int i = 0; i < 31; i++) {
            System.out.print("Informe o índice pluviométrico do dia " + (i + 1) + ": ");
            chuva[i] = scanner.nextDouble();

            // Acumula soma das duas quinzenas
            if (i < 15) {
                soma1 += chuva[i];
            } else {
                soma2 += chuva[i];
            }

            // Encontra o dia de maior e menor chuva
            if (i == 0 || chuva[i] > chuva[diaMaisChuva]) {
                diaMaisChuva = i;
            }
            if (i == 0 || chuva[i] < chuva[diaMenosChuva]) {
                diaMenosChuva = i;
            }
        }

        // Cálculo das médias
        double media1 = soma1 / 15;
        double media2 = soma2 / 16;

        // Exibição dos resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Dia que mais choveu: " + (diaMaisChuva + 1) + " (com " + chuva[diaMaisChuva] + " mm)");
        System.out.println("Dia que menos choveu: " + (diaMenosChuva + 1) + " (com " + chuva[diaMenosChuva] + " mm)");
        System.out.println("Média da 1ª quinzena: " + String.format("%.2f", media1) + " mm");
        System.out.println("Média da 2ª quinzena: " + String.format("%.2f", media2) + " mm");

        scanner.close();
    }
}