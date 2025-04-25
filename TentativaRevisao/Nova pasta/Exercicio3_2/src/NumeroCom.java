public class NumeroCom {

  private double imaginario;
  private double real;

  public NumeroCom(double real, double imaginario) {
    this.real = real;
    this.imaginario = imaginario;
  }

  public double getImaginario() {
    return imaginario;
  }

  public void setImaginario(double imaginario) {
    this.imaginario = imaginario;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public void SomarNumero(NumeroCom numero) {
    this.real += numero.getReal();
    this.imaginario += numero.getImaginario();
  }

  public void SubtrairNumero(NumeroCom numero) {
    this.real -= numero.getReal();
    this.imaginario -= numero.getImaginario();
  }

  public void MultiplicarNumero(NumeroCom numero) {
    double real = this.real * numero.getReal() - this.imaginario * numero.getImaginario();
    this.real = real;
    double imaginario = this.real * numero.getImaginario() + this.imaginario * numero.getReal();
    this.imaginario = imaginario;
  }

  public void DividirNumero(NumeroCom outro){
    double real = (this.real)

  }

  public String toString() {
    return this.real + " + " + this.imaginario + "i";
  }

  public boolean equals(NumeroCom numero) {
    if (this.real == numero.getReal() && this.imaginario == numero.getImaginario()) {
      return true;
    } else {
      return false;
    }
  }

  public double modulo() {
    return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginario, 2));
  }

}
