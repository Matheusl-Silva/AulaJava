public class B extends A{

    private static int instancias;
    private String nome;

    public static int getInstancias() {
        return instancias;
    }

    public static void setInstancias(int instancias) {
        B.instancias = instancias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
