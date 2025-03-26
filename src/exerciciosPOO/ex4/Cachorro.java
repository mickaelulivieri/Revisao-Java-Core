package exerciciosPOO.ex4;

public class Cachorro extends Animal {

    private String nome;

    @Override
    public String fazerSom() {
        System.out.println("Auau!");
        return "O cachorro latiu!";

    }
}
