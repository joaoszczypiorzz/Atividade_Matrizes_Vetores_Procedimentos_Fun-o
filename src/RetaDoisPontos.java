import java.util.Scanner; //importando biblioteca Scanner para entrada de dados

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class RetaDoisPontos {
    public static void main(String[] args) {
        //criando objeto Scanner
        Scanner leia = new Scanner(System.in);

        //declarando variáveis para armazenar as coordenadas dos pontos
        double x1, y1, x2, y2;

        //pedindo os dados do primeiro ponto
        System.out.println("Digite o valor de x1:");
        x1 = leia.nextDouble();

        System.out.println("Digite o valor de y1:");
        y1 = leia.nextDouble();

        //pedindo os dados do segundo ponto
        System.out.println("Digite o valor de x2:");
        x2 = leia.nextDouble();

        System.out.println("Digite o valor de y2:");
        y2 = leia.nextDouble();

        //chamando a função que calcula a inclinação da reta
        double a = calcularInclinação(x1, y1, x2, y2);

        //chamando a função que calcula o coeficiente linear (b)
        double b = calcularIntersecao(x1, y1, a);

        //imprimindo na tela a equação da reta no formato y = ax + b
        System.out.println("A equação da reta que passa pelos dois pontos é:");
        System.out.printf("y = %.2fx + %.2f%n", a, b); //%.2f limita o número a duas casas decimais
    }

    //Função para calcular a inclinação (a) da reta
    public static double calcularInclinação(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1); //usando a fórmula a = (y2 - y1) / (x2 - x1)
    }

    //Função para calcular a interseção (b) usando a fórmula b = y - ax
    public static double calcularIntersecao(double x, double y, double a) {
        return y - a * x;
    }
}