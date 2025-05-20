public class Pessoa {

    private static int qtd;
    private int id;
    private String nome;

    public Pessoa(){
        this.qtd++;
        this.id = this.qtd;
    }

    public Pessoa(String nome){
        this.qtd++;
        this.id = this.qtd;
        this.nome = nome;
    }

    public static int getQtd() {
        return qtd;
    }

    public static void setQtd(int qtd) {
        Pessoa.qtd = qtd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Pessoa\n  [Id: "+this.id + "Nome: " +this.nome +"Quantidade" +this.qtd;
    }
}
