package streamss;

import java.util.ArrayList;
import java.util.List;

public class Exemplos {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Mickael", "Konoha", 24));
        pessoas.add(new Pessoa("Cleber", "Sao Paulo", 36));
        pessoas.add(new Pessoa("Julio", "Santos", 44));
        pessoas.add(new Pessoa("Kael", "NY", 17));
        pessoas.add(new Pessoa("Luis", "Tokyo", 28));

        // Usando Stream para filtrar e exibir apenas pessoas da aldeia "NY"
        pessoas.stream()
                .sorted() // Ordena a lista de pessoas (usa a ordem natural de Pessoa, se implementado Comparable)
                .filter(pessoa -> pessoa.getAldeia().equals("NY"))
                .forEach(System.out::println);

        // Ordenação por idade (do menor para o maior)
        pessoas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        // Ordenação por nome (corrigido)
        pessoas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome())) // Corrigido o fechamento
                .forEach(System.out::println); // Corrigido "sout" para System.out::println

        // Usando iteração (for-each) para o mesmo resultado da filtragem
        /*
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAldeia().equals("NY")) {
                System.out.println(pessoa);
            }
        }
        */
    }
}