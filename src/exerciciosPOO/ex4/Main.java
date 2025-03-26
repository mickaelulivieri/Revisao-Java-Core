package exercicios.ex4;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();

        Gato cat = new Gato();

        System.out.println("Late, cachorro!");
        dog.fazerSom();

        System.out.println("Mia, gato!");
        cat.fazerSom();
    }
}
