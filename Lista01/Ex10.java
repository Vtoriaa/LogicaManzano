/*Elaborar um programa que apresente os valores de convers�o
de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando
a contagem em 10 graus Celsius e finalizando em 100 graus
Celsius. O programa deve apresentar os valores das duas
temperaturas. A f�rmula de convers�o � 5 1609 + = C
F , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

public class exJConversaoDeGraus {
    public static void main(String[] args) {

        float temperaturaC = 0,
                temperaturaF = 1;

        System.out.println("*****Conversão de Graus*************");
        for(int i = 0; i < 11 ; i++){
            temperaturaC = i * 10;
            temperaturaF = (9 * temperaturaC + 160) / 5;
            System.out.println("Graus " + temperaturaC + "C " + " = " + temperaturaF + "F");
        }

    }
}
