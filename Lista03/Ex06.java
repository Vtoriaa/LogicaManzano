/*Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100*/

public class exBSomandoPrimeiroNumeros {
    public static void main(String[] args) {
        int total = 0;
        int contador = 1;
        while (contador < 101) {
            total = contador + total;
            contador = contador + 1;
        }
        System.out.println("A soma total dos 100 primeiros inteiros é igual a: " + total);
    }
}
