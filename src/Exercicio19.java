public class Exercicio19 {
    public static void main(String[] args) {
/*
19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
*/
            int nTabuada = 1;

        for(int i = 1; i <= 10; i++){
                System.out.println("Tabuada * " +nTabuada++);
            for(int j = 1; j <= 10; j++){
                System.out.println(i +"*"+ j +" = "+ i * j );
            }
                System.out.println("\n----------------");
        }
    }
}
