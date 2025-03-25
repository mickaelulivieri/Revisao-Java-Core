package exercicios.ex2;

/*
Crie uma classe ContaBancaria com atributos titular, saldo e número da conta. Adicione métodos para depositar, sacar e exibir o saldo.
Bônus: Garanta que não seja possível sacar um valor maior que o saldo disponível.
 */

public class ContaBancaria {

    //construtor

    public ContaBancaria(String titular, Double numeroConta, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // atributos
    private String titular;

    private Double saldo;

    private Double numeroConta;

    // getter e setter

    public String getTitular() {
        return titular;
    }

    public Double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Double numeroConta) {
        this.numeroConta = numeroConta;
    }


    // metodos

    public String depositar(Double saldo){
        this.saldo = this.saldo + saldo;
        return "Saldo alterado!";

    }

    public String sacarDinheiro(Double quantia) {

        if (quantia <= this.saldo) {
            saldo = this.saldo - quantia;
            return "Saldo alterado!";
        } else {
            return "Saldo insuficiente!";
        }
    }

        public String mostrarSaldo(){
            System.out.println("Saldo: " + this.saldo);
            return "Saldo alterado";
    }


}
