package Aula44A46.Exercicios.Ex01;

public class Circulo extends Figura2D implements DimensaoSuperficial{

    private double raio;

    public Circulo() {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" +
                "raio=" + raio + " area = " + calcularArea() +
                '}';
    }

    @Override
    public double calcularArea() {
        return (raio*raio)*Math.PI;
    }
}


