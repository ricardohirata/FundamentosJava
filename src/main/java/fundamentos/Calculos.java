package fundamentos;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {

    public static void main(String[] args){
        System.out.print("Deseja calcular a tabuada (S/N): ");
        String resposta = entrada.nextLine();
        switch (resposta.toUpperCase()){
            case "S":
                tabuada();
                break;
            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
