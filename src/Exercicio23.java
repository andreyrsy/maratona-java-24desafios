public class Exercicio23 {
    public static void main(String[] args) {
/*
23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
As informações fornecidas serão: valor da hora aula, número de aulas lecionadas
no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
*/
        double valorHora = 15.45;
        double aulasLecionadas = 110;
        double somaHoraXAulas = valorHora * aulasLecionadas;

        System.out.println("Saldo bruto: " + somaHoraXAulas);
        System.out.println("Saldo liquido: " + func(somaHoraXAulas));


    }
    public static double func(double somaHoraXAulasF) {
        if(somaHoraXAulasF <= 1518){
            somaHoraXAulasF -= somaHoraXAulasF * 7.5 / 100;
        } else if(somaHoraXAulasF >= 1518.01 && somaHoraXAulasF <= 2793.88){
            somaHoraXAulasF -= somaHoraXAulasF * 9 / 100;
        } else if(somaHoraXAulasF >= 2793.89 && somaHoraXAulasF <= 4190.83){
            somaHoraXAulasF -= somaHoraXAulasF * 12 / 100;
        } else if(somaHoraXAulasF >= 4190.84 && somaHoraXAulasF <= 8157.41){
            somaHoraXAulasF -= somaHoraXAulasF * 14 / 100;
        }
        return somaHoraXAulasF;
    }
}
