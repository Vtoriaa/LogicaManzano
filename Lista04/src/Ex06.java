/*Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3*/
import java.util.Scanner;

public class exGValoresDivisiveisPor2E3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite o valor de A: ");
        int A = leitura.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = leitura.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = leitura.nextInt();

        System.out.println("Digite o valor de D: ");
        int D = leitura.nextInt();

        if ((A % 2) == 0 && (A % 3) == 0) {
            System.out.println("A variavel A é divisivel por 2 e por 3");
        } else {
            System.out.println("A variavel A NÃO é divisivel por 2 e por 3");
        }
        if ((B % 2) == 0 && (B % 3) == 0) {
            System.out.println("A variavel B é divisivel por 2 e por 3");
        } else {
            System.out.println("A variavel B NÃO é divisivel por 2 e por 3");
        }
        if ((C % 2) == 0 && (C % 3) == 0) {
            System.out.println("A variavel C é divisivel por 2 e por 3");
        } else {
            System.out.println("A variavel C NÃO é divisivel por 2 e por 3");
        }
        if ((D % 2) == 0 && (D % 3) == 0) {
            System.out.println("A variavel D é divisivel por 2 e por 3");
        } else {
            System.out.println("A variavel D NÃO é divisivel por 2 e por 3");
        }
    }
}
