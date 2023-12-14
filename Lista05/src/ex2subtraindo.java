/*Subtraindo dois valores e exibindo na tela*/

import java.util.Scanner;

public class ex2subtraindo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        float numeroA = leitura.nextFloat();
        System.out.println("Digite o valor de B:");
        float numeroB = leitura.nextFloat();
        float resultado = numeroA - numeroB;
        System.out.println("A subtracao de A + B = " + resultado);
    }
}