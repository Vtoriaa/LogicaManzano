/*Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares
situados na faixa numérica de 1 a 10*/

public class exKCalculandoFatorialDeImparesDe1a10 {
    public static void main(String[] args) {
        int fatorial = 1, anterior = 0;

        System.out.println("---Fatorial de impares de 1 a 10---");
        System.out.println("");
        System.out.println("A fatorial de 1 = 1");

        for(int i = 2; i <= 10; i++) {
            if((i % 2) == 1) {
                anterior = i - 1;
                fatorial = i * anterior * fatorial;
                System.out.println("O fatorial de " +  i +  " = " +  fatorial);
            }

        }
    }
}
