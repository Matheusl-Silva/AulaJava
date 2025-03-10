import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<String> restricoesHorarios;  // Horários que a pessoa não pode trabalhar

    public Pessoa(String nome) {
        this.nome = nome;
        this.restricoesHorarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarRestricao(String horario) {
        restricoesHorarios.add(horario);
    }

    public boolean temRestricao(String horario) {
        return restricoesHorarios.contains(horario);
    }
}
