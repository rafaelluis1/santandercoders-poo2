package aula5;

public class PedidoComDesconto extends Pedido{

    private double desconto;

    public PedidoComDesconto(double desconto){
        this.desconto = desconto;
    }
    @Override
    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item item: itens){
            valorTotal += item.getPreco();
        }
        return valorTotal*(1-desconto);
    }
}
