import java.util.Scanner; //importando biblioteca para ler dados do usuário
import java.text.DecimalFormat; //importando para formatar os valores decimais

//Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
public class AreasGeometricas {

    public static void main(String[] args) {
        //criando objeto Scanner para ler os dados do usuário
        Scanner leia = new Scanner(System.in);

        //criando objeto para formatar o valor decimal da área
        DecimalFormat formato = new DecimalFormat("#.##");

        //mostrando o menu de opções ao usuário
        System.out.println("Escolha a forma geométrica para calcular a área:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Triângulo");
        System.out.println("3 - Trapézio");
        System.out.println("4 - Círculo");

        int opcao = leia.nextInt(); //lendo a opção digitada pelo usuário

        //estrutura condicional para executar o cálculo baseado na escolha
        switch (opcao) {
            case 1:
                //retângulo
                System.out.println("Digite a base do retângulo:");
                double baseRet = leia.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double alturaRet = leia.nextDouble();
                double areaRet = areaRetangulo(baseRet, alturaRet);
                System.out.println("Área do retângulo: " + formato.format(areaRet));
                break;

            case 2:
                //triângulo
                System.out.println("Digite a base do triângulo:");
                double baseTri = leia.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double alturaTri = leia.nextDouble();
                double areaTri = areaTriangulo(baseTri, alturaTri);
                System.out.println("Área do triângulo: " + formato.format(areaTri));
                break;

            case 3:
                //trapézio
                System.out.println("Digite a base maior do trapézio:");
                double baseMaior = leia.nextDouble();
                System.out.println("Digite a base menor do trapézio:");
                double baseMenor = leia.nextDouble();
                System.out.println("Digite a altura do trapézio:");
                double alturaTrap = leia.nextDouble();
                double areaTrap = areaTrapezio(baseMaior, baseMenor, alturaTrap);
                System.out.println("Área do trapézio: " + formato.format(areaTrap));
                break;

            case 4:
                //círculo
                System.out.println("Digite o raio do círculo:");
                double raio = leia.nextDouble();
                double areaCirc = areaCirculo(raio);
                System.out.println("Área do círculo: " + formato.format(areaCirc));
                break;

            default:
                System.out.println("Opção inválida. Por favor, execute novamente.");
        }
    }

    //Função para calcular área do retângulo
    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    //Função para calcular área do triângulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    //Função para calcular área do trapézio
    public static double areaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    //Função para calcular área do círculo
    public static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}