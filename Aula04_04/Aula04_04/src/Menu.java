import java.util.Scanner;

public class Menu {

  Scanner scan = new Scanner(System.in);

  public Animal cadastrarAnimal() {

    Animal animal1 = new Animal();
    System.out.println("Digite o nome do animal: ");
    animal1.setNome(scan.next());
    System.out.println("Digite o peso do animal: ");
    animal1.setPeso(scan.nextFloat());
    System.out.println("Digite o recinto do animal: ");
    animal1.setRecinto(scan.nextInt());
    animal1.emitirSom(2);

    return animal1;
  }
}
