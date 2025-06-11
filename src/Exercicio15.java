import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite sua data de nascimento (dd/MM/yyyy):");
        String dataTexto = sc.nextLine();

        LocalDate dataNascimento = LocalDate.parse(dataTexto, formatter);
        LocalDate dataAtual = LocalDate.now();

        long diasDeVida = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
        long anos = diasDeVida / 365;
        long diasRestantes = diasDeVida % 365;
        long meses = diasRestantes / 30;
        long dias = diasRestantes % 30;

        System.out.println("Você viveu aproximadamente: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

        sc.close();
    }
}
