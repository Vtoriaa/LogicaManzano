/*Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer*/
import java.util.Scanner;

public class exATabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para ver sua tabuada:");
        int numero = leitura.nextInt();
        int contador = 1;
        while(contador < 11 ){
            System.out.println(numero + " X " + contador + " = " + numero * contador);
            contador = contador +  1;
        }

    }
}
