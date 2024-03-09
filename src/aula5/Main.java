package aula5;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Item("batata", 2.00));
        pedido.adicionarItem(new Item("frango", 10.00));
        pedido.adicionarItem(new Item("leite", 5.00));
        pedido.adicionarItem(new Item("cebola", 3.00));
        pedido.adicionarItem(new Item("alho", 7.00));

        Recibo.gerarRecibo(pedido);

        Pedido pedido2 = new PedidoComDesconto(0.1);

        pedido2.adicionarItem(new Item("batata", 2.00));
        pedido2.adicionarItem(new Item("frango", 10.00));
        pedido2.adicionarItem(new Item("leite", 5.00));
        pedido2.adicionarItem(new Item("cebola", 3.00));
        pedido2.adicionarItem(new Item("alho", 7.00));

        Recibo.gerarRecibo(pedido2);

    }
}
