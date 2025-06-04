public class Conta {
  private double saldo;

  public Conta(double saldoInicial) {
    this.saldo = saldoInicial;
  }

  public double getSaldo() {
    return saldo;
  }

  public void saca(double valor) throws ContaExcecao {
    if (saldo < valor) {
      throw new ContaExcecao("Saldo insuficiente para realizar o saque.");
    }
    saldo -= valor;
  }

  public void deposita(double valor) {
    saldo += valor;
  }
}
