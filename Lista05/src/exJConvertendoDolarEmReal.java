/*Convertendo dólar para real*/

import java.util.Scanner;

public class exJConvertendoDolarEmReal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite quantos dolares você tem: ");
        float valorEmDolar = leitura.nextFloat();

        System.out.println("Digite a cotação do dólar em relação ao real: ");
        float cotacao = leitura.nextFloat();

        float valorConvertido = valorEmDolar * cotacao;
        System.out.println("O valor de $ "+ valorEmDolar + " em real é igual a: R$ " + valorConvertido);

    }
}
