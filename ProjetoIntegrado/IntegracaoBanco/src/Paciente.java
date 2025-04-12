import java.util.Calendar;

public class Paciente {

  private String nome;
  private int registro;
  private String periodo;
  private Calendar dataNascimento;
  private String telefone;
  private String email;
  private String nomeMae;
  private String medicamento;
  private String patologia;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getRegistro() {
    return registro;
  }

  public void setRegistro(int registro) {
    this.registro = registro;
  }

  public String getPeriodo() {
    return periodo;
  }

  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }

  public Calendar getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Calendar dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNomeMae() {
    return nomeMae;
  }

  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  public String getMedicamento() {
    return medicamento;
  }

  public void setMedicamento(String medicamento) {
    this.medicamento = medicamento;
  }

  public String getPatologia() {
    return patologia;
  }

  public void setPatologia(String patologia) {
    this.patologia = patologia;
  }

  public Paciente(String nome, int registro, String periodo, Calendar dataNascimento, String telefone, String email,
      String nomeMae, String medicamento, String patologia) {
    this.nome = nome;
    this.registro = registro;
    this.periodo = periodo;
    this.dataNascimento = dataNascimento;
    this.telefone = telefone;
    this.email = email;
    this.nomeMae = nomeMae;
    this.medicamento = medicamento;
    this.patologia = patologia;
  }

  @Override
  public String toString() {
    return "Paciente [nome=" + nome + ", registro=" + registro + ", periodo=" + periodo + ", dataNascimento="
        + dataNascimento.getTime() + ", telefone=" + telefone + ", email=" + email + ", nomeMae=" + nomeMae
        + ", medicamento=" + medicamento + ", patologia=" + patologia + "]";
  }

}
