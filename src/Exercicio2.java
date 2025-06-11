import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
/*
    2 - Faça um algoritmo para receber um número qualquer e
imprimir na tela se o número é par ou ímpar, positivo ou negativo.
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é Par");
        } else{
            System.out.println("O número é Impar");
        }
        if(num <= 0){
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é positivo.");
        }
    }
}
