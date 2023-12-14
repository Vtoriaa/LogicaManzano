/*Calcula o volume de uma lata de oleo e apresenta o volume na tela*/

import java.util.Scanner;


public class exCValorVolumeLataDeOleo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do raio da lata óleo: ");
        float raio = leitura.nextFloat();

        System.out.println("Digite o valor da altura da lata óleo: ");
        float altura = leitura.nextFloat();

        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume da lata de óleo é igual a: " + volume);

    }
}
