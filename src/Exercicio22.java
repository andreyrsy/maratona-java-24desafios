import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
/*
22 - Faça um algoritmo que leia dois valores inteiros A e B,
imprima na tela o quociente e o resto da divisão inteira entre eles.
*/


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        int quociente = a / b;
        int resto = a % b;

        System.out.println("quociente: " + quociente
                           + "\nresto: " + resto);
    }
}
