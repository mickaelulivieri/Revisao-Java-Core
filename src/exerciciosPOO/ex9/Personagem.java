package exerciciosPOO.ex9;

public class Personagem {
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Personagem outro) {
        if (outro.vida > 0) {
            outro.vida -= this.forca;
            if (outro.vida < 0) {
                outro.vida = 0;
            }
            System.out.println(this.nome + " atacou " + outro.nome + " causando " + this.forca + " de dano!");
        } else {
            System.out.println(outro.nome + " já está sem vida!");
        }
    }

    public void curar(int quantidade) {
        this.vida += quantidade;
        System.out.println(this.nome + " se curou em " + quantidade + " pontos de vida.");
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome + " | Vida: " + vida + " | Força: " + forca);
    }
}