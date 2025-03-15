import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {

        /* exercício 1
        String text = JOptionPane.showInputDialog(null, "Digite o numero para saber a tabuada");

        int number = Integer.parseInt(text);

        String tabu = "";

        for (int i = 1; i < 10; i++){

            tabu += i + "x" + number + "=" + number*i + "\n";

        }
        if (number < 10){
            JOptionPane.showMessageDialog(null,"Tabuada do:" + number + "\n" + tabu);
        }

         */
        /* Exercício 2
        for (int i = 1; i < 11; i++){
            for (int b = 1; b < 6; b++){
                System.out.print(b + "x" + i + "=" + i*b + "\t");
            }
            System.out.print("\n");
        }

        for (int c = 1; c < 11; c++){
            for(int d = 6; d < 11; d++){
                System.out.print(c + "x" + d + "=" + c*d + "\t");
            }
            System.out.print("\n");
        }

        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os numeros no seguinte formato: N-N-N-...-N-N-N");

        String text =   scanner.nextLine();
        String[] numeroString = text.split("-");

        Integer[] number = new Integer[numeroString.length];

        for (int i = 0; i < numeroString.length; i++){
            number[i] = Integer.parseInt(numeroString[i]);
        }

        Arrays.sort(number, Collections.reverseOrder());

        System.out.print(Arrays.toString(number));
    }



}