/*Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
usuário*/

import java.util.Scanner;

public class exLValorDiferenteEMenorEMaior {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        float numero = 0, maior = 0, menor = 0;

        System.out.println("Se deseja continuar, digite qualquer numero positivo:");
        numero = leitura.nextFloat();
        menor = numero;

        while (numero >= 0) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero <= menor) {
                menor = numero;
            }

            System.out.println("O valor atual é: " + numero);
            System.out.println("Se deseja continuar, digite qualquer numero positivo:");
            numero = leitura.nextFloat();
        }
        System.out.println("O maior valor informado foi: " + maior);
        System.out.println("O menor valor informado foi: " + menor);

    }
}
