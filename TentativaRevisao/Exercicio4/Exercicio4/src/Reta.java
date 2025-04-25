public class Reta {

  private double angular, linear;

  public Reta(double angular, double linear) {
    this.angular = angular;
    this.linear = linear;
  }

  public double getAngular() {
    return angular;
  }

  public void setAngular(double angular) {
    this.angular = angular;
  }

  public double getLinear() {
    return linear;
  }

  public void setLinear(double linear) {
    this.linear = linear;
  }

  public void AcessarAgnular() {
    System.out.println("Acessando o angular: " + this.angular);
  }

  public void AcessarLinear() {
    System.out.println("Acessando o Linear: " + this.linear);
  }

  public String toString() {
    return "Reta [angular=" + angular + ", linear=" + linear + "]";
  }

  public boolean equals() {
    return this.angular == angular && this.linear == linear;
  }
}
