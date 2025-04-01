public class Contador {

  private int contagem;

  public void setContagem(int contagem) {
    this.contagem = contagem;
  }

  public int getContagem() {
    return contagem;
  }

  public void incrementar() {
    this.contagem++;
  }

  public void zerar() {
    this.contagem = 0;
  }

  public void decrementar() {
    this.contagem--;
  }

}
