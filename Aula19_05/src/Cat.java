public class Cat implements Animal{
    private String nome;
    private int idade;
    private  boolean castrado;

    @Override
    public void mover() {
        System.out.println("Gato andando");
    }

    @Override
    public void som() {
        System.out.println("miau miau");
    }

    public Cat(){}

    public Cat(String nome, int idade,boolean castrado){
        this.nome       = nome;
        this.idade      = idade;
        this.castrado   = castrado;
    }

    public String toString(){
        return "Cat - Nome:"+this.nome +" - Idade: "+ this.idade + "- Castrado "+ this.castrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean iscastrado() {
        return castrado;
    }

    public void setcastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
