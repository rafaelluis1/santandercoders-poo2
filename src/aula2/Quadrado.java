package aula2;

public class Quadrado implements Forma2D{

    private double base;

    public Quadrado (double base){
        this.base = base;
    }
    @Override
    public double area() {
        return this.base*this.base;
    }
}
