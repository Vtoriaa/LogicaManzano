/*Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente*/
import java.util.Scanner;

public class ex4FValoresEmOrdemCrescente {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = leitura.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = leitura.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = leitura.nextInt();

        if (A == B || A == C || B == C) {
            System.out.println("Nenhum dos valores pode ser iguais! Reinicie o programa.");
        }
        if (A > B && A > C) {
            if (B > C) {
                System.out.println("A ordem crescente dos numeros é:" + " A = " +  A + " B = " + B + " C = " + C);
            }
        }
        if (A > B && A > C) {
            if (C > B) {
                System.out.println("A ordem crescente dos numeros é:" + " A = " +  A + " C = " + C + " B = " + B);
            }
        }
        if (B > A && B > C) {
            if (A > C) {
                System.out.println("A ordem crescente dos numeros é:" + " B = " +  B + " A = " + A + " C = " + C);
            }
        }
        if (B > A && B > C) {
            if (C > A) {
                System.out.println("A ordem crescente dos numeros é:" + " B = " +  B + " C = " + C + " A = " + A);
            }
        }
        if (C > A && C > B) {
            if (A > B) {
                System.out.println("A ordem crescente dos numeros é:" + " C = " +  C + " A = " + A + " B = " + B);
            }
        }
        if (C > A && C > B) {
            if (B > A) {
                System.out.println("A ordem crescente dos numeros é:" + " C = " +  C + " B = " + B + " A = " + A);
            }
        }
    }
}
