/*Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente o
total do somatório da fatorial de cada valor lido*/

import  java.util.Scanner;

public class ExESomatoriaDe15Valores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        float fatorial = 1,
                valor = 0,
                valorP = 0,
                somatoria = 0;



        do {
            System.out.println("Digite um valor para saber seu fatorial: ");
            valor = scanner.nextFloat();
            valorP =  valor;
            do{
                fatorial = fatorial * valor;
                valor = valor - 1;
            } while(valor != 1);

            System.out.println("O fatorial de " + valorP + " = " + fatorial);
            somatoria = somatoria + fatorial;
            fatorial = 1;
            contador++;
        } while(contador < 15);

        System.out.println("A somatoria do fatorial de todos os valores lidos é = " + somatoria);

    }
}
