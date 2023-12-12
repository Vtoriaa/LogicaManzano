/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^)*/

public class exEexponenciacao {
    public static void main(String[] args) {
        int contador = 1, numero = 1;

        System.out.println("3 ^ 0 =  1");
        while(contador < 16){
            numero = 3 * numero;
            System.out.println("3 ^ " + contador + " = " + numero);
            contador = contador + 1;
        }
    }
}
