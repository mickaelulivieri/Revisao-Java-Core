package exercicios.ex5;

/*
Crie uma classe Retangulo com os atributos largura e altura. Adicione métodos para calcular a **área** e o **perímetro**.
Crie um metodo para verificar se o retângulo é um **quadrado**.
 */

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public boolean ehQuadrado() {
        return largura == altura;
    }

    public void exibirInformacoes() {
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("É um quadrado? " + (ehQuadrado() ? "Sim" : "Não"));
    }
}
