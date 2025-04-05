public class Pessoa {

  private String cpf;
  private int idade;

  public Pessoa(String cpf) {
    if (validarCPF(cpf)) {
      this.cpf = cpf;
    } else {
      System.out.println("CPF inválido. Não foi possível criar a pessoa.");
    }
  }

  public Pessoa(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    if (validarCPF(cpf)) {
      this.cpf = cpf;
    } else {
      System.out.println("CPF inválido. Não foi possível modificar o CPF.");
    }
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public static boolean validarCPF(String cpf) {

    if (cpf == null || cpf.length() != 11) {
      return false;
    }
    return true;
  }
}
