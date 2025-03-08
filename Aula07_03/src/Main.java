import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String teste1 = ">>O operador de concatenacao (+) ";
        String teste2 = "Muito easyyyyy";
        String teste3 = teste1 + teste2;
        System.out.println(teste3 + "Kudlake cadeira ruim");
        System.out.println("2 + 5 = " + 2 + 5);
        System.out.println("correto: 2 + 5 = " + (2+ 5));


        if(teste1 == teste2){
            System.out.println("Parabens igausi");
        }else{
            System.out.println("Kudlake é gay");
        }

        int i = 10;
        int j = 2;
        int x = 0;
        int y = 0;
        j++;
        ++i;
        x = i++ + j;
        y =  ++j + ++i;
        System.out.println(x);
        System.out.println(y);

        float m1 = 0,m2 = 0, m3 =0, media;
        System.out.println("Digite as 3 numeros para obter a media dos mesmos");
        Scanner input = new Scanner(System.in);
        m1 = input.nextInt();
        m2 = input.nextInt();
        m3 = input.nextInt();

        media = (m1 + m2 + m3) / 3;

        System.out.println("A media dos três números é igual a: " +media);

        int a = 10, b =5, c =2, d=3, e=1, f=5, g=7, h=2, k=2;
        System.out.println(" - " + ((a + b)^c^(d - e)+(f - g)*(h + k)));
        System.out.println(" - " + (a + b^c^d - e+f - g*h + k));
        System.out.println(" - " + (((a / b) ^ c) ^ d - e + f - (g * h) + k));

        int t1,t2,t3;

        t1 > t2-t3 && t1 < t2+t3

        //terminar os exercícios em casa

    }
}