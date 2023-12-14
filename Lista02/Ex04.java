/*Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer.
Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético
DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve
apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo*/

import java.util.Scanner;

public class exJCalculandoDivisaoInteira {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dividendo,
                divisor,
                menor,
                guardandoDividendo,
                contadora = 1;
        String resposta = "";

        System.out.println("Calculando divisão inteira");
        do {
            System.out.println("Digite o valor do dividendo: ");
            dividendo = scanner.nextInt();
            guardandoDividendo = dividendo;
            System.out.println("Digite o valor do divisor: ");
            divisor = scanner.nextInt();
            do {
                contadora++;
                dividendo = dividendo - divisor;
            } while(dividendo > divisor);
            System.out.println(
                    "A divisão inteira de " + guardandoDividendo + " / " + divisor + " = " + contadora
            );
            System.out.println("Digite 'sim' para executar a divisão inteira de outros valores: ");
            resposta = scanner.nextLine();

            contadora = 1;
        } while(resposta.equalsIgnoreCase("sim") );

    }
}
