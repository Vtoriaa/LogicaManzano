/*Elaborar um programa que apresente os valores de convers�o
de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando
a contagem em 10 graus Celsius e finalizando em 100 graus
Celsius. O programa deve apresentar os valores das duas
temperaturas. A f�rmula de convers�o � 5 1609 + = C
F , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

public class exHConversaoDeGraus {
    public static void main(String[] args) {
        int contadora = 0;
        float temperaturaC = 0, temperaturaF = 1;

        System.out.println("*****Conversão de Graus*************");
        while (contadora < 11) {
            temperaturaC = contadora * 10;
            temperaturaF = (9 * temperaturaC + 160) / 5;
            System.out.println("Graus " + temperaturaC + " C " + " = " + temperaturaF + "F");
            contadora++;
        }

    }
}
