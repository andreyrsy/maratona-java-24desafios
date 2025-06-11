import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
/*
12 - Faça um algoritmo que leia o valor de um produto e determine o valor que
deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima
na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições
de pagamento para efetuar o cálculo adequado. Tabela de Código de Condições de Pagamento

    1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

    2 - À Vista no cartão de crédito, recebe 10% de desconto

    3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

    4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
*/


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Digite o valor do produto:");
        double valor = sc.nextDouble();

        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.print("Selecione a forma de pagamento: ");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Desconto de 15% a vista");
                System.out.println(valor -= (valor * 0.15));
                break;
            case 2:
                System.out.println("Desconto de 10% à vista no cartão de crédito");
                System.out.println(valor -= (valor * 0.10));
                break;
            case 3:
                System.out.println("2x sem juros");
                System.out.println(valor);
                break;
            case 4:
                System.out.println("3x com juros de 10%");
                System.out.println(valor += (valor * 0.10));
                break;
        }
    }
}
