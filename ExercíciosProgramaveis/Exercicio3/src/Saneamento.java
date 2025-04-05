public class Saneamento {
  private double indicePoluicao;

  // Construtor para inicializar o índice de poluição
  public Saneamento(double indicePoluicao) {
    this.indicePoluicao = indicePoluicao;
  }

  public void emitirNotificacao() {
    if (indicePoluicao < 0.06 || indicePoluicao > 0.16) {
      if (indicePoluicao >= 0.5) {
        System.out.println("Notificação para todos os grupos: Paralisar todas as atividades.");
      } else if (indicePoluicao >= 0.4) {
        System.out.println("Notificação para o 1º e 2º grupo: Suspender todas as atividades.");
      } else if (indicePoluicao >= 0.25) {
        System.out.println("Notificação para o 1º grupo: Reduzir as atividades em 50%.");
      }
    } else {
      System.out.println("Índice de poluição dentro dos limites aceitáveis. Nenhuma ação necessária.");
    }
  }

  public double getIndicePoluicao() {
    return indicePoluicao;
  }
}
