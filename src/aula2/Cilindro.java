package aula2;

public class Cilindro implements Forma3D{
    private double raioDaBase;
    private double altura;

    public Cilindro(double raioDaBase, double altura){
        this.raioDaBase = raioDaBase;
        this.altura = altura;
    }
    @Override
    public double area() {
        return Math.PI * this.raioDaBase * (this.raioDaBase + 2*this.altura);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(this.raioDaBase,2) * this.altura;
    }
}
