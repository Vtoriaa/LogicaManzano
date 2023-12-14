/*calculando média de um aluno e verificando se é maior que 5*/
import java.util.Scanner;

public class ex4CalculandoMediaEscolarMediaMaiorQue5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre: ");
        float nota1 = leitura.nextFloat();

        System.out.println("Digite a nota do segundo bimestre: ");
        float nota2 = leitura.nextFloat();

        System.out.println("Digite a nota do terceiro bimestre: ");
        float nota3 = leitura.nextFloat();

        System.out.println("Digite a nota do quarto bimestre: ");
        float nota4 = leitura.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 5){
            System.out.println("O aluno foi aprovado");
            System.out.println("E sua média foi:" + media);
        } else {
            System.out.println("O aluno foi reprovado");
            System.out.println("E sua média foi:" + media);
        }
    }
}
