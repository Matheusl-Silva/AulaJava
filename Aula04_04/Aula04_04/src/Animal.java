public class Animal {
  private String nome;
  private float peso;
  private int recinto;

  public Animal(String nome, float peso, int recinto) {
    this.nome = nome;
    this.peso = peso;
    this.recinto = recinto;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public void setRecinto(int recinto) {
    this.recinto = recinto;
  }

  public String getNome() {
    return nome;
  }

  public float getPeso() {
    return peso;
  }

  public int getRecinto() {
    return recinto;
  }

  public Animal() {
  }

  @Override
  public String toString() {
    return "Animal [nome=" + nome + ", peso=" + peso + ", recinto=" + recinto + "]";
  }

  public void emitirSom(int quantidade) {
    for (int i = 1; i <= quantidade; i++) {
      System.out.println("muuuuuu");
    }
  }

}
