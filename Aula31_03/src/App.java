import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercício 2:

        /*
         * Calculadora calc = new Calculadora();
         * 
         * String digitado = JOptionPane.showInputDialog("Digite o primeiro numero: ");
         * calc.setnum1(Integer.parseInt(digitado));
         * digitado = JOptionPane.showInputDialog("Digite o segundo numero: ");
         * calc.setnum2(Integer.parseInt(digitado));
         * 
         * JOptionPane.showMessageDialog(null, " -- Cálculos -- \n" +
         * "Soma: " + calc.calcular() + "\n" +
         * "Multiplicação: " + calc.multiplicar() + "\n" +
         * "Divisão: " + calc.dividir() + "\n" +
         * "Subtração: " + calc.subtrair() + "\n" +
         * "----------------- \n" +
         * "Fim do programa!");
         */

        // Exercício 3:

        Contador cont = new Contador();
        String digitado = JOptionPane.showInputDialog("Digite o valor inicial: ");
        cont.setContagem(Integer.parseInt(digitado));

        String opcao = "0";

        while (!opcao.equals("5")) {
            opcao = JOptionPane.showInputDialog("Escolha uma opção: \n" +
                    "1 - Incrementar \n" +
                    "2 - Decrementar \n" +
                    "3 - Zerado \n" +
                    "4 - Mostrar contagem \n" +
                    "5 - Sair");
            switch (opcao) {
                case "1":
                    cont.incrementar();
                    JOptionPane.showMessageDialog(null, "Contagem incrementada: " + cont.getContagem());
                    break;
                case "2":
                    cont.decrementar();
                    JOptionPane.showMessageDialog(null, "Contagem decrementada: " + cont.getContagem());
                    break;
                case "3":
                    cont.zerar();
                    JOptionPane.showMessageDialog(null, "Contagem zerada: " + cont.getContagem());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Contagem atual: " + cont.getContagem());
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
