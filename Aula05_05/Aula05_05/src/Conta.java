public class Conta {
  private double saldo;

  public Conta() {
    this.saldo = 0.0;
  }

  public Conta(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void deposita(double valor) {
    if (valor > 0) {
      this.saldo += valor;
    }
  }

  public boolean saca(double valor) {
    if (valor > 0 && this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean atualiza(double taxa) {
    boolean isOk = false;
    if (taxa >= 1 && taxa <= 100) {
      this.saldo += this.saldo * (taxa / 100);
      isOk = true;
    }
    return isOk;
  }

}