/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
1 até 500.*/

public class exCSomandoPares {
    public static void main(String[] args) {
        int total = 0;
        int contador = 1;

        while(contador < 501) {
            if ((contador % 2) == 0) {
                total = contador + total;
            }
            contador = contador + 1;
        }

        System.out.println("O somatorio de todos os numeros pares de 1 a 500 é igual a: " + total);
    }
}
