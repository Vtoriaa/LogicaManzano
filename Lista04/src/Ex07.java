/*Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores*/
import java.util.Scanner;

public class exHVerificandoMaiorValorEMenorValor {
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

        System.out.println("Digite o valor de E: ");
        int E = leitura.nextInt();

        int maior = 0;
        int menor = 0;

        if (A > B) {
            maior = A;
            menor = B;
        } else {
            maior = B;
            menor = A;
        }
        if (C > maior) {
            maior = C;
        } else if (C < menor) {
            menor = C;
        }
        if (D > maior) {
            maior = D;
        } else if (D < menor) {
            menor = D;
        }
        if (E > maior) {
            maior = E;
        } else if (E < menor) {
            menor = E;
        }

        System.out.println("O maior valor é " +  maior + " e o menor valor é " + menor);
    }
}
