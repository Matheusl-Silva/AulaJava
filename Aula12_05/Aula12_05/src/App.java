import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Retangulo retangulo = new Retangulo(3.5, 5, "sala");
        System.out.println("A área do retangulo é: " + retangulo.calculaArea());

        Circulo circulo = new Circulo(2, 2, "Bola");
        System.out.println("O tamanho do circulo é: " + circulo.calculaArea());

        Scanner scan = new Scanner(System.in);
        ArrayList<Forma2d> formas = new ArrayList<>();

        String menu = "--- Formas 2D ----\n" +
                "1 - Cadastrar formas \n" +
                "2 - Listar formas\n" +
                "3 - Editar forma\n" +
                "4 - Excluir Forma\n" +
                "0 - Sair do menu\n";

        int option = 0;

        do {
            System.out.println(menu);
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Qual a forma deseja cadastrar?\n" +
                            "1 - Retangulo / 2 - Circulo");
                    int forma = scan.nextInt();
                    System.out.println("Digite a altura da forma: ");
                    double h = scan.nextDouble();
                    System.out.println("Digite a largura da forma: ");
                    double w = scan.nextDouble();
                    System.out.println("Digite o nome da forma: ");
                    String n = scan.next();

                    if (forma == 1) {
                        formas.add(new Circulo(h, w, n));
                    } else if (forma == 2) {
                        formas.add(new Circulo(h, w, n));
                    } else {
                        System.out.println("Opção inválida!!");
                    }
                    System.out.println(formas.size() + " Formas cadastradas com sucesso!");
                    break;

                default:
                    break;
            }

        } while (option != 0);

        scan.close();
    }

}
