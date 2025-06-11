import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
/*
8 - Faça um algoritmo que leia três valores inteiros diferentes
e imprima na tela os valores em ordem decrescente.
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor do B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor do C: ");
        int c = sc.nextInt();

        Integer[] array = new Integer[] {a, b, c};
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));


    }
}
