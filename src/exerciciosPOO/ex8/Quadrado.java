package exerciciosPOO.ex8;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }
}