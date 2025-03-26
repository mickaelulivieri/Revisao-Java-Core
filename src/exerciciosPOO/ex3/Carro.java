package exerciciosPOO.ex3;
/*
Classe Carro Crie uma classe Carro com atributos marca, modelo, ano e velocidadeAtual.
Adicione métodos para acelerar, frear e exibir a velocidade atual.
*/

public class Carro {

    // atributos

    String marca;

    String modelo;

    Integer ano;

    Double velocidadeInicial = 0.0;

    Double velocidadeAtual = 0.0;

    //construtor

    public Carro(String marca, Double velocidadeInicial, Integer ano, String modelo) {
        this.marca = marca;
        this.velocidadeInicial = velocidadeInicial;
        this.ano = ano;
        this.modelo = modelo;
    }


    // getter setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    // metodos

    public String acelerar() {
        this.velocidadeAtual = velocidadeAtual + 10;
        return "O " + this.modelo + " acelerou!";
    }

    public String frear() {
        if (velocidadeAtual < 0) {
            this.velocidadeAtual = 0.0;
        } else {
            this.velocidadeAtual = velocidadeAtual - 10;
        }
        return "O " + this.modelo + " freiou!";
    }

    public String exibirVelocidade(){
        return "O "+ this.modelo + "carro está a " + this.velocidadeAtual + "Km/h";
    }
}

