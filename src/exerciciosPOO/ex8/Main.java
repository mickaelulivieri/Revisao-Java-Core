package exerciciosPOO.ex8;

public class Main {
    public static void main(String[] args) {


        FiguraGeometrica circulo = new Circulo(5);

        FiguraGeometrica quadrado = new Quadrado(4);

        System.out.println("Área do Círculo: " + circulo.calcularArea());

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());

    }
}