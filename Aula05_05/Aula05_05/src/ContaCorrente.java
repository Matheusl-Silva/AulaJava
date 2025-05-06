public class ContaCorrente extends Conta {

  public ContaCorrente() {
  }

  public ContaCorrente(double saldo) {
    super(saldo);
  }

  public boolean atualiza(double taxa) {
    return super.atualiza(taxa * 2);
  }

  public void deposita(double valor) {
    super.deposita(valor - 0.10);
  }
}