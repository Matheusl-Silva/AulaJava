import java.util.HashMap;
import java.util.Map;

public class Escala {
    private String nomeServico;
    private Map<String, Pessoa> horariosDisponiveis;  // Mapa com horário -> pessoa

    public Escala(String nomeServico) {
        this.nomeServico = nomeServico;
        this.horariosDisponiveis = new HashMap<>();
    }

    public String getNomeServico() {
        return nomeServico;
    }

    // Getter para o mapa de horários
    public Map<String, Pessoa> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    // Tenta adicionar uma pessoa ao horário da escala, verificando conflitos
    public boolean adicionarPessoa(String horario, Pessoa pessoa) {
        if (horariosDisponiveis.containsKey(horario)) {
            return false; // Já tem alguém nesse horário
        }
        horariosDisponiveis.put(horario, pessoa);
        return true;
    }

    public boolean temPessoaNoHorario(String horario) {
        return horariosDisponiveis.containsKey(horario);
    }
}
