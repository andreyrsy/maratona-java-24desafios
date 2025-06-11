import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {
/*
21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

*/
        Random nAleatorio = new Random();
        int num = 100;
        System.out.println(nAleatorio.nextInt(num));
    }
}
