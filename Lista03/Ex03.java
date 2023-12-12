/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
total acumulado da área residencial.*/

import java.util.Scanner;

public class exKAreaDeCasa {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float largura, comprimento, area = 0;
        String comodo = "";

        System.out.println("Digite seu nome: ");
        String nome = leitura.next();
        System.out.println(nome + " deseja calcular a area de algum comodo? Digite 'sim' ou 'nao'");
        String confirmacao = leitura.next();

        while (confirmacao.equalsIgnoreCase("sim") || confirmacao.equalsIgnoreCase("SIM")) {
            System.out.println("Digite o comodo ?");
            comodo = leitura.next();

            System.out.println("Digite a largura do comodo: ");
            largura = leitura.nextFloat();

            System.out.println("Digite o comprimento do comodo: ");
            comprimento = leitura.nextFloat();

            area = comprimento * largura + area;

            System.out.println(nome + " deseja calcular a area de algum comodo? Digite 'sim' ou 'nao'");
            confirmacao = leitura.next();
        }
        System.out.println("A area total da casa possui o valor de: " + area + "m²");

    }
}
