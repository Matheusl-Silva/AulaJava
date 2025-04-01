import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Carro carro = new Carro();

        carro.setTipo(JOptionPane.showInputDialog("Digite o tipo do carro"));
        carro.setCor(JOptionPane.showInputDialog("Digite a cor do carro"));
        carro.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro"));
        carro.setNumPortas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas do carro")));
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Número de portas: " + carro.getNumPortas());

        JOptionPane.showMessageDialog(null, "O tipo do carro é: " + carro.getTipo());

    }
}
