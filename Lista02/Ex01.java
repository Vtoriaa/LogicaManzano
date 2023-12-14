/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
total acumulado da área residencial.*/

import java.util.Scanner;

public class exHCalculandoAreaDosComodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float largura = 0,
                comprimento = 0,
                area = 0;
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println(nome + " deseja calcular a area de algum comodo? Digite 'sim' ou 'nao'");
        String confirmacao = scanner.nextLine();

        do{
            System.out.println("Digite o comodo ?");
            String comodo = scanner.nextLine();
            System.out.println("Digite a largura do comodo: ");
            largura = scanner.nextFloat();
            System.out.println("Digite o comprimento do comodo: ");
            comprimento = scanner.nextFloat();
            area = comprimento * largura + area;
            System.out.println(nome + " deseja calcular a area de algum comodo? Digite 'sim' ou 'nao'");
            confirmacao = scanner.nextLine();
        } while(confirmacao.equalsIgnoreCase("sim") || confirmacao.equalsIgnoreCase("SIM"));
        System.out.println("A area total da casa possui o valor de: " + area + "m²");
    }
}
