import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaEscala {
    private Map<String, Escala> escalas;  // Map com nome do serviço -> Escala

    public SistemaEscala() {
        escalas = new HashMap<>();
        // Inicializa as escalas de serviço
        escalas.put("Música", new Escala("Música"));
        escalas.put("Sala", new Escala("Sala"));
        escalas.put("Intercessão", new Escala("Intercessão"));
        escalas.put("Cozinha", new Escala("Cozinha"));
        escalas.put("Secretaria", new Escala("Secretaria"));
    }

    // Verifica se a pessoa pode ser adicionada à escala
    public boolean registrarPessoa(Pessoa pessoa, String nomeServico, String horario) {
        Escala escala = escalas.get(nomeServico);
        if (escala == null) {
            System.out.println("Serviço não encontrado!");
            return false;
        }

        // Verifica se a pessoa tem restrição para o horário
        if (pessoa.temRestricao(horario)) {
            System.out.println(pessoa.getNome() + " tem restrição nesse horário.");
            return false;
        }

        // Verifica se já tem alguém no horário
        if (escala.temPessoaNoHorario(horario)) {
            System.out.println("Já há uma pessoa registrada nesse horário.");
            return false;
        }

        // Adiciona a pessoa na escala
        return escala.adicionarPessoa(horario, pessoa);
    }

    public void exibirEscalas() {
        System.out.println("Escalas de Serviço:");
        for (Escala escala : escalas.values()) {
            System.out.println(escala.getNomeServico() + ":");
            // Usando o getter para acessar os horários disponíveis
            for (String horario : escala.getHorariosDisponiveis().keySet()) {
                System.out.println("  Horário " + horario + " - " + escala.getHorariosDisponiveis().get(horario).getNome());
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaEscala sistema = new SistemaEscala();

        while (true) {
            System.out.println("Digite o nome da pessoa (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            Pessoa pessoa = new Pessoa(nome);
            System.out.println("Digite os horários que a pessoa não pode (formato HH:MM, para parar digite 'fim'):");
            while (true) {
                String horario = scanner.nextLine();
                if (horario.equalsIgnoreCase("fim")) {
                    break;
                }
                pessoa.adicionarRestricao(horario);
            }

            // Mostrar opções de serviço
            System.out.println("Escolha um serviço (Música, Sala, Intercessão, Cozinha, Secretaria):");
            String servico = scanner.nextLine();
            System.out.println("Digite o horário (formato HH:MM):");
            String horario = scanner.nextLine();

            // Tentar registrar a pessoa
            if (sistema.registrarPessoa(pessoa, servico, horario)) {
                System.out.println(pessoa.getNome() + " registrado com sucesso na escala de " + servico + " para o horário " + horario);
            } else {
                System.out.println("Erro ao registrar a pessoa.");
            }

            sistema.exibirEscalas();
        }

        scanner.close();
    }
}
