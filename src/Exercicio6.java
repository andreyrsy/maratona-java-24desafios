import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();
        sc.close();
        System.out.println("Salário base: " + salario);

        salario += salario * 0.05;

        System.out.println("Reajuste de 5%: " + salario);
    }
}
