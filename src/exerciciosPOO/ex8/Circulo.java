package exerciciosPOO.ex8;

public class Circulo implements FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}