package aula5;

public class Item {
    private String nome;
    private double preco;
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }

    public String toString(){
        return getNome() + " " + getPreco() + "\n";
    }
}
