public class Exercicio17 {
    public static void main(String[] args) {
/*
17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e
calcule a temperatura correspondente em grau Celsius. Imprima na
tela as duas temperaturas.

*/

        // Fórmula: C = (5 * ( F-32) / 9)

        int fahrenheit = 68;
        int celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println("Temperatura em fahrenheit: "+fahrenheit+"F" +" \nTemperatura em celsius: "+celsius+"°");
    }
}
