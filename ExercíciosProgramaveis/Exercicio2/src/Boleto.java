public class Boleto {

  private double valorOriginal;
  private int diasAtraso;

  public Boleto(double valorOriginal, int diasAtraso) {
    this.valorOriginal = valorOriginal;
    this.diasAtraso = diasAtraso;
  }

  public double calcularValorTotal() {
    double valorComMulta = valorOriginal + (valorOriginal * 0.05);

    double valorComJuros = valorComMulta;
    for (int i = 0; i < diasAtraso; i++) {
      valorComJuros += valorComJuros * 0.01;
    }

    return valorComJuros;
  }

  public double getValorOriginal() {
    return valorOriginal;
  }

  public int getDiasAtraso() {
    return diasAtraso;
  }
}
