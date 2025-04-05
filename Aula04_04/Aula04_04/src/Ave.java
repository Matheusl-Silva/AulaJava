public class Ave extends Animal {
  private String local;
  private boolean Migra;

  public String getLocal() {
    return local;
  }

  public boolean isMigra() {
    return Migra;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public void setMigra(boolean migra) {
    Migra = migra;
  }

  public Ave(String nome, float peso, int recinto, String local, boolean migra) {
    super(nome, peso, recinto);
    this.local = local;
    this.Migra = migra;
  }

  public String toString() {
    return super.toString() + " Ave [local=" + local + ", Migra=" + Migra + "]";
  }

  public Ave() {

  }

}
