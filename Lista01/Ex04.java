/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
1 até 500.*/

public class exDSomando500PrimeirosInteiros {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i < 501; i++){
            if ((i % 2) == 0) {
                total = i + total;
            }
        }

        System.out.println("O somatorio de todos os numeros pares de 1 a 500 é igual a: " + total);
    }
}
