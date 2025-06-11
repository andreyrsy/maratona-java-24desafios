import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três valores para formar um triângulo!");
        System.out.print("Primeiro valor: ");
        int primeiro = sc.nextInt();

        System.out.print("Segundo valor: ");
        int segundo = sc.nextInt();

        System.out.print("Terceiro valor: ");
        int terceiro = sc.nextInt();

        if (primeiro + segundo > terceiro &&
                primeiro + terceiro > segundo &&
                segundo + terceiro > primeiro) {

            System.out.println("Os valores formam um triângulo!");

            if (primeiro == segundo && segundo == terceiro) {
                System.out.println("Tipo: Equilátero");
            } else if (primeiro == segundo || primeiro == terceiro || segundo == terceiro) {
                System.out.println("Tipo: Isósceles");
            } else {
                System.out.println("Tipo: Escaleno");
            }
        } else {
            System.out.println("Os valores **não** formam um triângulo válido.");
        }
        sc.close();
    }
}
