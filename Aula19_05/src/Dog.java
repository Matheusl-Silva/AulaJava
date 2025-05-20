public class Dog implements Animal{
    private String nome;
    private int idade;
    private  boolean castrado;

    @Override
    public void mover() {
        System.out.println("andando andando");
    }

    @Override
    public void som() {
        System.out.println("au au");
    }

    public Dog(){}

    public Dog(String nome, int idade,boolean castrado){
        this.nome       = nome;
        this.idade      = idade;
        this.castrado   = castrado;
    }
    
    public String toString(){
        return "Dog - Nome:"+this.nome +" - Idade: "+ this.idade + "- Castrado "+ this.castrado;
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
