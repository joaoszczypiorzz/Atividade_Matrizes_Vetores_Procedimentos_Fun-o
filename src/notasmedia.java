import java.util.Scanner; //incluindo a biblioteca util scannen para receber armazenar variavei
public class notasmedia {
    public static void main(String[] args){
        int nota1; //declarando nota1 como uma variavel do tipo inteiro
        String nome; //declarando a variavel nome como uma cadeia de palavras
        int nota2; //declarando nota2 como uma variavel do tipo inteiro
            Scanner leia = new Scanner(System.in); //declarando scanner e seu nome
        System.out.println("Olá, informe seu nome para dar sequência ao processo");
         nome = leia.next(); //lendo variavel nome do usuario
        System.out.println("Olá " + nome + " informe sua nota 1: ");
         nota1 = leia.nextInt(); //lendo variavel do tipo numero
        System.out.println(nome + " Informe sua nota 2: ");
         nota2 = leia.nextInt(); //lendo variavel do tipo numero

        if((nota1+nota2)/2>=7){
            System.out.println("Sua média foi: " + (nota1+nota2)/2);
            System.out.println("Parabéns " + nome + " você está aprovado!");
        }
        if((nota1+nota2)/2<=5){
            System.out.println("Sua média foi: " + (nota1+nota2)/2);
            System.out.println(nome + ", Infelizmente você está de recuperação");
        }


    }
}
