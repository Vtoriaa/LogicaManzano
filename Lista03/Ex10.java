/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^)*/

import java.util.Scanner;

public class exFExponenciacaoValorDefinidoPeloUsuario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contador = 1, numero = 1;
        System.out.println("Digite o valor da base");
        int base = leitura.nextInt();

        System.out.println("Digite o valor do expoente");
        int expoente = leitura.nextInt();

        System.out.println(base + " ^ 0 = 1");
        while (contador <= expoente) {
            numero = base * numero;
            System.out.println(base + " ^ " + contador + " = " + numero);
            contador = contador + 1;
        }
    }
}
