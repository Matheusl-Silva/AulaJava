import java.util.Scanner;

public class Caixa {
  public static void main(String[] args) {
    Conta conta = new Conta(500.0);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor para sacar: ");
    double valor = scanner.nextDouble();

    try {
      conta.saca(valor);
      System.out.println("Saque realizado com sucesso!");
      System.out.println("Saldo atual: R$" + conta.getSaldo());
    } catch (ContaExcecao e) {
      System.out.println("Erro ao sacar: " + e.getMessage());
    }

    scanner.close();
  }
}
