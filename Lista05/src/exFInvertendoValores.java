/*invertendo valores das variaveis*/

import java.util.Scanner;

public class exFInvertendoValores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor da variavel A: ");
        int A = leitura.nextInt();

        System.out.println("Digite o valor da variavel B: ");
        int B = leitura.nextInt();

        int AnovoValor = B;
        int BnovoValor = A;
        System.out.println("O valor inicial de A é " + A + " e o de B é " + B + "."
                +" Invertendo os valores, A passa ter o valor " + AnovoValor +
                " e B passa a ter o valor de " + BnovoValor);

    }
}
