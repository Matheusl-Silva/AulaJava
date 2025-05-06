public class ContaPoupanca extends Conta {

  public ContaPoupanca() {
  }

  public ContaPoupanca(double saldo) {
    super(saldo);
  }

  public boolean atualiza(double taxa) {
    return super.atualiza(taxa * 3);
  }

  public void deposita(double valor) {
    super.deposita(valor - 0.10);
  }
}