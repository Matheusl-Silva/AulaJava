public class Venda {

  private double valorVenda;
  private double multa;
  private double excesso;

  public Venda(double valorVenda) {
    this.valorVenda = valorVenda;
    if (valorVenda > 500.00) {
      this.excesso = valorVenda - 500.00;
      this.multa = excesso * 0.10;
    } else {
      this.multa = 0.00;
      this.excesso = 0.00;
    }
  }

  public double getValorVenda() {
    return valorVenda;
  }

  public double getMulta() {
    return multa;
  }

  public double getExcesso() {
    return excesso;
  }

  @Override
  public String toString() {
    return String.format("Venda: R$ %.2f, Excesso: R$ %.2f, Multa: R$ %.2f", valorVenda, excesso, multa);
  }

}
