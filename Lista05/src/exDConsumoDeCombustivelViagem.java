/*Calculo da quantidade de litros de combustivel gasto em uma viagem*/

import java.util.Scanner;

public class exDConsumoDeCombustivelViagem {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tempo de duração da viagem: ");
        float tempoGasto = leitura.nextFloat();
        System.out.println("Digite a velocidade média do veiculo: ");
        float velocidadeMedia = leitura.nextFloat();
        float distancia = tempoGasto * velocidadeMedia;
        float litrosUsados = distancia / 12;
        System.out.println("A velocidade média é: " + velocidadeMedia + " km/h," +
                " o tempo médio da viagem é: "
                + tempoGasto + "h" + " a distancia percorida é de: "+ distancia +
                "KM" + " e o consumo de combustivel é de: " + litrosUsados + "L");


    }
}
