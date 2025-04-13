import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao = 0;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();

        do {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite uma opção para acessar o menu: ");
            System.out.println("1 - Inserir um Usuário: ");
            System.out.println("2 - Listar usuários: ");
            System.out.println("3 - Inserir um Paciente: ");
            System.out.println("4 - Listar Pacientes: ");
            System.out.println("5 - Remover um Paciente: ");
            System.out.println("6 - Remover um Usuário: ");
            System.out.println("7 - Sair:");
            System.out.println("Digite a opção desejada: ");

            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando um novo usuário...");
                    usuarios.add(Usuario.cadastrarUsuario());
                    break;
                case 2:
                    System.out.println("Listando os usuários cadastrados: ");
                    for (Usuario usuario : usuarios) {
                        System.out.println(usuario.toString());
                    }
                    break;
                case 3:
                    System.out.println("Cadastrando um novo paciente...");
                    pacientes.add(Paciente.cadastrPaciente());
                    break;
                case 4:
                    System.out.println("Listando os pacientes cadastrados: ");
                    for (Paciente paciente : pacientes) {
                        System.out.println(paciente.toString());
                    }
                    break;
                case 5:
                    System.out.println("Removendo um paciente...");
                    System.out.println("Digite o registro do paciente que deseja remover: ");
                    int registroPaciente = scan.nextInt();
                    for (int i = 0; i < pacientes.size(); i++) {
                        if (pacientes.get(i).getRegistroPaciente() == registroPaciente) {
                            pacientes.remove(i);
                            System.out.println("Paciente removido com sucesso!");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Removendo um usuário...");
                    System.out.println("Digite o nome do usuário que deseja remover: ");
                    String nomeUsuario = scan.nextLine();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getNomeUsuario().equals(nomeUsuario)) {
                            usuarios.remove(i);
                            System.out.println("Usuário removido com sucesso!");
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;

            }
            scan.close();

        } while (opcao != 7);
    }

}
