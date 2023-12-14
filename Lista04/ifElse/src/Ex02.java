/*verificando se o numero é positivo ou negativo e invertendo valor*/
import java.util.Scanner;

public class ex4BValorPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor positivo ou negativo: ");
        int valor = leitura.nextInt();

        if(valor >= 0) {
            System.out.println("O numero digitado era positivo, mas agora possui o valor de : " + valor*(-1));
        } else {
            System.out.println("O numero digitado era negativo, mas agora possui o valor de  : "+ valor*(-1));
        }

    }
}
