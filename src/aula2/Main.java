package aula2;
import java.util.ArrayList;

public class Main {
    public static double calculaAreas(ArrayList<Forma2D> formas){
        double areaTotal = 0.0;
        for(Forma2D forma : formas){
            areaTotal += forma.area();
        }
        return areaTotal;
    }

    public static double calculaVolumes(ArrayList<Forma3D> formas){
        double volumeTotal = 0.0;
        for(Forma3D forma : formas){
            volumeTotal += forma.volume();
        }
        return volumeTotal;
    }

    public static void main(String[] args) {


        ArrayList<Forma2D> formas = new ArrayList<>();
        ArrayList<Forma3D> formas3D = new ArrayList<>();

        formas.add(new Quadrado(5.0));
        formas.add( new Retangulo(2.0,5.0));
        formas.add(new Circulo(5.0));


        Forma3D cilindro = new Cilindro(1.0, 1.0);
        Forma3D esfera = new Esfera(5.0);
        Forma3D cubo = new Cubo(5.0);

        formas3D.add(cilindro);
        formas3D.add(cubo);
        formas3D.add(esfera);

        formas.add(cilindro);
        formas.add(cubo);
        formas.add(esfera);

        System.out.println(calculaAreas(formas));
        System.out.println(calculaVolumes(formas3D));

    }
}
