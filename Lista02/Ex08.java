/*Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de
trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um grão de
trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro
quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos),
no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8
grãos (tendo-se então 15 grãos) até atingir o sexagésimo quarto (64o) quadro. Utilize variáveis do
tipo real como acumuladores.*/

public class exDGraosDeTrigoUmQuadrado {
    public static void main(String[] args) {
        float contador = 2,
                numero = 1;

        System.out.println("No quadrado 1 o valor é = 1");
        do {
            numero = numero * 2;
            System.out.println("No quadrado " + contador + " o valor é " + numero);
            contador++;

        } while(contador < 65);

    }
}
