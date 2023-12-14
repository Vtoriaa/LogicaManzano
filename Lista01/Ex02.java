/*Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.*/

import java.util.Scanner;

public class ExBTabuada1ate10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para ver sua tabuada:");
        int numero = scanner.nextInt();

        for(int contador = 1; contador <= 10; contador++){
            System.out.println(numero + " X " + contador + " = " + numero * contador);

        }
    }
}
