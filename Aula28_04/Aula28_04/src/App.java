import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // Sem polimorfismo
        Peixe peixe1 = new Peixe("Nome", 0.1, 5, false);
        System.out.println(peixe1);
        peixe1.mover();
        System.out.println(peixe1);
        System.out.println("--------------------");
        Passaro passaro1 = new Passaro("Pica-Pau", 2.1, 7);
        System.out.println(passaro1);
        passaro1.mover();
        System.out.println(passaro1);

        // lista de animals
        System.out.println("\n \n \n");
        ArrayList<Animal> ListaAnimais = new ArrayList<>();
        ListaAnimais.add(peixe1);
        ListaAnimais.add(passaro1);

        /*
         * for (Animal a : ListaAnimais) {
         * if (a instanceof Peixe) {
         * ((Peixe) a).nadar();
         * } else if (a instanceof Passaro) {
         * ((Passaro) a).voar();
         * } else {
         * a.mover();
         * }
         * }
         */

        // maneira melhor de gerenciar os objetos:
        // Polimorfismo

        for (Animal a : ListaAnimais) {
            a.mover();
        }

    }
}