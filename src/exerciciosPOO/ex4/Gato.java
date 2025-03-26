package exerciciosPOO.ex4;

public class Gato extends Animal {

    private String nome;

    @Override
    public String fazerSom() {
        System.out.println( "Miau! ");
        return "O gato miou!";
    }
}
