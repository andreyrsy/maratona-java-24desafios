import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
/*
10 - Faça um algoritmo que leia três notas obtidas por um aluno,
e imprima na tela a média das notas.
*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.print("Terceira nota do aluno: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 +nota3 ) /3;
        System.out.println("Média do aluno: " + media);

    }
}
