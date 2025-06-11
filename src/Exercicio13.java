import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
/*
13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome
da pessoa e se ela é maior ou menor de idade.
*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();


        if(idade >= 18) {
            System.out.println(nome + " é maior de idade e tem " + idade + " anos");
        } else {
            System.out.println(nome + " é menor de idade e tem " + idade + " anos");
        }


    }
}
