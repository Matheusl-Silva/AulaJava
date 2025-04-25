public class App {
    public static void main(String[] args) throws Exception {

        Contador contador = new Contador();

        System.out.println("Valor inicial: " + contador.getValor());
        contador.incrementar();
        contador.incrementar();
        System.out.println("Valor após incrementar duas vezes: " + contador.getValor());
        contador.zerar();
        System.out.println("Contador zerado:" + contador.getValor());
    }
}
