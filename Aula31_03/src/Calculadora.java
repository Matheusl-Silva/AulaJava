public class Calculadora {
  private int num1;
  private int num2;

  public void setnum1(int num1) {
    this.num1 = num1;
  }

  public void setnum2(int num2) {
    this.num2 = num2;
  }

  public int getnum1() {
    return num1;
  }

  public int getnum2() {
    return num2;
  }

  // metodos da classe

  public int calcular() {
    return this.num1 + this.num2;
  }

  public int multiplicar() {
    return this.num1 * this.num2;
  }

  public float dividir() {
    return (float) this.num1 / (float) this.num2;
  }

  public int subtrair() {
    return this.num1 - this.num2;
  }

}
