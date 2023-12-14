/*Valores das variaveis somados e elevados quadrado*/

import java.util.Scanner;
public class exMValoresSomadosEElevadosAoQuadrado {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        float A = leitura.nextFloat();

        System.out.println("Digite um valor para B: ");
        float B = leitura.nextFloat();

        System.out.println("Digite um valor para C: ");
        float C = leitura.nextFloat();

        float valoresMultiplicados = (A + B + C) * (A + B + C);
        System.out.println("Os valores de A B C somados e elevados ao quadrado, são iguais a: " + valoresMultiplicados);

    }
}
