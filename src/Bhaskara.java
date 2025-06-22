import java.util.Scanner; // Importando biblioteca para entrada de dados com Scanner

// Aluno: João Vitor Szczypior Tavares; Matrícula: 25104160
public class Bhaskara {
    public static void main(String[] args) {
        // Declarando o Scanner para ler os dados do usuário
        Scanner leia = new Scanner(System.in);

        // Declarando as variáveis que irão armazenar os coeficientes da equação
        double a, b, c;

        // Solicitando os coeficientes ao usuário
        System.out.print("Informe o valor de a: ");
        a = leia.nextDouble();

        System.out.print("Informe o valor de b: ");
        b = leia.nextDouble();

        System.out.print("Informe o valor de c: ");
        c = leia.nextDouble();

        // Chamando a função que calcula as raízes e recebendo as respostas
        double[] raizes = calcularBhaskara(a, b, c);

        // Se o array de raízes não for nulo, imprimir as raízes
        if (raizes != null) {
            System.out.println("A primeira raiz (x1) é: " + raizes[0]);
            System.out.println("A segunda raiz (x2) é: " + raizes[1]);
        } else {
            // Caso o delta seja negativo e não existam raízes reais
            System.out.println("A equação não possui raízes reais.");
        }
    }

    // Função que recebe os coeficientes a, b e c e retorna um vetor com as raízes (x1 e x2)
    public static double[] calcularBhaskara(double a, double b, double c) {
        // Calculando o delta (discriminante) da equação
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Verificando se delta é negativo (não existe raiz real)
        if (delta < 0) {
            return null; // retornando nulo pois não há raízes reais
        }

        // Calculando as duas raízes com base na fórmula de Bhaskara
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        // Retornando as raízes dentro de um vetor
        return new double[] {x1, x2};
    }
}
