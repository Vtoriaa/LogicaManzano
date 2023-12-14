/*Conversao de fahrenheit para graus celsius*/

import java.util.Scanner;

public class exBConversaoParaFahrenheit {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Fahrenheit:");
        float f = leitura.nextFloat();
        float grausCelsius = (f - 32) * (5 / 9);
        System.out.println("A temperatura de:" + f +  "°f" + " em celsius é igual a: " + grausCelsius + "°c");

    }
}
