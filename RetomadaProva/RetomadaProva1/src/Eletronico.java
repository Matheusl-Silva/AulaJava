public class Eletronico extends Produto {

  private int voltagem;
  private String FontedeEnergia;

  public int getVoltagem() {
    return voltagem;
  }

  public void setVoltagem(int voltagem) {
    this.voltagem = voltagem;
  }

  public String getFontedeEnergia() {
    return FontedeEnergia;
  }

  public void setFontedeEnergia(String fontedeEnergia) {
    FontedeEnergia = fontedeEnergia;
  }

  @Override
  public String toString() {
    return "Eletronico [voltagem=" + voltagem + ", FontedeEnergia=" + FontedeEnergia + "]";
  }
}
