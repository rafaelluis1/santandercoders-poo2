package aula5;

public class Recibo {

    public static void gerarRecibo(Pedido pedido){
        System.out.println(pedido.listarItens());
        System.out.println("Valor total: " + pedido.calcularValorTotal());
    }

}
