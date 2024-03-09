package aula2;

public class Esfera implements Forma3D{
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(this.raio,3)/3;
    }

    @Override
    public double volume() {
        return 4 * Math.PI * Math.pow(this.raio,2);
    }
}
