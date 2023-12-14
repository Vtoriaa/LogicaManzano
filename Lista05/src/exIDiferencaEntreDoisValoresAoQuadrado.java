/*Diferença entre valores ao quadrado*/

import java.util.Scanner;
public class exIDiferencaEntreDoisValoresAoQuadrado {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = leitura.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = leitura.nextInt();

        int diferencaAoQuadrado =  A - B;
        int resultado =  diferencaAoQuadrado * diferencaAoQuadrado;
        System.out.println("O valor da diferença entre " +  A +  " e " + B + " ao quadrado é: " + resultado);

    }
}
