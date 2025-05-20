public class Bicicleta implements Veiculo{

    private String tipo;

    @Override
    public String obtertipo() {
        return "Bicicleta";
    }

    @Override
    public void acelerar() {
        System.out.println("Prim Prim");
    }

    @Override
    public void frear() {
        System.out.println("bike freando");
    }

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(){}

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
