import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        Pessoa p1 = new Pessoa();
        p1.setNome("Matheus");
        p1.setCod(1);
        p1.setCpf("12345678901");
        listaPessoa.add(p1);

        for (Pessoa p : listaPessoa) {
            System.out.println(p.toString());
        }
    }
}
