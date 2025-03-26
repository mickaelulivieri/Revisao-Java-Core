package exerciciosPOO.ex6;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, Double salarioAtual, Double salarioBase) {
        super(nome, salarioAtual, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }
}
