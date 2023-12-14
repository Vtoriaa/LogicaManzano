/*ConversaoDeGraus*/
import java.util.Scanner;

public class exA_ConversaoDeGraus {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus celsius:");
        float grausCelsius = leitura.nextFloat();
        float f = (9 * grausCelsius + 160) / 5;
        System.out.println("A temperatura de:" + grausCelsius +  "°c" + " em fahrenheits é igual a: " + f + "°f");
    }
}
