package exercicios.ex6;

class Gerente extends Funcionario {

    public Gerente(String nome, Double salarioAtual, Double salarioBase) {
        super(nome, salarioAtual, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioAtual = salarioBase * 1.5;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}