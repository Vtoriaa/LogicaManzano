/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o
total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras
dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve
parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar
como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da
média*/

import java.util.Scanner;
public class exFMediaValoresPositivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        float somatoria = 0,
                valor = 0,
                valorP = 0;

        System.out.println(
            "Digite um numero positivo enquanto quiser somar " +
                    "Ao final apresentaremos a media, numero de valores digitados e a somatoria dos valores."
        );
        do {
            System.out.println("Digite um numero: ");
            valor = scanner.nextFloat();
            valorP = valor;
            if (valor < 0) {
                valor = 0;
            }
            somatoria = somatoria + valor;
            contador++;
        } while (valorP >= 0);
        contador--;

        System.out.println("A media de todos os valores lidos é = " + somatoria / contador);
        System.out.println("A somatoria de todos os valores lidos é = " + somatoria);
        System.out.println("O total de todos os valores lidos é = " + contador);

    }
}
