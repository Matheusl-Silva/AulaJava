public class Pessoa {
  private String nome;
  private String cpf;
  private int cod;
  private Endereco endereco;

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public int getCod() {
    return cod;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setCod(int cod) {
    this.cod = cod;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "Pessoa: \nNome: " + this.nome + "\nCpf: " + this.cpf + "\nCod: " + this.cod + "\nEndereco: "
        + this.endereco.toString();
  }

}