/*Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100*/

public class exCSomando100PrimeirosInteiros {
    public static void main(String[] args) {

        int total = 0;
        for(int i = 1; i < 101; i++){
            total = i + total;
        }
        System.out.println("A soma total dos 100 primeiros inteiros é igual a: " + total);
    }
}
