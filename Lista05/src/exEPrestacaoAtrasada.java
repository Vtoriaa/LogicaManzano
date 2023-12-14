/*calculo da prestacao atrasada*/

import java.util.Scanner;

public class exEPrestacaoAtrasada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor da prestação: ");
        float valor = leitura.nextFloat();

        System.out.println("Digite o número de dias que a prestação está atasada: ");
        int tempoDeAtraso = leitura.nextInt();

        System.out.println("Digite o valor da taxa de atraso: ");
        float taxa = leitura.nextFloat();

        float prestacao = valor + ((valor * taxa / 100) * tempoDeAtraso);
        System.out.println("O valor inicial da prestacação era de " + valor
                + ",mas devido ao atraso de "+ tempoDeAtraso +
                " dias," + " valor taxa de " + taxa +  "," +
                " o valor total da prestação é de " + prestacao);
    }
}
