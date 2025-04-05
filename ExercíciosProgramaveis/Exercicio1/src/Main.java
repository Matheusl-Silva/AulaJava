import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleFinanceiro controle = new ControleFinanceiro();

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastro de vendas");
            System.out.println("2 - Consulta de imposto a pagar no mês");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastro de vendas
                    System.out.print("Digite o valor da venda: R$ ");
                    double valorVenda = scanner.nextDouble();
                    controle.cadastrarVenda(valorVenda);
                    break;
                case 2:
                    // Consulta de imposto a pagar no mês
                    controle.consultarMulta();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
