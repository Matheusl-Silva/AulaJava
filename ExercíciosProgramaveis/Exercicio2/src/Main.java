import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor original do boleto: R$ ");
        double valorOriginal = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias de atraso: ");
        int diasAtraso = scanner.nextInt();

        Boleto boleto = new Boleto(valorOriginal, diasAtraso);

        double valorTotal = boleto.calcularValorTotal();

        System.out.println("O valor total a ser pago é: R$ " + String.format("%.2f", valorTotal));

        scanner.close();
    }
}
