public class Carro implements Veiculo{

    private String modelo;

    @Override
    public String obtertipo(){
        return "Carro";
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + this.modelo + '\'' +
                '}';
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
