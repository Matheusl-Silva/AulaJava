public class Carro {

  private String tipo;
  private String cor;
  private String placa;
  private int numPortas;

  public void ligar() {
    System.out.println("O carro ligou");
  }

  public void desligar() {
    System.out.println("O carro desligou");
  }

  public void acelerar() {
    System.out.println("O carro acelerou");
  }

  public void frear() {
    System.out.println("O carro freou");
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void setNumPortas(int numPortas) {
    this.numPortas = numPortas;
  }

  public String getTipo() {
    return this.tipo;
  }

  public String getCor() {
    return this.cor;
  }

  public String getPlaca() {
    return this.placa;
  }

  public int getNumPortas() {
    return this.numPortas;
  }

}