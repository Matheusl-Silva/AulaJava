import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vendas!");
        Alimento alimento1 = new Alimento();
        alimento1.setCodigo(1);
        alimento1.setDescricao("oreio");
        alimento1.setEstoque(10);
        alimento1.setPerecivel(true);
        alimento1.setValidade("05/05/2025");

        Eletronico eletronico1 = new Eletronico();
        eletronico1.setCodigo(2);
        eletronico1.setDescricao("Apple");
        eletronico1.setEstoque(2);
        eletronico1.setVoltagem(127);
        eletronico1.setFontedeEnergia("bivolt");

        Venda venda1 = new Venda();
        venda1.setNomeCliente("Matheus");
        venda1.setNotaFiscal(23);
        ArrayList<Produto> list1 = new ArrayList<>();
        list1.add(alimento1);
        list1.add(eletronico1);
        venda1.setProdutos(list1);

        System.out.println(venda1.toString());

    }
}
