/*Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
apresentação, caso o valor não seja maior que três.*/
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exLIdentificandoSexo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.next();
        System.out.println("Digite seu sexo: 'M' para masculino 'F' para feminino: ");
        String sexo = leitura.next();

        if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("M")){
            System.out.println("Boa tarde Sr. " +  nome);
        } else if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("F")){
            System.out.println("Boa tarde Sra. " +  nome);
        } else {
            System.out.println("Boa tarde " +  nome + ". Seu sexo não foi identificado.");
        }
    }
}
