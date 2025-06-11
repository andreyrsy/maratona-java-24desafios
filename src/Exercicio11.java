import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
/*
11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média
das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado.
 Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String aluno = sc.nextLine();
        System.out.print("Primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 +nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println("O Aluno " + aluno + " foi aprovado com sucesso!");
            System.out.println("Nota do aluno: " + media);
        } else {
            System.out.println("O Aluno " + aluno + " foi reprovado!");
            System.out.println("Nota do aluno: " + media);
        }
    }
}
