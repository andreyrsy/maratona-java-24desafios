import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
/*
20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para descobrir a sua tabuada: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + "*" + num + "= "+ (num * i));
        }

    }
}
