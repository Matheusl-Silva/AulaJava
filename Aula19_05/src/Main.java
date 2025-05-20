import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Animal dog1 = new Dog("Pedro",2,true);
        Animal cat1 = new Cat("Gatinho",10,true);

        ArrayList<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(dog1);
        listAnimals.add(cat1);

        for (Animal animal : listAnimals){
            System.out.println(animal.toString());
            animal.som();
            animal.mover();
        }
       */

        Veiculo car1 = new Carro("pokemon");
        Veiculo bike1 = new Bicicleta("Montanha");
        Veiculo caminh = new Caminhao(140.09);

        ArrayList<Veiculo> listVeiculos = new ArrayList<>();
        listVeiculos.add(car1);
        listVeiculos.add(bike1);
        listVeiculos.add(caminh);

        for(Veiculo item : listVeiculos){
            System.out.println(item.toString());
            item.acelerar();
            item.frear();
        }

    }
}