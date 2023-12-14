/*Apresentar os quadrados dos números inteiros de 15 a 200*/

public class ExARaizQuadrada {
    public static void main(String[] args) {
        int contador = 15,
                valor = 0;

        do {
            valor = contador * contador;
            System.out.println("A raiz Quadrada de: " + contador + " = " + valor);
            contador++;
        } while(contador < 201);


    }
}
