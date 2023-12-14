/*Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem
informando se o número é par ou ímpar*/
import java.util.Scanner;
public class exINumeroParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = leitura.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("O numero: " + numero + " é par");
        } else {
            System.out.println("O numero: " + numero + " é impar");
        }
    }
}
