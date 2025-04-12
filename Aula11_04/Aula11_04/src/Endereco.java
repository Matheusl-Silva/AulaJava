public class Endereco {

  private String logradouro;

  public Endereco(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String toString() {
    return "Endereco: \nLogradouro: " + this.logradouro;
  }
}