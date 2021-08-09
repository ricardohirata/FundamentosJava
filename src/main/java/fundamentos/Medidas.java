package fundamentos;

import java.util.Scanner;

public class Medidas {
    static Scanner entrada = new Scanner(System.in);;

    public static void main(String[] args) {
        byte opcao;
        double area=0;

        System.out.println("Escolha o calculo desejado: ");
        System.out.println("1 - Area do quadrado.");
        System.out.println("2 - Area do retangulo.");
        System.out.println("3 - Area do triangulo.");
        System.out.println("4 - Area do circulo.");
        System.out.println("5 - .");
        opcao = entrada.nextByte();

        switch (opcao) {
            case 1:
                area = calcularAreaDoQuadrado();
                break;
            default:
                System.out.println("Opcao invalida.");
                break;
        }
        System.out.printf("A área é: %.2f.\n", area);
    }

    public static double calcularAreaDoQuadrado(){
        double lado;

        System.out.print("Digite o tamanho do lado: ");
        lado = entrada.nextDouble();
        return Math.pow(lado, 2);
    }

}