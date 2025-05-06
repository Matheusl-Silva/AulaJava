public class Passaro extends Animal {

  public Passaro(String nome, double velocidade, double localizacao) {
    super(nome, velocidade, localizacao);
  }

  public Passaro() {
  }

  public void mover() {
    System.out.println("^^ ^^ ^^");
    super.setLocalizacao(getLocalizacao() + super.getVelocidade());
  }

  public String toString() {
    return "Passaro: " + super.toString();
  }

}
