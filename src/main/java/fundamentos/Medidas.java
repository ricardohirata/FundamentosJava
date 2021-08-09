package fundamentos;

import java.util.Scanner;

public class Medidas {
    static Scanner entrada = new Scanner(System.in);;

    public static void main(String[] args) {
        byte opcao=0;
        double area=0;
        while(opcao != 10) {
            System.out.println("=================================");
            System.out.println("Escolha o calculo desejado: ");
            System.out.println("1 - Area do quadrado.");
            System.out.println("2 - Area do retangulo.");
            System.out.println("3 - Area do triangulo.");
            System.out.println("4 - Area do circulo.");
            System.out.println("5 - Tabuada.");
            System.out.println("6 - Fibonacci.");
            System.out.println("7 - Contagem Regressiva.");
            System.out.println("10 - Sair.");
            opcao = entrada.nextByte();

            switch (opcao) {
                case 1:
                    area = calcularAreaDoQuadrado();
                    break;
                case 5:
                    tabuada();
                    break;
                case 6:
                    fibonacci();
                    break;
                case 7:
                    contagemRegressiva();
                    break;
                case 10:
                    System.out.println("Agradecemos pela preferencia. Fui!!!");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
            if (opcao >= 1 && opcao <= 4) System.out.printf("A área é: %.2fm².\n", area);
        }
    }

    public static double calcularAreaDoQuadrado(){
        double lado;

        System.out.print("Digite o tamanho do lado: ");
        lado = entrada.nextDouble();
        for (int linha = 1; linha <= lado; linha++){
            for (int coluna = 1; coluna <= lado; coluna++){
                System.out.print("#");
            }
            System.out.println("");
        }
        return Math.pow(lado, 2);
    }

    public static void tabuada(){

        System.out.print("Voce quer calcular a tabuada de qual numero? ");
        byte numero = entrada.nextByte();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d.\n", numero, i, numero * i);
        }
    }

    public static void fibonacci(){
        int num1 = 0, num2 = 1, fibo = 0;

        System.out.print("Quantos numeros deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();

        switch (numero){
            case 0:
                System.out.println("A sequencia esta vazia.");
                break;
            case 1:
                System.out.println("A sequencia de Fibonacci: 1;");
                break;
            default:
                System.out.print("A sequencia de Fibonacci: 1; ");
                for (int i = 2; i <= numero; i++){
                    fibo = num1+num2;
                    System.out.printf("%d; ", fibo);
                    num1 = num2;
                    num2 = fibo;
                }
                System.out.println("");
                break;
        }
    }

    public static void contagemRegressiva(){
        int cont = 1;

        System.out.print("Comecar a contagem a partir de qual numero? ");
        int numero = entrada.nextInt();

        System.out.print("Diminuindo de quantos em quantos numeros? ");
        int decrescimo = entrada.nextInt();

        for (int i = numero; i >= 1; i-=decrescimo){
            if (cont % 30 == 0) {
                System.out.println(i);
            } else{
                System.out.printf("%d; ", i);
            }
            cont++;
        }
        System.out.println("");
    }
}