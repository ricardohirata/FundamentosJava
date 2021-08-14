package fundamentos;
/*Quando usar o extend ou import?
* De forma geral o import é usado quando não modificamos o conteúdo só usamos.
* No caso do extend geralmente fazemos alterações.
* Uma analogia seria quando precisamos ter um bolo.
* Se queremos o bolo do jeito que foi feito, chamamos quem sabe fazer e temos o bolo. (import)
* Se queremos incrementar o bolo com cobertura, escrita, etc. Aprendemos a fazer o bolo e o modificamos. (extend)
 */
public class Contadores extends Medidas implements ContadoresMedidas {
    public static void main(String[] args){
        System.out.print("Deseja realizar a contagem regressiva? (S/N)");
        String resposta = entrada.nextLine();

        switch (resposta.toUpperCase()) {
            case "S":
                ContadoresMedidas.contagemRegressiva();
                break;
            default:
                System.out.println("Opcao inválida!!!");
                break;
        }
    }

}
