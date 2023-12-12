/*              Elaborar um programa que apresente os resultados da soma
               e da média aritmética dos valores
               pares situados na faixa numérica de 50 a 70*/

public class exJParesDe50a70 {
    public static void main(String[] args) {

        int contadora = 49;
        float soma = 0, totalDeNumeros = 0;

        System.out.println("Os numeros pares entre 50 e 70 são: ");
        while (contadora < 71) {
            if (contadora % 2 == 0) {
                soma = contadora + soma;
                System.out.println("O numero: " + contadora + " é par");
                totalDeNumeros++;
            }
            contadora++;
        }
        System.out.println("A soma dos valores pares entre 50 e 70 é: " + soma);
        System.out.println(
                "A média aritimética da soma do numeros pares entre 50 e 70 é: " +
                        soma / totalDeNumeros
        );
    }
}
