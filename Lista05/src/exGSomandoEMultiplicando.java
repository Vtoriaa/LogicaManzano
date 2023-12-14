/*Ler quatro números inteiros e apresentar o resultado da adição e multiplicação*/

import java.util.Scanner;

public class exGSomandoEMultiplicando {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = leitura.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = leitura.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = leitura.nextInt();

        System.out.println("Digite o valor de D: ");
        int D = leitura.nextInt();

        System.out.println("------------------------------SOMANDO-------------------------------------");
        System.out.println("A soma de A com B é " + (A + B) + "." + " A soma de A com C é " + (A + C) + "." + " A soma de A com D é " + (A + D) +".");
        System.out.println("A soma de B com C é " + (B + C) +  "." + " A soma de B com D é " + (B + D) + ".");
        System.out.println("A soma de C com D é " + (C + D) + ".");
        System.out.println("---------------------------MULTIPLICANDO----------------------------------");
        System.out.println("A multiplicação de A com B é " + (A * B) + "." + " A multiplicação de A com C é " + (A * C) + "." + " A multiplicação de A com D é " + (A * D) + ".");
        System.out.println("A multiplicação de B com C é " + (B * C) + "." + " A multiplicação de B com D é " + (B * D) + ".");
        System.out.println("A multiplicação de C com D é "+ (C * D) + ".");
    }
}
