package aula5;
import java.util.*;

public class Pedido {
    protected List<Item> itens = new ArrayList<>();
    public void adicionarItem (Item item) {
        this.itens.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for(Item item: itens){
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }
    public String listarItens() {
        String lista = " ";
        for(Item item: itens){
            lista += item.toString();
        }
        return lista;
    }

}