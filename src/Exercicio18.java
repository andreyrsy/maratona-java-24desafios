public class Exercicio18 {
    public static void main(String[] args) {
/*
18 - Francisco tem 1,50m e cresce 2 centímetros por ano,
enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
Faça um algoritmo que calcule e imprima na tela em quantos
anos serão necessários para que Sara seja maior que Francisco.
*/
        double francisco = 1.50;
        double sara = 1.10;

        double crescimentoSara = 0.03;
        double crescimentoFrancisco = 0.02;
        int anos = 0;

        do{
            sara = sara + crescimentoSara;
            francisco = francisco + crescimentoFrancisco;
            anos += 1;
        }while(sara < francisco);
        System.out.println("A sara levou " + anos + " ano(s) para ficar maior que o Francisco");
    }
}
