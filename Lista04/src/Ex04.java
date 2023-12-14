/*calculando média de um aluno e verificando se é maior que 7 e calculando sua nota pós exame*/
import java.util.Scanner;

public class ex4DCalculandoMediaEscolarMediaMaiorQue7 {
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
        if(media >= 7){
            System.out.println("O aluno foi aprovado");
            System.out.println("E sua média foi:" + media);
        } else {
            if(media < 7){
                System.out.println("O Aluno foi para exame por não obter média igual ou superior a 7.");
                System.out.println("E sua média atual é de:" + media);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Digite a nota obtida em exame: ");
                float exame = leitura.nextFloat();
                float resultadoPosExame = (nota1 + nota2 + nota3 + nota4 + exame) / 4;
                if(resultadoPosExame >= 5){
                    System.out.println("O aluno foi aprovado apos exame");
                    System.out.println("E sua média foi:" + resultadoPosExame);
                } else {
                    System.out.println("O aluno foi reprovado");
                    System.out.println("E sua média foi:" +  resultadoPosExame);
                }
            }
        }
    }
}
