import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
/*
    5-Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
(Base para o Salário mínimo R$ 1.293,20).
 */
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1293.20;

        System.out.print("Digite o seu salário: ");
        double salarioUsuario = sc.nextDouble();

        System.out.println("Seu salário atual: " + salarioUsuario);
        System.out.println("Salário minimo atual: " + salarioMinimo);

       double qtdSalarios = Math.round(salarioUsuario / salarioMinimo);
        System.out.println("Você possui "+ qtdSalarios +" salários.");
    }
}
