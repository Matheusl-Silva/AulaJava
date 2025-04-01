import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        String digitado = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        calc.setnum1(Integer.parseInt(digitado));
        digitado = JOptionPane.showInputDialog("Digite o segundo numero: ");
        calc.setnum2(Integer.parseInt(digitado));

        JOptionPane.showMessageDialog(null, " -- Cálculos -- \n" +
                "Soma: " + calc.calcular() + "\n" +
                "Multiplicação: " + calc.multiplicar() + "\n" +
                "Divisão: " + calc.dividir() + "\n" +
                "Subtração: " + calc.subtrair() + "\n" +
                "----------------- \n" +
                "Fim do programa!");
    }
}
