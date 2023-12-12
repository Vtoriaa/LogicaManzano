/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
somatório e a média aritmética dos valores lidos*/

import java.util.Scanner;

public class exI10somatorias {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contadora = 0;
        float valor = 0, somatorio = 0;

        while (contadora < 10) {
            System.out.println("Digite um valor");
            valor = leitura.nextFloat();
            somatorio = valor + somatorio;
            contadora++;
        }
        System.out.println("A somatoria do valores é igual a: " + somatorio);
        System.out.println("A media é igual a: " + somatorio / 10);
    }
}
