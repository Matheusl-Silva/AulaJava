public class Circulo extends Forma2d {

  public Circulo() {
    super();
  }

  public Circulo(double altura, double largura, String nome) {
    super(altura, largura, nome);
  }

  @Override
  public double calculaArea() {
    return 3.14 * Math.pow(this.getAltura() / 2, 2);
  }
}
