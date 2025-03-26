package exerciciosPOO.ex1;

/*
Crie uma classe Pessoa com os atributos
nome, idade e profissão. Adicione métodos para definir e obter os valores desses atributos
e um metodo exibirDados() que imprime as informações da pessoa.
*/

public class Pessoa {

    // atributos

    private String nome;

    private String profissao;

    private Integer idade;

    //getter setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    //Override do toString pra mostrar as infos

    @Override
    public String toString() {
        return "Detalhes dessa pessoa: " +
                "Meu nome é ='" + nome + '\'' +
                ", minha profissao é='" + profissao + '\'' +
                ", tenho=" + idade +
                " anos de idade";
    }
}
