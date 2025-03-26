package exerciciosPOO.ex6;

public class Funcionario {
    protected String nome;
    protected Double salarioBase;
    protected Double salarioAtual;

    public Funcionario(String nome, Double salarioAtual, Double salarioBase) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salarioAtual);
    }
}
