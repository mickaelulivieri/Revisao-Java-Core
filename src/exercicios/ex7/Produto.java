package exercicios.ex7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Produto {

    String nome;
    Double preco;
    Integer quantidadeEstoque;

    private static List<Produto> estoque = new ArrayList<>();

    public Produto(String nome, Integer quantidadeEstoque, Double preco) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public static String adicionarProduto(String nome, Double preco, Integer quantidadeEstoque) {
        Produto novoProduto = new Produto(nome, quantidadeEstoque, preco);
        estoque.add(novoProduto);
        return "Produto " + nome + " adicionado ao estoque!";
    }

    public static String removerProduto(String nome) {
        Iterator<Produto> iterator = estoque.iterator();
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            if (p.nome.equalsIgnoreCase(nome)) {
                iterator.remove();  // Remove de forma segura
                return "Produto " + nome + " removido do estoque.";
            }
        }
        return "Produto " + nome + " não encontrado no estoque.";
    }

    public static void exibirEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Produto p : estoque) {
                System.out.println("Produto: " + p.nome + " | Preço: " + p.preco + " | Quantidade: " + p.quantidadeEstoque);
            }
        }
    }
}