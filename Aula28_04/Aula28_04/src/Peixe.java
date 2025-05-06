public class Peixe extends Animal {

  private boolean aguaDoce;

  public Peixe(String nome, double velocidade, double localizacao, boolean aguaDoce) {
    super(nome, velocidade, localizacao);
    this.aguaDoce = aguaDoce;
  }

  public boolean getAguaDoce() {
    return aguaDoce;
  }

  public void setAguaDoce(boolean aguaDoce) {
    this.aguaDoce = aguaDoce;
  }

  public void mover() {
    System.out.println("-> -> ->");
    super.setLocalizacao(super.getLocalizacao() + super.getVelocidade());
  }

  @Override
  public String toString() {
    return super.toString() + "Agua doce? " + this.aguaDoce;
  }

  public void Peixe() {
  }

}
