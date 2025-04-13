import java.util.Scanner;

public class Usuario {

  private String nomeUsuario;
  private String senhaUsuario;
  private String emailUsuario;

  public String getNomeUsuario() {
    return nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }

  public String getSenhaUsuario() {
    return senhaUsuario;
  }

  public void setSenhaUsuario(String senhaUsuario) {
    this.senhaUsuario = senhaUsuario;
  }

  public String getEmailUsuario() {
    return emailUsuario;
  }

  public void setEmailUsuario(String emailUsuario) {
    this.emailUsuario = emailUsuario;
  }

  @Override
  public String toString() {
    return "Usuario nomeUsuario=" + nomeUsuario + ", senhaUsuario=" + senhaUsuario + ", emailUsuario=" + emailUsuario;
  }

  public Usuario(String nomeUsuario, String senhaUsuario, String emailUsuario) {
    this.nomeUsuario = nomeUsuario;
    this.senhaUsuario = senhaUsuario;
    this.emailUsuario = emailUsuario;
  }

  public static Usuario cadastrarUsuario() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o nome do usuário: ");
    String nomeUsuario = scan.nextLine();
    System.out.println("Digite a senha do usuário: ");
    String senhaUsuario = scan.nextLine();
    System.out.println("Digite o email do usuário: ");
    String emailUsuario = scan.nextLine();

    Usuario u1 = new Usuario(nomeUsuario, senhaUsuario, emailUsuario);
    System.out.println("Usuário cadastrado com sucesso!");
    return u1;
  }
}
