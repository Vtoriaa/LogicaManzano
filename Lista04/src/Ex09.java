/*Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9.
Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas mensagens:
"O valor está na faixa permitida", caso o usuário forneça o valor nesta faixa, ou a mensagem
"O valor está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9.*/
import java.util.Scanner;

public class exJNumeroDe1A9 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 9: ");
        float numero = leitura.nextFloat();

        if (numero > 1 && numero < 9) {
            System.out.println("O valor está na faixa permitida.");
        }
        if (numero <= 0 || numero > 9) {
            System.out.println("O valor está fora da faixa permitida.");
        }
    }
}
