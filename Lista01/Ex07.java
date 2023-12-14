/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^)*/

public class exGBase3ExpoenteDe0a15 {
    public static void main(String[] args) {
        int numero = 1;

        System.out.println("3 ^ 0 =  1");
        for (int contador = 1; contador < 16; contador++) {
            numero = 3 * numero;
            System.out.println("3 ^ " + contador + " = " + numero);
        }
    }
}
