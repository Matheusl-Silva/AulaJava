import java.util.Calendar;
import java.util.Scanner;

public class Paciente {

  private String nomePaciente;
  private int registroPaciente;
  private String periodoPaciente;
  private Calendar dataNascimento;
  private String telefonePaciente;
  private String emailPaciente;
  private String nomeMaePaciente;
  private String medicamento;
  private String patologia;

  public String getNomePaciente() {
    return nomePaciente;
  }

  public void setNomePaciente(String nomePaciente) {
    this.nomePaciente = nomePaciente;
  }

  public int getRegistroPaciente() {
    return registroPaciente;
  }

  public void setRegistroPaciente(int registroPaciente) {
    this.registroPaciente = registroPaciente;
  }

  public String getPeriodoPaciente() {
    return periodoPaciente;
  }

  public void setPeriodoPaciente(String periodoPaciente) {
    this.periodoPaciente = periodoPaciente;
  }

  public Calendar getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Calendar dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getTelefonePaciente() {
    return telefonePaciente;
  }

  public void setTelefonePaciente(String telefonePaciente) {
    this.telefonePaciente = telefonePaciente;
  }

  public String getEmailPaciente() {
    return emailPaciente;
  }

  public void setEmailPaciente(String emailPaciente) {
    this.emailPaciente = emailPaciente;
  }

  public String getNomeMaePaciente() {
    return nomeMaePaciente;
  }

  public void setNomeMaePaciente(String nomeMaePaciente) {
    this.nomeMaePaciente = nomeMaePaciente;
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

  public Paciente(String nomePaciente, int registroPaciente, String periodoPaciente, Calendar dataNascimento,
      String telefonePaciente, String emailPaciente, String nomeMaePaciente, String medicamento, String patologia) {
    this.nomePaciente = nomePaciente;
    this.registroPaciente = registroPaciente;
    this.periodoPaciente = periodoPaciente;
    this.dataNascimento = dataNascimento;
    this.telefonePaciente = telefonePaciente;
    this.emailPaciente = emailPaciente;
    this.nomeMaePaciente = nomeMaePaciente;
    this.medicamento = medicamento;
    this.patologia = patologia;
  }

  @Override
  public String toString() {
    return "Paciente [nomePaciente=" + nomePaciente + ", registroPaciente=" + registroPaciente + ", periodoPaciente="
        + periodoPaciente + ", dataNascimento=" + dataNascimento + ", telefonePaciente=" + telefonePaciente
        + ", emailPaciente=" + emailPaciente + ", nomeMaePaciente=" + nomeMaePaciente + ", medicamento=" + medicamento
        + ", patologia=" + patologia + "]";
  }

  public static Paciente cadastrPaciente() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o nome do paciente: ");
    String nomePaciente = scan.nextLine();
    System.out.println("Digite o registro do paciente: ");
    int registroPaciente = scan.nextInt();
    System.out.println("Digite o periodo do paciente: ");
    String periodoPaciente = scan.nextLine();
    System.out.println("Digite a data de nascimento do paciente: ");
    Calendar dataNascimento = Calendar.getInstance();
    System.out.println("Digite o telefone do paciente: ");
    String telefonePaciente = scan.nextLine();
    System.out.println("Digite o email do paciente: ");
    String emailPaciente = scan.nextLine();
    System.out.println("Digite o nome da mãe do paciente: ");
    String nomeMaePaciente = scan.nextLine();
    System.out.println("Digite o medicamento do paciente: ");
    String medicamento = scan.nextLine();
    System.out.println("Digite a patologia do paciente: ");
    String patologia = scan.nextLine();

    Paciente p1 = new Paciente(nomePaciente, registroPaciente, periodoPaciente, dataNascimento, telefonePaciente,
        emailPaciente, nomeMaePaciente, medicamento, patologia);
    System.out.println("Paciente cadastrado com sucesso!");
    return p1;
  }

}
