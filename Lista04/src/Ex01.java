/*Ler dois valores, verifica qual é o maior e apresenta a diferança entre eles.*/
import java.util.Scanner;

public class ex4ApresentandoMaiorValor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = leitura.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = leitura.nextInt();

        if(A > B) {
            System.out.println("A variavel A possui o maior valor, e a diferença entre A e B é: " + (A - B));
        } else if(B > A) {
            System.out.println("A variavel B possui o maior valor, e a diferença entre B e A é: " + (B - A));
        } else {
            System.out.println("As duas variaveis possuem o mesmo valor.");
        }

    }
}
