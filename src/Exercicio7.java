import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite TRUE ou FALSE");
        boolean bool1 = sc.nextBoolean();
        System.out.println("Digite TRUE ou FALSE");
        boolean bool2 = sc.nextBoolean();

        if (bool1 && bool2) {
            System.out.println("Ambos são verdadeiros");
        } else {
            System.out.println("Ambos são falsos.");
        }

    }
}
