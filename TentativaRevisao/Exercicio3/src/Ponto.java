import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ponto {

  private double abcissa;
  private double ordenada;

  public double getAbcissa() {
    return abcissa;
  }

  public void setAbcissa(double abcissa) {
    this.abcissa = abcissa;
  }

  public double getOrdenada() {
    return ordenada;
  }

  public void setOrdenada(double ordenada) {
    this.ordenada = ordenada;
  }

  public Ponto() {
    this.ordenada = 0.0;
    this.abcissa = 0.0;
  }

  public Ponto(double abcissa, double ordenada) {
    this.abcissa = abcissa;
    this.ordenada = ordenada;
  }

  public Ponto(Ponto ponto) {
    this.abcissa = ponto.getAbcissa();
    this.ordenada = ponto.getOrdenada();
  }

  public void MoverPonto(double abcissa, double ordenada) {
    this.abcissa = abcissa;
    this.ordenada = ordenada;
  }

  public void MoverPonto(Ponto ponto) {
    this.abcissa = ponto.getAbcissa();
    this.ordenada = ponto.getOrdenada();
  }

  public String toString() {
    return "Ponto [abcissa=" + abcissa + ", ordenada=" + ordenada + "]";
  }

  public boolean equals(Ponto ponto) {
    if (this.abcissa == ponto.getAbcissa() || this.ordenada == ponto.getOrdenada()) {
      return true;
    } else {
      return false;
    }
  }

  public double VerificarDistancia(Ponto ponto) {
    double distX = this.getAbcissa() - ponto.getAbcissa();
    double distY = this.getOrdenada() - ponto.getOrdenada();
    return Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
  }

  public Ponto RetornarPonto() {
    return new Ponto(this.abcissa, this.ordenada);
  }
}