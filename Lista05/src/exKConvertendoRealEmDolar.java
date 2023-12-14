/*Convertendo real para dolar*/

import java.util.Scanner;

public class exKConvertendoRealEmDolar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite quantos reais você tem: ");
        float valorEmReal = leitura.nextFloat();

        System.out.println("Digite a cotação do dólar em relação ao real: ");
        float cotacao = leitura.nextFloat();

        float valorConvertido = valorEmReal / cotacao;
        System.out.println("O valor de R$ "+ valorEmReal + " em dolar é igual a: $ " + valorConvertido);

    }
}
