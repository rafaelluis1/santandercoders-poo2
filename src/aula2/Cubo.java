package aula2;

public class Cubo implements Forma3D{
    private double base;

    public Cubo(double base){
        this.base = base;
    }
    @Override
    public double volume(){
        return Math.pow(this.base, 3);
    }
    @Override
    public double area(){
        return Math.pow(this.base, 2) * 6;
    }
}
