package streamss;

import java.util.ArrayList;
import java.util.List;

public class Exemplos {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Mickael", "Konoha", 24));
        pessoas.add(new Pessoa("Cleber", "Sao paulo", 36));
        pessoas.add(new Pessoa("Julio", "Santos", 44));
        pessoas.add(new Pessoa("Kael", "NY", 17));
        pessoas.add(new Pessoa("Luis", "Tokyo", 28));

        // for(int i = 0; i < pessoas.size(); i++);

        pessoas.stream()
                .filter(pessoa -> pessoa.getAldeia()
                .equals("Ny"))
                .forEach(System.out::println);

        /*
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAldeia().equals("Ny")) {
        System.out.println(pessoa);
    }
}
         */
    }
}
