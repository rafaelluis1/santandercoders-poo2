package aula2;

public class Retangulo implements Forma2D{

    private double base;
    private double altura;

    public Retangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area(){
        return this.base*this.altura;
    }
}
