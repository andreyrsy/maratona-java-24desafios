import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
/*
    3-Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um
dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

*/
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        if(a == b){
            c = (a + b);
            System.out.println("C: "+c);
        } else if (a != b){
            c = (a * b);
            System.out.println("C: "+c);
        }

    }
}
