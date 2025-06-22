    import java.util.Scanner; //importando biblioteca para entrada de dados
    import java.text.DecimalFormat; //importando para formatar a saída com poucas casas decimais

    //Aluno: João Vitor Szczypior Tavares; Matricula: 25104160
    public class DistanciaPontos {

        public static void main(String[] args) {
            //Criando Scanner para entrada dos valores
            Scanner leia = new Scanner(System.in);

            //Pedindo ao usuário as coordenadas do primeiro ponto (x1, y1)
            System.out.println("Digite a coordenada X do ponto 1:");
            double x1 = leia.nextDouble();
            System.out.println("Digite a coordenada Y do ponto 1:");
            double y1 = leia.nextDouble();

            //Pedindo ao usuário as coordenadas do segundo ponto (x2, y2)
            System.out.println("Digite a coordenada X do ponto 2:");
            double x2 = leia.nextDouble();
            System.out.println("Digite a coordenada Y do ponto 2:");
            double y2 = leia.nextDouble();

            //Chamando a função que calcula a distância entre dois pontos
            double distancia = calcularDistancia(x1, y1, x2, y2);

            //Formatando o resultado com duas casas decimais
            DecimalFormat formato = new DecimalFormat("#.##");

            //Exibindo o resultado na tela
            System.out.println("A distância entre os dois pontos é: " + formato.format(distancia));
        }

        //Função que calcula a distância entre dois pontos no plano cartesiano
        public static double calcularDistancia(double x1, double y1, double x2, double y2) {
            //Aplicando a fórmula da distância euclidiana
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            //Retornando o valor da distância
            return distancia;
        }
    }
