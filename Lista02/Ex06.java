/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
1 até 500*/
public class exBSomatorio500PrimeirosPares {
    public static void main(String[] args) {

        int contador = 1, somatorio = 0;

        do {
            if((contador % 2) == 0){
                somatorio = contador + somatorio;
            }
            contador++;

        } while(contador < 501);

        System.out.println("O somatorio dos numeros pares entre 1 e 500 é: " + somatorio);
    }
}
