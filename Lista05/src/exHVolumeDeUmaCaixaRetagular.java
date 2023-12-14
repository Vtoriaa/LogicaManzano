/*Calculando o volume de uma caixa retangular*/

import java.util.Scanner;

public class exHVolumeDeUmaCaixaRetagular {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o comprimento da caixa em cm: ");
        float comprimento = leitura.nextFloat();

        System.out.println("Digite a altura da caixa em cm: ");
        float altura = leitura.nextFloat();

        System.out.println("Digite a largura da caixa em cm: ");
        float largura = leitura.nextFloat();

        float volume = comprimento * largura * altura;

        System.out.println("Uma caixa retangular, com comprimento de " + comprimento + "cm" + ", altura de"
                + altura + "cm" + ", largura de " + largura + "cm," + " tem " + volume + "L" + " de volume.");


    }
}
