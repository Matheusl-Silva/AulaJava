import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Ave ave1 = new Ave();
        System.out.println("Digite o nome do animal: ");
        ave1.setNome(scan.next());
        System.out.println("Digite o peso do animal: ");
        ave1.setPeso(scan.nextFloat());
        System.out.println("Digite o recinto do animal: ");
        ave1.setRecinto(scan.nextInt());
        System.out.println("Digite o local da Ave: ");
        ave1.setLocal(scan.nextLine());
        System.out.println("A ave é migratória? (true/false): ");
        ave1.setMigra(scan.nextBoolean());

        scan.close();

    }
}
