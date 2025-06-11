import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("O Sucessor de "+ num +": "+ (num + 1) + "\nO Antecessor de "+ num +": "+ (num - 1));
    }
}
