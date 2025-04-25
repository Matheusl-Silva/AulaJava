import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        ponto1.setAbcissa(3.0);
        ponto1.setOrdenada(4.0);
        ponto1.MoverPonto(5.0, 6.0);
        System.out.println(ponto1.toString());
        System.out.println(ponto1.equals(new Ponto(5.0, 6.0)));

    }
}