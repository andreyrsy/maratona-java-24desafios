import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
/*
    9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição

de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC

Abaixo de 18,5   | Abaixo do peso

Entre 18,6 e 24,9 | Peso ideal (parabéns)

Entre 25,0 e 29,9 | Levemente acima do peso

Entre 30,0 e 34,9 | Obesidade grau I

Entre 35,0 e 39,9 | Obesidade grau II (severa)

Maior ou igual a 40 | Obesidade grau III (mórbida)
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------- IMC ----------------");
        System.out.print("Digite seu Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua Altura: ");
        double altura = sc.nextDouble();
        System.out.println("-------------------------------------");

        imc(peso,altura);

    }
    public static void imc(double peso, double altura) {

        double imcT = peso / (altura * altura);
        String str = String.valueOf(imcT).substring(4, 8);
        String imc = str.substring(0, 2) + "."  + str.substring(2);
        double resultado = Double.parseDouble(imc);
        System.out.println("Seu IMC: " + imc);

        System.out.print("Resultado: ");
        if(resultado <= 18.5){
            System.out.println("Abaixo do peso.");
        } else if(resultado >= 18.6 && resultado <=24.9){
            System.out.println("Peso ideal (parabéns)");
        } else if(resultado >= 25 && resultado <=29.9){
            System.out.println("Levemente acima do peso");
        } else if(resultado >= 30 && resultado <= 34.9){
            System.out.println("Obesidade grau I");
        } else if(resultado >= 35 && resultado <= 39.9){
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }

    }
}
