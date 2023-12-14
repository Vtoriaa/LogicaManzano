/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
portuguol (^)*/

import java.util.Scanner;

public class exHExponenciacaoValorDefinidoPeloUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        System.out.println("Digite o valor da base");
        int base = scanner.nextInt();
        System.out.println("Digite o valor do expoente");
        int expoente = scanner.nextInt();

        System.out.println(base + " ^ 0 = 1");
        for(int i = 1; i <= expoente; i++) {
            numero = base * numero;
            System.out.println(base +" ^ " + i + " = " + numero);
        }
    }
}
