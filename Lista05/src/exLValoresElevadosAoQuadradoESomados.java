/*Valores das variaveis ao quadrado*/

import java.util.Scanner;
public class exLValoresElevadosAoQuadradoESomados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        float A = leitura.nextFloat();

        System.out.println("Digite um valor para B: ");
        float B = leitura.nextFloat();

        System.out.println("Digite um valor para C: ");
        float C = leitura.nextFloat();

        float valoresMultiplicados = (A * A) + (B * B) + (C * C);
        System.out.println("Os valores de A B C elevados ao quadrado e somados, são iguais a:" + valoresMultiplicados);

    }
}
