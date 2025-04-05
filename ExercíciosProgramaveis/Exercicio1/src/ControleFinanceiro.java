import java.util.ArrayList;
import java.util.List;

public class ControleFinanceiro {
  private List<Venda> vendas;

  public ControleFinanceiro() {
    this.vendas = new ArrayList<>();
  }

  public void cadastrarVenda(double valorVenda) {
    Venda venda = new Venda(valorVenda);
    vendas.add(venda);
  }

  public double calcularTotalMulta() {
    double totalMulta = 0;
    for (Venda venda : vendas) {
      totalMulta += venda.getMulta();
    }
    return totalMulta;
  }

  public void mostrarVendas() {
    if (vendas.isEmpty()) {
      System.out.println("Nenhuma venda cadastrada.");
    } else {
      for (Venda venda : vendas) {
        System.out.println(venda);
      }
    }
  }

  public void consultarMulta() {
    double totalMulta = calcularTotalMulta();
    if (totalMulta > 0) {
      System.out.println("Total de multa a pagar: R$ " + totalMulta);
    } else {
      System.out.println("Não há multa a pagar.");
    }
  }
}
