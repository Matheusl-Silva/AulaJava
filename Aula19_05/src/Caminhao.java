public class Caminhao implements Veiculo{
    
    private double capacidadeCarga;

    public Caminhao(double i) {
        this.capacidadeCarga = i;
    }


    @Override
    public String obtertipo() {
        return "Caminhão";
    }

    @Override
    public void frear() {
        System.out.println("Caminhão freando");
    }

    @Override
    public void acelerar() {
        System.out.println("Sai da frente caminhão passando");
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeCarga=" + this.capacidadeCarga +
                '}';
    }
}
