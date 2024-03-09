package aula2;

public class Circulo implements Forma2D{
    private double diametro;

    public Circulo(double diametro){
        this.diametro = diametro;
    }

    @Override
    public double area() {
        return Math.PI * this.diametro * this.diametro;
    }
}
