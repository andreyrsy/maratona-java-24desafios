import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
/*
14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de A:");
        double a = sc.nextDouble();
        System.out.println("Valor de B:");
        double b = sc.nextDouble();

        // Valor de A: 5
        // Valor de B: 10

        // temp = A;
        // A = B: 10
        // B = temp: 5

        double temp = a;

        a = b;
        b = temp;
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);


    }
}
