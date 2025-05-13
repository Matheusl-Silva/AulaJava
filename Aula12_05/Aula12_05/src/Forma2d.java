public abstract class Forma2d {

  private double altura;
  private double largura;
  private String nome;

  // Método abstrato

  public abstract double calculaArea();

  // construtor vazio
  public Forma2d() {
    this.largura = this.altura = 0.0;
    this.nome = "nada";
  }

  public Forma2d(double altura, double largura, String nome) {
    this.largura = largura;
    this.altura = altura;
    this.nome = nome;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String toString() {
    return "Forma2d \n " +
        "Nome: " + this.nome + "\n" +
        "Altura" + this.altura + "\n" +
        "Largura" + this.largura;

  }

}
