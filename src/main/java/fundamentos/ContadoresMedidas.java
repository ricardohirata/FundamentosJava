package fundamentos;

import static fundamentos.Medidas.entrada;

public interface ContadoresMedidas {
    static void contagemRegressiva(){
        int cont = 1;

        System.out.print("Comecar a contagem a partir de qual numero? ");
        int numero = entrada.nextInt();

        for (int i = numero; i >= 1; i--){
            if (cont % 30 == 0) {
                System.out.println(i);
            } else{
                System.out.printf("%d; ", i);
            }
            cont++;
        }
    }
}
