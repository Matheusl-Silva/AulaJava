public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Contas");
        Conta c1 = new ContaCorrente(10);
        Conta c2 = new ContaPoupanca(100.2);

        c1.atualiza(10);
        c2.atualiza(10);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
