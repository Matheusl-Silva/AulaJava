import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o índice de poluição medido: ");
        double indicePoluicao = scanner.nextDouble();

        Saneamento saneamento = new Saneamento(indicePoluicao);
        saneamento.emitirNotificacao();

        scanner.close();
    }
}
