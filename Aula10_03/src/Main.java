import javax.swing.*;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

      /*  int codALuno = 0;
        float media  = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            for(int i = 0; i <= 3; i++){

            System.out.println("Digite a nota "+ i +" do aluno");
            media += scanner.nextFloat();
            }

            System.out.println("Digite o codigo "+codALuno+" aluno");
            String texto = JOptionPane.showInputDialog(null,"Digite o código do aluno");
            codALuno = Integer.parseInt(texto);
            System.out.println("A edia do aluno é " + (media/3));


        }while (codALuno != 0);

        scanner.close();
        */

        int tamanho = 10;
        String nomes[];
        nomes = new String[tamanho];

        for (int i = 0; i < tamanho; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite o nome "+ (i + 1));
            JOptionPane.showMessageDialog(null,nomes[i]);

        }

        SecureRandom rand = new SecureRandom();

        int sorteio = rand.nextInt(0,tamanho-1);

        JOptionPane.showMessageDialog(null,"O nome sorteado é: "+ nomes[sorteio]);

    }
}