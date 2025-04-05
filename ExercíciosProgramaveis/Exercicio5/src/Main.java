// Arquivo Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o CPF (apenas números): ");
        String cpfInput = scanner.nextLine();
        Pessoa pessoaComCpf = new Pessoa(cpfInput);

        if (pessoaComCpf.getCpf() != null) {
            System.out.println("Pessoa criada com CPF: " + pessoaComCpf.getCpf());
        }

        // Teste de criação com idade
        System.out.print("Informe a idade: ");
        int idadeInput = scanner.nextInt();
        Pessoa pessoaComIdade = new Pessoa(idadeInput);
        System.out.println("Pessoa criada com idade: " + pessoaComIdade.getIdade());

        System.out.print("Informe o novo CPF para alteração: ");
        scanner.nextLine();
        String novoCpf = scanner.nextLine();
        pessoaComCpf.setCpf(novoCpf);

        System.out.print("Informe a nova idade para alteração: ");
        int novaIdade = scanner.nextInt();
        pessoaComIdade.setIdade(novaIdade);

        System.out.println("Pessoa com nova idade: " + pessoaComIdade.getIdade());

        scanner.close();
    }
}
