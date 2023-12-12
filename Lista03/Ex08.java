/*             Apresentar todos os valores numéricos inteiros ímpares situados
               na faixa de 0 a 20. Para verificar se o número é ímpar,
               efetuar dentro da malha a verificação lógica desta condição
               com a instrução se, perguntando se o número é ímpar; sendo,
              mostre-o; não sendo, passe para o próximo passo*/

public class exDExibindoValoresImparesDe0A20 {
    public static void main(String[] args) {
        int contador = 1;

        System.out.println("Aqui estão todos os numeros impares situados entre 0 e 20:");
        while(contador < 20) {
            if ((contador % 2) == 1) {
                System.out.println(contador);
            }
            contador = contador + 1;
        }
    }
}
