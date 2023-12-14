/*Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
apresentação, caso o valor não seja maior que três.*/
import java.util.Scanner;

public class exKNumeroMenorQue3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero menor que 3: ");
        float numero = leitura.nextFloat();

        if (numero <= 3) {
            System.out.println("O numero " + numero + " está dentro da faixa permitida.");
        } else {
            System.out.println("O numero " + numero + " está fora da faixa permitida. Digite um numero menor que 3.");
        }
    }
}
