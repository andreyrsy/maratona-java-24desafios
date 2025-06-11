import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
/*
    1 - Faça um algoritmo que leia os valores de A, B, C e em
seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor C: ");
        int c = sc.nextInt();

        if(a + b > c){
            System.out.println("A soma entre A e B é: " + (a + b) +" Soma maior que C");
        } else {
            System.out.println("A soma entre A e B: " + (a + b) +" Soma menor que C");
        }
    }
}
