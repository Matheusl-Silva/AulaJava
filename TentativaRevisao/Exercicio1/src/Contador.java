public class Contador {
  private int valor;

  public void contador() {
    this.valor = 0;
  }

  public void zerar() {
    this.valor = 0;
  }

  public void incrementar() {
    this.valor++;
  }

  public void retornarValor() {
    System.out.println("Valor atual:" + this.valor);
  }

  public int getValor() {
    return this.valor;
  }

}
